// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

// Protobuf Java Version: 3.25.5
package com.example.routeguide;

public interface RouteNoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RouteNote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Point location = 1;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <code>.Point location = 1;</code>
   * @return The location.
   */
  com.example.routeguide.Point getLocation();
  /**
   * <code>.Point location = 1;</code>
   */
  com.example.routeguide.PointOrBuilder getLocationOrBuilder();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
