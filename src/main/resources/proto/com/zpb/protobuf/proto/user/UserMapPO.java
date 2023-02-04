// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.zpb.protobuf.test.user;

/**
 * Protobuf type {@code com.zpb.protobuf.proto.user.UserMapPO}
 */
public final class UserMapPO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.zpb.protobuf.proto.user.UserMapPO)
    UserMapPOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserMapPO.newBuilder() to construct.
  private UserMapPO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserMapPO() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserMapPO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserMapPO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 58: {
            com.zpb.protobuf.test.user.User.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.zpb.protobuf.test.user.User.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.zpb.protobuf.test.user.UserOutClass.internal_static_com_zpb_protobuf_proto_user_UserMapPO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zpb.protobuf.test.user.UserOutClass.internal_static_com_zpb_protobuf_proto_user_UserMapPO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zpb.protobuf.test.user.UserMapPO.class, com.zpb.protobuf.test.user.UserMapPO.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int USER_FIELD_NUMBER = 7;
  private com.zpb.protobuf.test.user.User user_;
  /**
   * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
   * @return The user.
   */
  @java.lang.Override
  public com.zpb.protobuf.test.user.User getUser() {
    return user_ == null ? com.zpb.protobuf.test.user.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
   */
  @java.lang.Override
  public com.zpb.protobuf.test.user.UserOrBuilder getUserOrBuilder() {
    return getUser();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (user_ != null) {
      output.writeMessage(7, getUser());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getUser());
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
    if (!(obj instanceof com.zpb.protobuf.test.user.UserMapPO)) {
      return super.equals(obj);
    }
    com.zpb.protobuf.test.user.UserMapPO other = (com.zpb.protobuf.test.user.UserMapPO) obj;

    if (getId()
        != other.getId()) return false;
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zpb.protobuf.test.user.UserMapPO parseFrom(
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
  public static Builder newBuilder(com.zpb.protobuf.test.user.UserMapPO prototype) {
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
   * Protobuf type {@code com.zpb.protobuf.proto.user.UserMapPO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.zpb.protobuf.proto.user.UserMapPO)
      com.zpb.protobuf.test.user.UserMapPOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zpb.protobuf.test.user.UserOutClass.internal_static_com_zpb_protobuf_proto_user_UserMapPO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zpb.protobuf.test.user.UserOutClass.internal_static_com_zpb_protobuf_proto_user_UserMapPO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zpb.protobuf.test.user.UserMapPO.class, com.zpb.protobuf.test.user.UserMapPO.Builder.class);
    }

    // Construct using com.zpb.protobuf.proto.user.UserMapPO.newBuilder()
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
      id_ = 0L;

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zpb.protobuf.test.user.UserOutClass.internal_static_com_zpb_protobuf_proto_user_UserMapPO_descriptor;
    }

    @java.lang.Override
    public com.zpb.protobuf.test.user.UserMapPO getDefaultInstanceForType() {
      return com.zpb.protobuf.test.user.UserMapPO.getDefaultInstance();
    }

    @java.lang.Override
    public com.zpb.protobuf.test.user.UserMapPO build() {
      com.zpb.protobuf.test.user.UserMapPO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zpb.protobuf.test.user.UserMapPO buildPartial() {
      com.zpb.protobuf.test.user.UserMapPO result = new com.zpb.protobuf.test.user.UserMapPO(this);
      result.id_ = id_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
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
      if (other instanceof com.zpb.protobuf.test.user.UserMapPO) {
        return mergeFrom((com.zpb.protobuf.test.user.UserMapPO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zpb.protobuf.test.user.UserMapPO other) {
      if (other == com.zpb.protobuf.test.user.UserMapPO.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
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
      com.zpb.protobuf.test.user.UserMapPO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zpb.protobuf.test.user.UserMapPO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.zpb.protobuf.test.user.User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zpb.protobuf.test.user.User, com.zpb.protobuf.test.user.User.Builder, com.zpb.protobuf.test.user.UserOrBuilder> userBuilder_;
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     * @return The user.
     */
    public com.zpb.protobuf.test.user.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.zpb.protobuf.test.user.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    public Builder setUser(com.zpb.protobuf.test.user.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    public Builder setUser(
        com.zpb.protobuf.test.user.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    public Builder mergeUser(com.zpb.protobuf.test.user.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.zpb.protobuf.test.user.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    public com.zpb.protobuf.test.user.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    public com.zpb.protobuf.test.user.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.zpb.protobuf.test.user.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.com.zpb.protobuf.proto.user.User user = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zpb.protobuf.test.user.User, com.zpb.protobuf.test.user.User.Builder, com.zpb.protobuf.test.user.UserOrBuilder>
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zpb.protobuf.test.user.User, com.zpb.protobuf.test.user.User.Builder, com.zpb.protobuf.test.user.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.zpb.protobuf.proto.user.UserMapPO)
  }

  // @@protoc_insertion_point(class_scope:com.zpb.protobuf.proto.user.UserMapPO)
  private static final com.zpb.protobuf.test.user.UserMapPO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zpb.protobuf.test.user.UserMapPO();
  }

  public static com.zpb.protobuf.test.user.UserMapPO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserMapPO>
      PARSER = new com.google.protobuf.AbstractParser<UserMapPO>() {
    @java.lang.Override
    public UserMapPO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserMapPO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserMapPO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserMapPO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zpb.protobuf.test.user.UserMapPO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
