// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.zpb.protobuf.test.user;

public interface UserMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zpb.protobuf.proto.user.UserMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * map 对象
   * </pre>
   *
   * <code>map&lt;int64, .com.zpb.protobuf.proto.user.UserMapPO&gt; userMap = 8;</code>
   */
  int getUserMapCount();
  /**
   * <pre>
   * map 对象
   * </pre>
   *
   * <code>map&lt;int64, .com.zpb.protobuf.proto.user.UserMapPO&gt; userMap = 8;</code>
   */
  boolean containsUserMap(
      long key);
  /**
   * Use {@link #getUserMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.zpb.protobuf.test.user.UserMapPO>
  getUserMap();
  /**
   * <pre>
   * map 对象
   * </pre>
   *
   * <code>map&lt;int64, .com.zpb.protobuf.proto.user.UserMapPO&gt; userMap = 8;</code>
   */
  java.util.Map<java.lang.Long, com.zpb.protobuf.test.user.UserMapPO>
  getUserMapMap();
  /**
   * <pre>
   * map 对象
   * </pre>
   *
   * <code>map&lt;int64, .com.zpb.protobuf.proto.user.UserMapPO&gt; userMap = 8;</code>
   */

  com.zpb.protobuf.test.user.UserMapPO getUserMapOrDefault(
      long key,
      com.zpb.protobuf.test.user.UserMapPO defaultValue);
  /**
   * <pre>
   * map 对象
   * </pre>
   *
   * <code>map&lt;int64, .com.zpb.protobuf.proto.user.UserMapPO&gt; userMap = 8;</code>
   */

  com.zpb.protobuf.test.user.UserMapPO getUserMapOrThrow(
      long key);
}