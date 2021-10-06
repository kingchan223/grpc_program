package com.example.grpc.client;

import com.example.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.sql.DataSource;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MyGrpcClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=10;
        while(n!=7){
            printMenu(channel);
            n = Integer.parseInt(br.readLine());
            System.out.println(ClientProperties.LINE);
            switch(n){
                case 1:
                    printStudent(channel);
                    break;
                case 2:
                    printCouse(channel);
                    break;
                case 3:
                    addStudent(channel);

                    break;
                case 4:
                    addCourse(channel);
                    break;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("없는 번호를 입력하셨습니다.");
                    break;

            }
            System.out.println(ClientProperties.LINE);
        }
    }

    private static void addCourse(ManagedChannel channel) throws IOException {
        StudentCourseRegistrationSystemGrpc.StudentCourseRegistrationSystemBlockingStub stub = StudentCourseRegistrationSystemGrpc.newBlockingStub(channel);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ID를 입력하세요:");
        String id = br.readLine().trim();
        System.out.println("강좌명을 입력하세요:");
        String name = br.readLine().trim();
        String profName = "담당 교수를 입력하세요:";
        System.out.println(profName);
        br.readLine().trim();
        System.out.println("선수과목의 ID를 입력하세요 ('/'로 구분. 예시:1010 1011) :");
        String[] preCourseList = br.readLine().trim().split("/");
        Map<Integer, String> preCourseMap = new HashMap<>();
        int i=0;
        for (String preCourse : preCourseList) {
            preCourseMap.put(i++,preCourse);
        }
        Message message = stub.addCourse(Course.newBuilder().setId(id).setName(name).setProfName(profName).build());
        System.out.println(id);
        System.out.println(name);
        System.out.println(profName);
        System.out.println(preCourseList[0]);
        System.out.println(preCourseList[1]);

        System.out.println(message);
    }

    private static void addStudent(ManagedChannel channel) {

    }

    private static void printCouse(ManagedChannel channel) {
        StudentCourseRegistrationSystemGrpc.StudentCourseRegistrationSystemBlockingStub stub = StudentCourseRegistrationSystemGrpc.newBlockingStub(channel);
        CourseListResponse response = stub.printCourseList(Request.newBuilder().setRequest(1).build());
        Map<Integer, String> courseListMap = response.getCourseListMap();
        for (Integer i : courseListMap.keySet()) {
            System.out.println(courseListMap.get(i));
        }
    }

    private static void printStudent(ManagedChannel channel) {
        StudentCourseRegistrationSystemGrpc.StudentCourseRegistrationSystemBlockingStub stub = StudentCourseRegistrationSystemGrpc.newBlockingStub(channel);
        StudentListResponse response = stub.printStudentList(Request.newBuilder().setRequest(1).build());
        Map<Integer, String> studentListMap = response.getStudentListMap();
        for (Integer i : studentListMap.keySet()) {
            System.out.println(studentListMap.get(i));
        }
    }

    private static void printMenu(ManagedChannel channel) {
        StudentCourseRegistrationSystemGrpc.StudentCourseRegistrationSystemBlockingStub stub = StudentCourseRegistrationSystemGrpc.newBlockingStub(channel);
        PrintMenuResponse response = stub.printMenu(PrintMenuRequest.newBuilder().setRequest("1").build());
        Map<Integer, String> menuListMap = response.getMenuListMap();
        for (Integer i : menuListMap.keySet()) {
            System.out.println(menuListMap.get(i));
        }
    }
}
