// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto

package com.zpb.protobuf.test.demo;

public interface DemoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zpb.protobuf.proto.demo.Demo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *自身属性
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string address = 4;</code>
   * @return The address.
   */
  String getAddress();
  /**
   * <code>string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
