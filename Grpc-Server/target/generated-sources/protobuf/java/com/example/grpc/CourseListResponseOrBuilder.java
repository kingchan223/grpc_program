// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleService.proto

package com.example.grpc;

public interface CourseListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.CourseListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, string&gt; courseList = 1;</code>
   */
  int getCourseListCount();
  /**
   * <code>map&lt;int32, string&gt; courseList = 1;</code>
   */
  boolean containsCourseList(
      int key);
  /**
   * Use {@link #getCourseListMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.String>
  getCourseList();
  /**
   * <code>map&lt;int32, string&gt; courseList = 1;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.String>
  getCourseListMap();
  /**
   * <code>map&lt;int32, string&gt; courseList = 1;</code>
   */

  java.lang.String getCourseListOrDefault(
      int key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;int32, string&gt; courseList = 1;</code>
   */

  java.lang.String getCourseListOrThrow(
      int key);
}
