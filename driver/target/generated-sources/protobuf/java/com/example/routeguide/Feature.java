// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

// Protobuf Java Version: 3.25.5
package com.example.routeguide;

/**
 * Protobuf type {@code Feature}
 */
public final class Feature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Feature)
    FeatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Feature.newBuilder() to construct.
  private Feature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Feature() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Feature();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.routeguide.RouteGuideOuterClass.internal_static_Feature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.routeguide.RouteGuideOuterClass.internal_static_Feature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.routeguide.Feature.class, com.example.routeguide.Feature.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of the feature.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the feature.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private com.example.routeguide.Point location_;
  /**
   * <pre>
   * The point where the feature is detected.
   * </pre>
   *
   * <code>.Point location = 2;</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The point where the feature is detected.
   * </pre>
   *
   * <code>.Point location = 2;</code>
   * @return The location.
   */
  @java.lang.Override
  public com.example.routeguide.Point getLocation() {
    return location_ == null ? com.example.routeguide.Point.getDefaultInstance() : location_;
  }
  /**
   * <pre>
   * The point where the feature is detected.
   * </pre>
   *
   * <code>.Point location = 2;</code>
   */
  @java.lang.Override
  public com.example.routeguide.PointOrBuilder getLocationOrBuilder() {
    return location_ == null ? com.example.routeguide.Point.getDefaultInstance() : location_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLocation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLocation());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.routeguide.Feature)) {
      return super.equals(obj);
    }
    com.example.routeguide.Feature other = (com.example.routeguide.Feature) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.routeguide.Feature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.routeguide.Feature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.routeguide.Feature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.routeguide.Feature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.routeguide.Feature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.routeguide.Feature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.routeguide.Feature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.routeguide.Feature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.routeguide.Feature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.routeguide.Feature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.routeguide.Feature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.routeguide.Feature parseFrom(
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
  public static Builder newBuilder(com.example.routeguide.Feature prototype) {
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
   * Protobuf type {@code Feature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Feature)
      com.example.routeguide.FeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.routeguide.RouteGuideOuterClass.internal_static_Feature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.routeguide.RouteGuideOuterClass.internal_static_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.routeguide.Feature.class, com.example.routeguide.Feature.Builder.class);
    }

    // Construct using com.example.routeguide.Feature.newBuilder()
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
        getLocationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.routeguide.RouteGuideOuterClass.internal_static_Feature_descriptor;
    }

    @java.lang.Override
    public com.example.routeguide.Feature getDefaultInstanceForType() {
      return com.example.routeguide.Feature.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.routeguide.Feature build() {
      com.example.routeguide.Feature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.routeguide.Feature buildPartial() {
      com.example.routeguide.Feature result = new com.example.routeguide.Feature(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.routeguide.Feature result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.location_ = locationBuilder_ == null
            ? location_
            : locationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.example.routeguide.Feature) {
        return mergeFrom((com.example.routeguide.Feature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.routeguide.Feature other) {
      if (other == com.example.routeguide.Feature.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLocationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the feature.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the feature.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the feature.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the feature.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the feature.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.example.routeguide.Point location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.routeguide.Point, com.example.routeguide.Point.Builder, com.example.routeguide.PointOrBuilder> locationBuilder_;
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     * @return The location.
     */
    public com.example.routeguide.Point getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.example.routeguide.Point.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    public Builder setLocation(com.example.routeguide.Point value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    public Builder setLocation(
        com.example.routeguide.Point.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    public Builder mergeLocation(com.example.routeguide.Point value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          location_ != null &&
          location_ != com.example.routeguide.Point.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      if (location_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    public com.example.routeguide.Point.Builder getLocationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    public com.example.routeguide.PointOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.example.routeguide.Point.getDefaultInstance() : location_;
      }
    }
    /**
     * <pre>
     * The point where the feature is detected.
     * </pre>
     *
     * <code>.Point location = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.routeguide.Point, com.example.routeguide.Point.Builder, com.example.routeguide.PointOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.routeguide.Point, com.example.routeguide.Point.Builder, com.example.routeguide.PointOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Feature)
  }

  // @@protoc_insertion_point(class_scope:Feature)
  private static final com.example.routeguide.Feature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.routeguide.Feature();
  }

  public static com.example.routeguide.Feature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Feature>
      PARSER = new com.google.protobuf.AbstractParser<Feature>() {
    @java.lang.Override
    public Feature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Feature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Feature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.routeguide.Feature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

