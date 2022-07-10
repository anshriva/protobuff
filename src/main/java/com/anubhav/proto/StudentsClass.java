// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.anubhav.proto;

/**
 * Protobuf type {@code StudentsClass}
 */
public final class StudentsClass extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StudentsClass)
    StudentsClassOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentsClass.newBuilder() to construct.
  private StudentsClass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentsClass() {
    students_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentsClass();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentsClass(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              students_ = new java.util.ArrayList<com.anubhav.proto.Student>();
              mutable_bitField0_ |= 0x00000001;
            }
            students_.add(
                input.readMessage(com.anubhav.proto.Student.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        students_ = java.util.Collections.unmodifiableList(students_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anubhav.proto.StudentOuterClass.internal_static_StudentsClass_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anubhav.proto.StudentOuterClass.internal_static_StudentsClass_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anubhav.proto.StudentsClass.class, com.anubhav.proto.StudentsClass.Builder.class);
  }

  public static final int STUDENTS_FIELD_NUMBER = 1;
  private java.util.List<com.anubhav.proto.Student> students_;
  /**
   * <code>repeated .Student students = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.anubhav.proto.Student> getStudentsList() {
    return students_;
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anubhav.proto.StudentOrBuilder> 
      getStudentsOrBuilderList() {
    return students_;
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  @java.lang.Override
  public int getStudentsCount() {
    return students_.size();
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  @java.lang.Override
  public com.anubhav.proto.Student getStudents(int index) {
    return students_.get(index);
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  @java.lang.Override
  public com.anubhav.proto.StudentOrBuilder getStudentsOrBuilder(
      int index) {
    return students_.get(index);
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
    for (int i = 0; i < students_.size(); i++) {
      output.writeMessage(1, students_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < students_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, students_.get(i));
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
    if (!(obj instanceof com.anubhav.proto.StudentsClass)) {
      return super.equals(obj);
    }
    com.anubhav.proto.StudentsClass other = (com.anubhav.proto.StudentsClass) obj;

    if (!getStudentsList()
        .equals(other.getStudentsList())) return false;
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
    if (getStudentsCount() > 0) {
      hash = (37 * hash) + STUDENTS_FIELD_NUMBER;
      hash = (53 * hash) + getStudentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anubhav.proto.StudentsClass parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anubhav.proto.StudentsClass parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anubhav.proto.StudentsClass parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anubhav.proto.StudentsClass parseFrom(
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
  public static Builder newBuilder(com.anubhav.proto.StudentsClass prototype) {
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
   * Protobuf type {@code StudentsClass}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StudentsClass)
      com.anubhav.proto.StudentsClassOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anubhav.proto.StudentOuterClass.internal_static_StudentsClass_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anubhav.proto.StudentOuterClass.internal_static_StudentsClass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anubhav.proto.StudentsClass.class, com.anubhav.proto.StudentsClass.Builder.class);
    }

    // Construct using com.anubhav.proto.StudentsClass.newBuilder()
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
        getStudentsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (studentsBuilder_ == null) {
        students_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        studentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anubhav.proto.StudentOuterClass.internal_static_StudentsClass_descriptor;
    }

    @java.lang.Override
    public com.anubhav.proto.StudentsClass getDefaultInstanceForType() {
      return com.anubhav.proto.StudentsClass.getDefaultInstance();
    }

    @java.lang.Override
    public com.anubhav.proto.StudentsClass build() {
      com.anubhav.proto.StudentsClass result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anubhav.proto.StudentsClass buildPartial() {
      com.anubhav.proto.StudentsClass result = new com.anubhav.proto.StudentsClass(this);
      int from_bitField0_ = bitField0_;
      if (studentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          students_ = java.util.Collections.unmodifiableList(students_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.students_ = students_;
      } else {
        result.students_ = studentsBuilder_.build();
      }
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
      if (other instanceof com.anubhav.proto.StudentsClass) {
        return mergeFrom((com.anubhav.proto.StudentsClass)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anubhav.proto.StudentsClass other) {
      if (other == com.anubhav.proto.StudentsClass.getDefaultInstance()) return this;
      if (studentsBuilder_ == null) {
        if (!other.students_.isEmpty()) {
          if (students_.isEmpty()) {
            students_ = other.students_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentsIsMutable();
            students_.addAll(other.students_);
          }
          onChanged();
        }
      } else {
        if (!other.students_.isEmpty()) {
          if (studentsBuilder_.isEmpty()) {
            studentsBuilder_.dispose();
            studentsBuilder_ = null;
            students_ = other.students_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentsFieldBuilder() : null;
          } else {
            studentsBuilder_.addAllMessages(other.students_);
          }
        }
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
      com.anubhav.proto.StudentsClass parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.anubhav.proto.StudentsClass) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.anubhav.proto.Student> students_ =
      java.util.Collections.emptyList();
    private void ensureStudentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        students_ = new java.util.ArrayList<com.anubhav.proto.Student>(students_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anubhav.proto.Student, com.anubhav.proto.Student.Builder, com.anubhav.proto.StudentOrBuilder> studentsBuilder_;

    /**
     * <code>repeated .Student students = 1;</code>
     */
    public java.util.List<com.anubhav.proto.Student> getStudentsList() {
      if (studentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(students_);
      } else {
        return studentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public int getStudentsCount() {
      if (studentsBuilder_ == null) {
        return students_.size();
      } else {
        return studentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public com.anubhav.proto.Student getStudents(int index) {
      if (studentsBuilder_ == null) {
        return students_.get(index);
      } else {
        return studentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder setStudents(
        int index, com.anubhav.proto.Student value) {
      if (studentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsIsMutable();
        students_.set(index, value);
        onChanged();
      } else {
        studentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder setStudents(
        int index, com.anubhav.proto.Student.Builder builderForValue) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(com.anubhav.proto.Student value) {
      if (studentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsIsMutable();
        students_.add(value);
        onChanged();
      } else {
        studentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(
        int index, com.anubhav.proto.Student value) {
      if (studentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsIsMutable();
        students_.add(index, value);
        onChanged();
      } else {
        studentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(
        com.anubhav.proto.Student.Builder builderForValue) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.add(builderForValue.build());
        onChanged();
      } else {
        studentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(
        int index, com.anubhav.proto.Student.Builder builderForValue) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addAllStudents(
        java.lang.Iterable<? extends com.anubhav.proto.Student> values) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, students_);
        onChanged();
      } else {
        studentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder clearStudents() {
      if (studentsBuilder_ == null) {
        students_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder removeStudents(int index) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.remove(index);
        onChanged();
      } else {
        studentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public com.anubhav.proto.Student.Builder getStudentsBuilder(
        int index) {
      return getStudentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public com.anubhav.proto.StudentOrBuilder getStudentsOrBuilder(
        int index) {
      if (studentsBuilder_ == null) {
        return students_.get(index);  } else {
        return studentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public java.util.List<? extends com.anubhav.proto.StudentOrBuilder> 
         getStudentsOrBuilderList() {
      if (studentsBuilder_ != null) {
        return studentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(students_);
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public com.anubhav.proto.Student.Builder addStudentsBuilder() {
      return getStudentsFieldBuilder().addBuilder(
          com.anubhav.proto.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public com.anubhav.proto.Student.Builder addStudentsBuilder(
        int index) {
      return getStudentsFieldBuilder().addBuilder(
          index, com.anubhav.proto.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public java.util.List<com.anubhav.proto.Student.Builder> 
         getStudentsBuilderList() {
      return getStudentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anubhav.proto.Student, com.anubhav.proto.Student.Builder, com.anubhav.proto.StudentOrBuilder> 
        getStudentsFieldBuilder() {
      if (studentsBuilder_ == null) {
        studentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anubhav.proto.Student, com.anubhav.proto.Student.Builder, com.anubhav.proto.StudentOrBuilder>(
                students_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        students_ = null;
      }
      return studentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:StudentsClass)
  }

  // @@protoc_insertion_point(class_scope:StudentsClass)
  private static final com.anubhav.proto.StudentsClass DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anubhav.proto.StudentsClass();
  }

  public static com.anubhav.proto.StudentsClass getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentsClass>
      PARSER = new com.google.protobuf.AbstractParser<StudentsClass>() {
    @java.lang.Override
    public StudentsClass parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentsClass(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentsClass> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentsClass> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anubhav.proto.StudentsClass getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

