// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driver_connection.proto

// Protobuf Java Version: 3.25.5
package com.example.grpcConnection;

public final class DriverConnection {
  private DriverConnection() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommandRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommandRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommandExecutionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommandExecutionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReplicateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReplicateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReplicateResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReplicateResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Oplog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Oplog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027driver_connection.proto\"!\n\016CommandRequ" +
      "est\022\017\n\007command\030\001 \001(\t\"9\n\026CommandExecution" +
      "Result\022\022\n\nstatusCode\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\"" +
      "9\n\020ReplicateRequest\022\013\n\003msg\030\001 \001(\t\022\030\n\020last" +
      "OplogApplied\030\002 \001(\t\")\n\017ReplicateResult\022\026\n" +
      "\006oplogs\030\001 \003(\0132\006.Oplog\")\n\005Oplog\022\017\n\007comman" +
      "d\030\001 \001(\t\022\017\n\007oplogId\030\002 \001(\t2\222\001\n\021MongoDBConn" +
      "ection\022@\n\016ExecuteCommand\022\017.CommandReques" +
      "t\032\027.CommandExecutionResult\"\000(\0010\001\022;\n\016Repl" +
      "icateOplog\022\021.ReplicateRequest\032\020.Replicat" +
      "eResult\"\000(\0010\001B\036\n\032com.example.grpcConnect" +
      "ionP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CommandRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CommandRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommandRequest_descriptor,
        new java.lang.String[] { "Command", });
    internal_static_CommandExecutionResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CommandExecutionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommandExecutionResult_descriptor,
        new java.lang.String[] { "StatusCode", "Msg", });
    internal_static_ReplicateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ReplicateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReplicateRequest_descriptor,
        new java.lang.String[] { "Msg", "LastOplogApplied", });
    internal_static_ReplicateResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ReplicateResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReplicateResult_descriptor,
        new java.lang.String[] { "Oplogs", });
    internal_static_Oplog_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Oplog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Oplog_descriptor,
        new java.lang.String[] { "Command", "OplogId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
