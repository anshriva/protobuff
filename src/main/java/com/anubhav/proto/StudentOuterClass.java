// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.anubhav.proto;

public final class StudentOuterClass {
  private StudentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentsClass_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentsClass_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\"+\n\rStudentsClass\022\032\n\010stud" +
      "ents\030\001 \003(\0132\010.Student\"$\n\007Student\022\014\n\004name\030" +
      "\001 \001(\t\022\013\n\003age\030\002 \001(\005B\025\n\021com.anubhav.protoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StudentsClass_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StudentsClass_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentsClass_descriptor,
        new java.lang.String[] { "Students", });
    internal_static_Student_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_descriptor,
        new java.lang.String[] { "Name", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
