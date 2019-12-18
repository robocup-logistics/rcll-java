// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReportAllMachines.proto

package org.robocup_logistics.llsf_msgs;

public final class ReportAllMachinesProtos {
  private ReportAllMachinesProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReportAllMachinesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:llsf_msgs.ReportAllMachines)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    java.util.List<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry> 
        getMachinesList();
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry getMachines(int index);
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    int getMachinesCount();
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    java.util.List<? extends org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder> 
        getMachinesOrBuilderList();
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder getMachinesOrBuilder(
            int index);

    /**
     * <code>required uint32 robotID = 3;</code>
     */
    boolean hasRobotID();
    /**
     * <code>required uint32 robotID = 3;</code>
     */
    int getRobotID();
  }
  /**
   * Protobuf type {@code llsf_msgs.ReportAllMachines}
   */
  public static final class ReportAllMachines extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:llsf_msgs.ReportAllMachines)
      ReportAllMachinesOrBuilder {
    // Use ReportAllMachines.newBuilder() to construct.
    private ReportAllMachines(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReportAllMachines(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReportAllMachines defaultInstance;
    public static ReportAllMachines getDefaultInstance() {
      return defaultInstance;
    }

    public ReportAllMachines getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReportAllMachines(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                machines_ = new java.util.ArrayList<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry>();
                mutable_bitField0_ |= 0x00000001;
              }
              machines_.add(input.readMessage(org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000001;
              robotID_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          machines_ = java.util.Collections.unmodifiableList(machines_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.internal_static_llsf_msgs_ReportAllMachines_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.internal_static_llsf_msgs_ReportAllMachines_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.class, org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.Builder.class);
    }

    public static com.google.protobuf.Parser<ReportAllMachines> PARSER =
        new com.google.protobuf.AbstractParser<ReportAllMachines>() {
      public ReportAllMachines parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReportAllMachines(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<ReportAllMachines> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code llsf_msgs.ReportAllMachines.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 2100;</code>
       */
      COMP_ID(0, 2100),
      /**
       * <code>MSG_TYPE = 201;</code>
       */
      MSG_TYPE(1, 201),
      ;

      /**
       * <code>COMP_ID = 2100;</code>
       */
      public static final int COMP_ID_VALUE = 2100;
      /**
       * <code>MSG_TYPE = 201;</code>
       */
      public static final int MSG_TYPE_VALUE = 201;


      public final int getNumber() { return value; }

      public static CompType valueOf(int value) {
        switch (value) {
          case 2100: return COMP_ID;
          case 201: return MSG_TYPE;
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
        return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:llsf_msgs.ReportAllMachines.CompType)
    }

    private int bitField0_;
    public static final int MACHINES_FIELD_NUMBER = 2;
    private java.util.List<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry> machines_;
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    public java.util.List<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry> getMachinesList() {
      return machines_;
    }
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    public java.util.List<? extends org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder>
        getMachinesOrBuilderList() {
      return machines_;
    }
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    public int getMachinesCount() {
      return machines_.size();
    }
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry getMachines(int index) {
      return machines_.get(index);
    }
    /**
     * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
     */
    public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder getMachinesOrBuilder(
        int index) {
      return machines_.get(index);
    }

    public static final int ROBOTID_FIELD_NUMBER = 3;
    private int robotID_;
    /**
     * <code>required uint32 robotID = 3;</code>
     */
    public boolean hasRobotID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 robotID = 3;</code>
     */
    public int getRobotID() {
      return robotID_;
    }

    private void initFields() {
      machines_ = java.util.Collections.emptyList();
      robotID_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRobotID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getMachinesCount(); i++) {
        if (!getMachines(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < machines_.size(); i++) {
        output.writeMessage(2, machines_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(3, robotID_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < machines_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, machines_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, robotID_);
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

    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines prototype) {
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
     * Protobuf type {@code llsf_msgs.ReportAllMachines}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:llsf_msgs.ReportAllMachines)
        org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachinesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.internal_static_llsf_msgs_ReportAllMachines_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.internal_static_llsf_msgs_ReportAllMachines_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.class, org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.newBuilder()
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
          getMachinesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (machinesBuilder_ == null) {
          machines_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          machinesBuilder_.clear();
        }
        robotID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.internal_static_llsf_msgs_ReportAllMachines_descriptor;
      }

      public org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.getDefaultInstance();
      }

      public org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines build() {
        org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines buildPartial() {
        org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines result = new org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (machinesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            machines_ = java.util.Collections.unmodifiableList(machines_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.machines_ = machines_;
        } else {
          result.machines_ = machinesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.robotID_ = robotID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines other) {
        if (other == org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines.getDefaultInstance()) return this;
        if (machinesBuilder_ == null) {
          if (!other.machines_.isEmpty()) {
            if (machines_.isEmpty()) {
              machines_ = other.machines_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMachinesIsMutable();
              machines_.addAll(other.machines_);
            }
            onChanged();
          }
        } else {
          if (!other.machines_.isEmpty()) {
            if (machinesBuilder_.isEmpty()) {
              machinesBuilder_.dispose();
              machinesBuilder_ = null;
              machines_ = other.machines_;
              bitField0_ = (bitField0_ & ~0x00000001);
              machinesBuilder_ =
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMachinesFieldBuilder() : null;
            } else {
              machinesBuilder_.addAllMessages(other.machines_);
            }
          }
        }
        if (other.hasRobotID()) {
          setRobotID(other.getRobotID());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRobotID()) {

          return false;
        }
        for (int i = 0; i < getMachinesCount(); i++) {
          if (!getMachines(i).isInitialized()) {

            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.ReportAllMachinesProtos.ReportAllMachines) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry> machines_ =
        java.util.Collections.emptyList();
      private void ensureMachinesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          machines_ = new java.util.ArrayList<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry>(machines_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder> machinesBuilder_;

      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public java.util.List<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry> getMachinesList() {
        if (machinesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(machines_);
        } else {
          return machinesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public int getMachinesCount() {
        if (machinesBuilder_ == null) {
          return machines_.size();
        } else {
          return machinesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry getMachines(int index) {
        if (machinesBuilder_ == null) {
          return machines_.get(index);
        } else {
          return machinesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder setMachines(
          int index, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry value) {
        if (machinesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMachinesIsMutable();
          machines_.set(index, value);
          onChanged();
        } else {
          machinesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder setMachines(
          int index, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder builderForValue) {
        if (machinesBuilder_ == null) {
          ensureMachinesIsMutable();
          machines_.set(index, builderForValue.build());
          onChanged();
        } else {
          machinesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder addMachines(org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry value) {
        if (machinesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMachinesIsMutable();
          machines_.add(value);
          onChanged();
        } else {
          machinesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder addMachines(
          int index, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry value) {
        if (machinesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMachinesIsMutable();
          machines_.add(index, value);
          onChanged();
        } else {
          machinesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder addMachines(
          org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder builderForValue) {
        if (machinesBuilder_ == null) {
          ensureMachinesIsMutable();
          machines_.add(builderForValue.build());
          onChanged();
        } else {
          machinesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder addMachines(
          int index, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder builderForValue) {
        if (machinesBuilder_ == null) {
          ensureMachinesIsMutable();
          machines_.add(index, builderForValue.build());
          onChanged();
        } else {
          machinesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder addAllMachines(
          Iterable<? extends org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry> values) {
        if (machinesBuilder_ == null) {
          ensureMachinesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, machines_);
          onChanged();
        } else {
          machinesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder clearMachines() {
        if (machinesBuilder_ == null) {
          machines_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          machinesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public Builder removeMachines(int index) {
        if (machinesBuilder_ == null) {
          ensureMachinesIsMutable();
          machines_.remove(index);
          onChanged();
        } else {
          machinesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder getMachinesBuilder(
          int index) {
        return getMachinesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder getMachinesOrBuilder(
          int index) {
        if (machinesBuilder_ == null) {
          return machines_.get(index);  } else {
          return machinesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public java.util.List<? extends org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder>
           getMachinesOrBuilderList() {
        if (machinesBuilder_ != null) {
          return machinesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(machines_);
        }
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder addMachinesBuilder() {
        return getMachinesFieldBuilder().addBuilder(
            org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder addMachinesBuilder(
          int index) {
        return getMachinesFieldBuilder().addBuilder(
            index, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .llsf_msgs.RobotMachineReportEntry machines = 2;</code>
       */
      public java.util.List<org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder>
           getMachinesBuilderList() {
        return getMachinesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder>
          getMachinesFieldBuilder() {
        if (machinesBuilder_ == null) {
          machinesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntry.Builder, org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.RobotMachineReportEntryOrBuilder>(
                  machines_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          machines_ = null;
        }
        return machinesBuilder_;
      }

      private int robotID_ ;
      /**
       * <code>required uint32 robotID = 3;</code>
       */
      public boolean hasRobotID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 robotID = 3;</code>
       */
      public int getRobotID() {
        return robotID_;
      }
      /**
       * <code>required uint32 robotID = 3;</code>
       */
      public Builder setRobotID(int value) {
        bitField0_ |= 0x00000002;
        robotID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 robotID = 3;</code>
       */
      public Builder clearRobotID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        robotID_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:llsf_msgs.ReportAllMachines)
    }

    static {
      defaultInstance = new ReportAllMachines(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.ReportAllMachines)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_ReportAllMachines_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_llsf_msgs_ReportAllMachines_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027ReportAllMachines.proto\022\tllsf_msgs\032\030Ro" +
      "botMachineReport.proto\"\203\001\n\021ReportAllMach" +
      "ines\0224\n\010machines\030\002 \003(\0132\".llsf_msgs.Robot" +
      "MachineReportEntry\022\017\n\007robotID\030\003 \002(\r\"\'\n\010C" +
      "ompType\022\014\n\007COMP_ID\020\264\020\022\r\n\010MSG_TYPE\020\311\001B:\n\037" +
      "org.robocup_logistics.llsf_msgsB\027ReportA" +
      "llMachinesProtos"
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
          org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.getDescriptor(),
        }, assigner);
    internal_static_llsf_msgs_ReportAllMachines_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_llsf_msgs_ReportAllMachines_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_llsf_msgs_ReportAllMachines_descriptor,
        new String[] { "Machines", "RobotID", });
    org.robocup_logistics.llsf_msgs.RobotMachineReportProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}