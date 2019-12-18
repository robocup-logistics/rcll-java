// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotBeaconSignal.proto

package org.robocup_logistics.llsf_msgs;

public final class RobotBeaconSignalProtos {
  private RobotBeaconSignalProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RobotBeaconSignalOrBuilder extends
      // @@protoc_insertion_point(interface_extends:llsf_msgs.RobotBeaconSignal)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
     */
    boolean hasBeaconSignal();
    /**
     * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
     */
    org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal getBeaconSignal();
    /**
     * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
     */
    org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder getBeaconSignalOrBuilder();

    /**
     * <code>optional int32 task_id = 2;</code>
     */
    boolean hasTaskId();
    /**
     * <code>optional int32 task_id = 2;</code>
     */
    int getTaskId();

    /**
     * <code>required bool running = 3;</code>
     */
    boolean hasRunning();
    /**
     * <code>required bool running = 3;</code>
     */
    boolean getRunning();

    /**
     * <code>optional string oprs_stack = 4;</code>
     */
    boolean hasOprsStack();
    /**
     * <code>optional string oprs_stack = 4;</code>
     */
    String getOprsStack();
    /**
     * <code>optional string oprs_stack = 4;</code>
     */
    com.google.protobuf.ByteString
        getOprsStackBytes();

    /**
     * <code>optional bool holdProduct = 5;</code>
     */
    boolean hasHoldProduct();
    /**
     * <code>optional bool holdProduct = 5;</code>
     */
    boolean getHoldProduct();
  }
  /**
   * Protobuf type {@code llsf_msgs.RobotBeaconSignal}
   */
  public static final class RobotBeaconSignal extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:llsf_msgs.RobotBeaconSignal)
      RobotBeaconSignalOrBuilder {
    // Use RobotBeaconSignal.newBuilder() to construct.
    private RobotBeaconSignal(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RobotBeaconSignal(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RobotBeaconSignal defaultInstance;
    public static RobotBeaconSignal getDefaultInstance() {
      return defaultInstance;
    }

    public RobotBeaconSignal getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RobotBeaconSignal(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = beaconSignal_.toBuilder();
              }
              beaconSignal_ = input.readMessage(org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(beaconSignal_);
                beaconSignal_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              taskId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              running_ = input.readBool();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              oprsStack_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              holdProduct_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.internal_static_llsf_msgs_RobotBeaconSignal_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.internal_static_llsf_msgs_RobotBeaconSignal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.class, org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.Builder.class);
    }

    public static com.google.protobuf.Parser<RobotBeaconSignal> PARSER =
        new com.google.protobuf.AbstractParser<RobotBeaconSignal>() {
      public RobotBeaconSignal parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RobotBeaconSignal(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<RobotBeaconSignal> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code llsf_msgs.RobotBeaconSignal.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 5006;</code>
       */
      COMP_ID(0, 5006),
      /**
       * <code>MSG_TYPE = 702;</code>
       */
      MSG_TYPE(1, 702),
      ;

      /**
       * <code>COMP_ID = 5006;</code>
       */
      public static final int COMP_ID_VALUE = 5006;
      /**
       * <code>MSG_TYPE = 702;</code>
       */
      public static final int MSG_TYPE_VALUE = 702;


      public final int getNumber() { return value; }

      public static CompType valueOf(int value) {
        switch (value) {
          case 5006: return COMP_ID;
          case 702: return MSG_TYPE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CompType>() {
              public CompType findValueByNumber(int number) {
                return CompType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.getDescriptor().getEnumTypes().get(0);
      }

      private static final CompType[] VALUES = values();

      public static CompType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CompType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:llsf_msgs.RobotBeaconSignal.CompType)
    }

    private int bitField0_;
    public static final int BEACONSIGNAL_FIELD_NUMBER = 1;
    private org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal beaconSignal_;
    /**
     * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
     */
    public boolean hasBeaconSignal() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
     */
    public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal getBeaconSignal() {
      return beaconSignal_;
    }
    /**
     * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
     */
    public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder getBeaconSignalOrBuilder() {
      return beaconSignal_;
    }

    public static final int TASK_ID_FIELD_NUMBER = 2;
    private int taskId_;
    /**
     * <code>optional int32 task_id = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 task_id = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    public static final int RUNNING_FIELD_NUMBER = 3;
    private boolean running_;
    /**
     * <code>required bool running = 3;</code>
     */
    public boolean hasRunning() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bool running = 3;</code>
     */
    public boolean getRunning() {
      return running_;
    }

    public static final int OPRS_STACK_FIELD_NUMBER = 4;
    private Object oprsStack_;
    /**
     * <code>optional string oprs_stack = 4;</code>
     */
    public boolean hasOprsStack() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string oprs_stack = 4;</code>
     */
    public String getOprsStack() {
      Object ref = oprsStack_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          oprsStack_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string oprs_stack = 4;</code>
     */
    public com.google.protobuf.ByteString
        getOprsStackBytes() {
      Object ref = oprsStack_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        oprsStack_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HOLDPRODUCT_FIELD_NUMBER = 5;
    private boolean holdProduct_;
    /**
     * <code>optional bool holdProduct = 5;</code>
     */
    public boolean hasHoldProduct() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool holdProduct = 5;</code>
     */
    public boolean getHoldProduct() {
      return holdProduct_;
    }

    private void initFields() {
      beaconSignal_ = org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance();
      taskId_ = 0;
      running_ = false;
      oprsStack_ = "";
      holdProduct_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasBeaconSignal()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRunning()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBeaconSignal().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, beaconSignal_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, running_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getOprsStackBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, holdProduct_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, beaconSignal_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, running_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getOprsStackBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, holdProduct_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code llsf_msgs.RobotBeaconSignal}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:llsf_msgs.RobotBeaconSignal)
        org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.internal_static_llsf_msgs_RobotBeaconSignal_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.internal_static_llsf_msgs_RobotBeaconSignal_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.class, org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBeaconSignalFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (beaconSignalBuilder_ == null) {
          beaconSignal_ = org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance();
        } else {
          beaconSignalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        taskId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        running_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        oprsStack_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        holdProduct_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.internal_static_llsf_msgs_RobotBeaconSignal_descriptor;
      }

      public org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.getDefaultInstance();
      }

      public org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal build() {
        org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal buildPartial() {
        org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal result = new org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (beaconSignalBuilder_ == null) {
          result.beaconSignal_ = beaconSignal_;
        } else {
          result.beaconSignal_ = beaconSignalBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.taskId_ = taskId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.running_ = running_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.oprsStack_ = oprsStack_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.holdProduct_ = holdProduct_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal other) {
        if (other == org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal.getDefaultInstance()) return this;
        if (other.hasBeaconSignal()) {
          mergeBeaconSignal(other.getBeaconSignal());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasRunning()) {
          setRunning(other.getRunning());
        }
        if (other.hasOprsStack()) {
          bitField0_ |= 0x00000008;
          oprsStack_ = other.oprsStack_;
          onChanged();
        }
        if (other.hasHoldProduct()) {
          setHoldProduct(other.getHoldProduct());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBeaconSignal()) {

          return false;
        }
        if (!hasRunning()) {

          return false;
        }
        if (!getBeaconSignal().isInitialized()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.RobotBeaconSignalProtos.RobotBeaconSignal) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal beaconSignal_ = org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal, org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder, org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder> beaconSignalBuilder_;
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public boolean hasBeaconSignal() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal getBeaconSignal() {
        if (beaconSignalBuilder_ == null) {
          return beaconSignal_;
        } else {
          return beaconSignalBuilder_.getMessage();
        }
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public Builder setBeaconSignal(org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal value) {
        if (beaconSignalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          beaconSignal_ = value;
          onChanged();
        } else {
          beaconSignalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public Builder setBeaconSignal(
          org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder builderForValue) {
        if (beaconSignalBuilder_ == null) {
          beaconSignal_ = builderForValue.build();
          onChanged();
        } else {
          beaconSignalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public Builder mergeBeaconSignal(org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal value) {
        if (beaconSignalBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              beaconSignal_ != org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance()) {
            beaconSignal_ =
              org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.newBuilder(beaconSignal_).mergeFrom(value).buildPartial();
          } else {
            beaconSignal_ = value;
          }
          onChanged();
        } else {
          beaconSignalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public Builder clearBeaconSignal() {
        if (beaconSignalBuilder_ == null) {
          beaconSignal_ = org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance();
          onChanged();
        } else {
          beaconSignalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder getBeaconSignalBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBeaconSignalFieldBuilder().getBuilder();
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder getBeaconSignalOrBuilder() {
        if (beaconSignalBuilder_ != null) {
          return beaconSignalBuilder_.getMessageOrBuilder();
        } else {
          return beaconSignal_;
        }
      }
      /**
       * <code>required .llsf_msgs.BeaconSignal beaconSignal = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal, org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder, org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder>
          getBeaconSignalFieldBuilder() {
        if (beaconSignalBuilder_ == null) {
          beaconSignalBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal, org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder, org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder>(
                  getBeaconSignal(),
                  getParentForChildren(),
                  isClean());
          beaconSignal_ = null;
        }
        return beaconSignalBuilder_;
      }

      private int taskId_ ;
      /**
       * <code>optional int32 task_id = 2;</code>
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 task_id = 2;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>optional int32 task_id = 2;</code>
       */
      public Builder setTaskId(int value) {
        bitField0_ |= 0x00000002;
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 task_id = 2;</code>
       */
      public Builder clearTaskId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        taskId_ = 0;
        onChanged();
        return this;
      }

      private boolean running_ ;
      /**
       * <code>required bool running = 3;</code>
       */
      public boolean hasRunning() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bool running = 3;</code>
       */
      public boolean getRunning() {
        return running_;
      }
      /**
       * <code>required bool running = 3;</code>
       */
      public Builder setRunning(boolean value) {
        bitField0_ |= 0x00000004;
        running_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool running = 3;</code>
       */
      public Builder clearRunning() {
        bitField0_ = (bitField0_ & ~0x00000004);
        running_ = false;
        onChanged();
        return this;
      }

      private Object oprsStack_ = "";
      /**
       * <code>optional string oprs_stack = 4;</code>
       */
      public boolean hasOprsStack() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string oprs_stack = 4;</code>
       */
      public String getOprsStack() {
        Object ref = oprsStack_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            oprsStack_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string oprs_stack = 4;</code>
       */
      public com.google.protobuf.ByteString
          getOprsStackBytes() {
        Object ref = oprsStack_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          oprsStack_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string oprs_stack = 4;</code>
       */
      public Builder setOprsStack(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        oprsStack_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string oprs_stack = 4;</code>
       */
      public Builder clearOprsStack() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oprsStack_ = getDefaultInstance().getOprsStack();
        onChanged();
        return this;
      }
      /**
       * <code>optional string oprs_stack = 4;</code>
       */
      public Builder setOprsStackBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        oprsStack_ = value;
        onChanged();
        return this;
      }

      private boolean holdProduct_ ;
      /**
       * <code>optional bool holdProduct = 5;</code>
       */
      public boolean hasHoldProduct() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool holdProduct = 5;</code>
       */
      public boolean getHoldProduct() {
        return holdProduct_;
      }
      /**
       * <code>optional bool holdProduct = 5;</code>
       */
      public Builder setHoldProduct(boolean value) {
        bitField0_ |= 0x00000010;
        holdProduct_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool holdProduct = 5;</code>
       */
      public Builder clearHoldProduct() {
        bitField0_ = (bitField0_ & ~0x00000010);
        holdProduct_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:llsf_msgs.RobotBeaconSignal)
    }

    static {
      defaultInstance = new RobotBeaconSignal(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.RobotBeaconSignal)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_RobotBeaconSignal_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_llsf_msgs_RobotBeaconSignal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027RobotBeaconSignal.proto\022\tllsf_msgs\032\022Be" +
      "aconSignal.proto\"\266\001\n\021RobotBeaconSignal\022-" +
      "\n\014beaconSignal\030\001 \002(\0132\027.llsf_msgs.BeaconS" +
      "ignal\022\017\n\007task_id\030\002 \001(\005\022\017\n\007running\030\003 \002(\010\022" +
      "\022\n\noprs_stack\030\004 \001(\t\022\023\n\013holdProduct\030\005 \001(\010" +
      "\"\'\n\010CompType\022\014\n\007COMP_ID\020\216\'\022\r\n\010MSG_TYPE\020\276" +
      "\005B:\n\037org.robocup_logistics.llsf_msgsB\027Ro" +
      "botBeaconSignalProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.robocup_logistics.llsf_msgs.BeaconSignalProtos.getDescriptor(),
        }, assigner);
    internal_static_llsf_msgs_RobotBeaconSignal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_llsf_msgs_RobotBeaconSignal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_llsf_msgs_RobotBeaconSignal_descriptor,
        new String[] { "BeaconSignal", "TaskId", "Running", "OprsStack", "HoldProduct", });
    org.robocup_logistics.llsf_msgs.BeaconSignalProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}