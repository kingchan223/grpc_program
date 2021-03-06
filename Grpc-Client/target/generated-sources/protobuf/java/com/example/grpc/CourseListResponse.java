// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleService.proto

package com.example.grpc;

/**
 * Protobuf type {@code com.example.grpc.CourseListResponse}
 */
public final class CourseListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.CourseListResponse)
    CourseListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CourseListResponse.newBuilder() to construct.
  private CourseListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CourseListResponse() {
    courseList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CourseListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CourseListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              courseList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            courseList_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        courseList_ = courseList_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.ExampleService.internal_static_com_example_grpc_CourseListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.ExampleService.internal_static_com_example_grpc_CourseListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.CourseListResponse.class, com.example.grpc.CourseListResponse.Builder.class);
  }

  public static final int COURSELIST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList courseList_;
  /**
   * <code>repeated string courseList = 1;</code>
   * @return A list containing the courseList.
   */
  public com.google.protobuf.ProtocolStringList
      getCourseListList() {
    return courseList_;
  }
  /**
   * <code>repeated string courseList = 1;</code>
   * @return The count of courseList.
   */
  public int getCourseListCount() {
    return courseList_.size();
  }
  /**
   * <code>repeated string courseList = 1;</code>
   * @param index The index of the element to return.
   * @return The courseList at the given index.
   */
  public java.lang.String getCourseList(int index) {
    return courseList_.get(index);
  }
  /**
   * <code>repeated string courseList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the courseList at the given index.
   */
  public com.google.protobuf.ByteString
      getCourseListBytes(int index) {
    return courseList_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < courseList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, courseList_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < courseList_.size(); i++) {
        dataSize += computeStringSizeNoTag(courseList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCourseListList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.CourseListResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.CourseListResponse other = (com.example.grpc.CourseListResponse) obj;

    if (!getCourseListList()
        .equals(other.getCourseListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCourseListCount() > 0) {
      hash = (37 * hash) + COURSELIST_FIELD_NUMBER;
      hash = (53 * hash) + getCourseListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.CourseListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.CourseListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.CourseListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.CourseListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.CourseListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.CourseListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.CourseListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.grpc.CourseListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.CourseListResponse)
      com.example.grpc.CourseListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.ExampleService.internal_static_com_example_grpc_CourseListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.ExampleService.internal_static_com_example_grpc_CourseListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.CourseListResponse.class, com.example.grpc.CourseListResponse.Builder.class);
    }

    // Construct using com.example.grpc.CourseListResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      courseList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.ExampleService.internal_static_com_example_grpc_CourseListResponse_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.CourseListResponse getDefaultInstanceForType() {
      return com.example.grpc.CourseListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.CourseListResponse build() {
      com.example.grpc.CourseListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.CourseListResponse buildPartial() {
      com.example.grpc.CourseListResponse result = new com.example.grpc.CourseListResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        courseList_ = courseList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.courseList_ = courseList_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.CourseListResponse) {
        return mergeFrom((com.example.grpc.CourseListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.CourseListResponse other) {
      if (other == com.example.grpc.CourseListResponse.getDefaultInstance()) return this;
      if (!other.courseList_.isEmpty()) {
        if (courseList_.isEmpty()) {
          courseList_ = other.courseList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCourseListIsMutable();
          courseList_.addAll(other.courseList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.CourseListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.CourseListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList courseList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCourseListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        courseList_ = new com.google.protobuf.LazyStringArrayList(courseList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @return A list containing the courseList.
     */
    public com.google.protobuf.ProtocolStringList
        getCourseListList() {
      return courseList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @return The count of courseList.
     */
    public int getCourseListCount() {
      return courseList_.size();
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @param index The index of the element to return.
     * @return The courseList at the given index.
     */
    public java.lang.String getCourseList(int index) {
      return courseList_.get(index);
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the courseList at the given index.
     */
    public com.google.protobuf.ByteString
        getCourseListBytes(int index) {
      return courseList_.getByteString(index);
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @param index The index to set the value at.
     * @param value The courseList to set.
     * @return This builder for chaining.
     */
    public Builder setCourseList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCourseListIsMutable();
      courseList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @param value The courseList to add.
     * @return This builder for chaining.
     */
    public Builder addCourseList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCourseListIsMutable();
      courseList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @param values The courseList to add.
     * @return This builder for chaining.
     */
    public Builder addAllCourseList(
        java.lang.Iterable<java.lang.String> values) {
      ensureCourseListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, courseList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCourseList() {
      courseList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string courseList = 1;</code>
     * @param value The bytes of the courseList to add.
     * @return This builder for chaining.
     */
    public Builder addCourseListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCourseListIsMutable();
      courseList_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.CourseListResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.CourseListResponse)
  private static final com.example.grpc.CourseListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.CourseListResponse();
  }

  public static com.example.grpc.CourseListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CourseListResponse>
      PARSER = new com.google.protobuf.AbstractParser<CourseListResponse>() {
    @java.lang.Override
    public CourseListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CourseListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CourseListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CourseListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.CourseListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

