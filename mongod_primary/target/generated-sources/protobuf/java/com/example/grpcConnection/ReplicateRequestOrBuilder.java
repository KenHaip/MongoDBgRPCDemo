// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: driver_connection.proto

// Protobuf Java Version: 3.25.5
package com.example.grpcConnection;

public interface ReplicateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReplicateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string msg = 1;</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 1;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>string lastOplogApplied = 2;</code>
   * @return The lastOplogApplied.
   */
  java.lang.String getLastOplogApplied();
  /**
   * <code>string lastOplogApplied = 2;</code>
   * @return The bytes for lastOplogApplied.
   */
  com.google.protobuf.ByteString
      getLastOplogAppliedBytes();
}
