// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampV3CampStageInfo.proto

package emu.grasscutter.net.proto;

public final class SeaLampV3CampStageInfoOuterClass {
  private SeaLampV3CampStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampV3CampStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampV3CampStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 10;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Obf: CMCFPKPHHLE
   * </pre>
   *
   * Protobuf type {@code SeaLampV3CampStageInfo}
   */
  public static final class SeaLampV3CampStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampV3CampStageInfo)
      SeaLampV3CampStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampV3CampStageInfo.newBuilder() to construct.
    private SeaLampV3CampStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampV3CampStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampV3CampStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SeaLampV3CampStageInfo(
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
            case 16: {

              stageId_ = input.readUInt32();
              break;
            }
            case 48: {

              isOpen_ = input.readBool();
              break;
            }
            case 80: {

              isFinished_ = input.readBool();
              break;
            }
            case 120: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.internal_static_SeaLampV3CampStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.internal_static_SeaLampV3CampStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.class, emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 10;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 10;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 2;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 6;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (stageId_ != 0) {
        output.writeUInt32(2, stageId_);
      }
      if (isOpen_ != false) {
        output.writeBool(6, isOpen_);
      }
      if (isFinished_ != false) {
        output.writeBool(10, isFinished_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stageId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isOpen_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinished_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo other = (emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo prototype) {
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
     * <pre>
     * Obf: CMCFPKPHHLE
     * </pre>
     *
     * Protobuf type {@code SeaLampV3CampStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampV3CampStageInfo)
        emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.internal_static_SeaLampV3CampStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.internal_static_SeaLampV3CampStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.class, emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.newBuilder()
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
        isFinished_ = false;

        stageId_ = 0;

        levelId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.internal_static_SeaLampV3CampStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo build() {
        emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo buildPartial() {
        emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo result = new emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo(this);
        result.isFinished_ = isFinished_;
        result.stageId_ = stageId_;
        result.levelId_ = levelId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo other) {
        if (other == emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 10;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 10;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 6;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:SeaLampV3CampStageInfo)
    }

    // @@protoc_insertion_point(class_scope:SeaLampV3CampStageInfo)
    private static final emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo();
    }

    public static emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampV3CampStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampV3CampStageInfo>() {
      @java.lang.Override
      public SeaLampV3CampStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SeaLampV3CampStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SeaLampV3CampStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampV3CampStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampV3CampStageInfoOuterClass.SeaLampV3CampStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampV3CampStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampV3CampStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SeaLampV3CampStageInfo.proto\"b\n\026SeaLam" +
      "pV3CampStageInfo\022\023\n\013is_finished\030\n \001(\010\022\020\n" +
      "\010stage_id\030\002 \001(\r\022\020\n\010level_id\030\017 \001(\r\022\017\n\007is_" +
      "open\030\006 \001(\010B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampV3CampStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampV3CampStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampV3CampStageInfo_descriptor,
        new java.lang.String[] { "IsFinished", "StageId", "LevelId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}