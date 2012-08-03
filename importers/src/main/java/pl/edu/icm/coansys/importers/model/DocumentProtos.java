/*
 * (C) 2010-2012 ICM UW. All rights reserved.
 */

package pl.edu.icm.coansys.importers.model;

public final class DocumentProtos {
  private DocumentProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ClassifCodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string source = 1;
    boolean hasSource();
    String getSource();
    
    // required string value = 2;
    boolean hasValue();
    String getValue();
  }
  public static final class ClassifCode extends
      com.google.protobuf.GeneratedMessage
      implements ClassifCodeOrBuilder {
    // Use ClassifCode.newBuilder() to construct.
    private ClassifCode(Builder builder) {
      super(builder);
    }
    private ClassifCode(boolean noInit) {}
    
    private static final ClassifCode defaultInstance;
    public static ClassifCode getDefaultInstance() {
      return defaultInstance;
    }
    
    public ClassifCode getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ClassifCode_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ClassifCode_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string source = 1;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private java.lang.Object source_;
    public boolean hasSource() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          source_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          value_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      source_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSource()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
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
        output.writeBytes(1, getSourceBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
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
          .computeBytesSize(1, getSourceBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ClassifCode_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ClassifCode_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        source_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode result = new pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.source_ = source_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.getDefaultInstance()) return this;
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSource()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              source_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string source = 1;
      private java.lang.Object source_ = "";
      public boolean hasSource() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSource(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        source_ = value;
        onChanged();
        return this;
      }
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00000001);
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      void setSource(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        source_ = value;
        onChanged();
      }
      
      // required string value = 2;
      private java.lang.Object value_ = "";
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setValue(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      void setValue(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:ClassifCode)
    }
    
    static {
      defaultInstance = new ClassifCode(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ClassifCode)
  }
  
  public interface ExtIdOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string source = 1;
    boolean hasSource();
    String getSource();
    
    // required string value = 2;
    boolean hasValue();
    String getValue();
  }
  public static final class ExtId extends
      com.google.protobuf.GeneratedMessage
      implements ExtIdOrBuilder {
    // Use ExtId.newBuilder() to construct.
    private ExtId(Builder builder) {
      super(builder);
    }
    private ExtId(boolean noInit) {}
    
    private static final ExtId defaultInstance;
    public static ExtId getDefaultInstance() {
      return defaultInstance;
    }
    
    public ExtId getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ExtId_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ExtId_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string source = 1;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private java.lang.Object source_;
    public boolean hasSource() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          source_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          value_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      source_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSource()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
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
        output.writeBytes(1, getSourceBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
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
          .computeBytesSize(1, getSourceBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ExtId_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_ExtId_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        source_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId result = new pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.source_ = source_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance()) return this;
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSource()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              source_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string source = 1;
      private java.lang.Object source_ = "";
      public boolean hasSource() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSource(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        source_ = value;
        onChanged();
        return this;
      }
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00000001);
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      void setSource(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        source_ = value;
        onChanged();
      }
      
      // required string value = 2;
      private java.lang.Object value_ = "";
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setValue(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      void setValue(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:ExtId)
    }
    
    static {
      defaultInstance = new ExtId(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ExtId)
  }
  
  public interface AffiliationRefOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string key = 1;
    boolean hasKey();
    String getKey();
    
    // required string affiliationId = 2;
    boolean hasAffiliationId();
    String getAffiliationId();
  }
  public static final class AffiliationRef extends
      com.google.protobuf.GeneratedMessage
      implements AffiliationRefOrBuilder {
    // Use AffiliationRef.newBuilder() to construct.
    private AffiliationRef(Builder builder) {
      super(builder);
    }
    private AffiliationRef(boolean noInit) {}
    
    private static final AffiliationRef defaultInstance;
    public static AffiliationRef getDefaultInstance() {
      return defaultInstance;
    }
    
    public AffiliationRef getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_AffiliationRef_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_AffiliationRef_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string affiliationId = 2;
    public static final int AFFILIATIONID_FIELD_NUMBER = 2;
    private java.lang.Object affiliationId_;
    public boolean hasAffiliationId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getAffiliationId() {
      java.lang.Object ref = affiliationId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          affiliationId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAffiliationIdBytes() {
      java.lang.Object ref = affiliationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        affiliationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      key_ = "";
      affiliationId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAffiliationId()) {
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
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getAffiliationIdBytes());
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
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getAffiliationIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_AffiliationRef_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_AffiliationRef_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        affiliationId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef result = new pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.affiliationId_ = affiliationId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasAffiliationId()) {
          setAffiliationId(other.getAffiliationId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasKey()) {
          
          return false;
        }
        if (!hasAffiliationId()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              affiliationId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string key = 1;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
      }
      
      // required string affiliationId = 2;
      private java.lang.Object affiliationId_ = "";
      public boolean hasAffiliationId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getAffiliationId() {
        java.lang.Object ref = affiliationId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          affiliationId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAffiliationId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        affiliationId_ = value;
        onChanged();
        return this;
      }
      public Builder clearAffiliationId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        affiliationId_ = getDefaultInstance().getAffiliationId();
        onChanged();
        return this;
      }
      void setAffiliationId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        affiliationId_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:AffiliationRef)
    }
    
    static {
      defaultInstance = new AffiliationRef(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:AffiliationRef)
  }
  
  public interface AffiliationOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string key = 1;
    boolean hasKey();
    String getKey();
    
    // required string affiliationId = 2;
    boolean hasAffiliationId();
    String getAffiliationId();
    
    // required string text = 3;
    boolean hasText();
    String getText();
  }
  public static final class Affiliation extends
      com.google.protobuf.GeneratedMessage
      implements AffiliationOrBuilder {
    // Use Affiliation.newBuilder() to construct.
    private Affiliation(Builder builder) {
      super(builder);
    }
    private Affiliation(boolean noInit) {}
    
    private static final Affiliation defaultInstance;
    public static Affiliation getDefaultInstance() {
      return defaultInstance;
    }
    
    public Affiliation getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Affiliation_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Affiliation_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string affiliationId = 2;
    public static final int AFFILIATIONID_FIELD_NUMBER = 2;
    private java.lang.Object affiliationId_;
    public boolean hasAffiliationId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getAffiliationId() {
      java.lang.Object ref = affiliationId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          affiliationId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAffiliationIdBytes() {
      java.lang.Object ref = affiliationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        affiliationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string text = 3;
    public static final int TEXT_FIELD_NUMBER = 3;
    private java.lang.Object text_;
    public boolean hasText() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          text_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      key_ = "";
      affiliationId_ = "";
      text_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAffiliationId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasText()) {
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
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getAffiliationIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTextBytes());
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
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getAffiliationIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTextBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Affiliation_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Affiliation_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        affiliationId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation result = new pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.affiliationId_ = affiliationId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.text_ = text_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasAffiliationId()) {
          setAffiliationId(other.getAffiliationId());
        }
        if (other.hasText()) {
          setText(other.getText());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasKey()) {
          
          return false;
        }
        if (!hasAffiliationId()) {
          
          return false;
        }
        if (!hasText()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              affiliationId_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              text_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string key = 1;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
      }
      
      // required string affiliationId = 2;
      private java.lang.Object affiliationId_ = "";
      public boolean hasAffiliationId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getAffiliationId() {
        java.lang.Object ref = affiliationId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          affiliationId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAffiliationId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        affiliationId_ = value;
        onChanged();
        return this;
      }
      public Builder clearAffiliationId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        affiliationId_ = getDefaultInstance().getAffiliationId();
        onChanged();
        return this;
      }
      void setAffiliationId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        affiliationId_ = value;
        onChanged();
      }
      
      // required string text = 3;
      private java.lang.Object text_ = "";
      public boolean hasText() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setText(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        text_ = value;
        onChanged();
        return this;
      }
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00000004);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      void setText(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        text_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:Affiliation)
    }
    
    static {
      defaultInstance = new Affiliation(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Affiliation)
  }
  
  public interface AuthorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string key = 1;
    boolean hasKey();
    String getKey();
    
    // optional string forenames = 2;
    boolean hasForenames();
    String getForenames();
    
    // optional string surname = 3;
    boolean hasSurname();
    String getSurname();
    
    // optional string name = 4;
    boolean hasName();
    String getName();
    
    // optional string email = 5;
    boolean hasEmail();
    String getEmail();
    
    // repeated .AffiliationRef affiliationRef = 6;
    java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef> 
        getAffiliationRefList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef getAffiliationRef(int index);
    int getAffiliationRefCount();
    java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder> 
        getAffiliationRefOrBuilderList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder getAffiliationRefOrBuilder(
        int index);
    
    // optional string docId = 7;
    boolean hasDocId();
    String getDocId();
    
    // optional int32 positionNumber = 8;
    boolean hasPositionNumber();
    int getPositionNumber();
    
    // repeated .ExtId extId = 9;
    java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId> 
        getExtIdList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getExtId(int index);
    int getExtIdCount();
    java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> 
        getExtIdOrBuilderList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder getExtIdOrBuilder(
        int index);
  }
  public static final class Author extends
      com.google.protobuf.GeneratedMessage
      implements AuthorOrBuilder {
    // Use Author.newBuilder() to construct.
    private Author(Builder builder) {
      super(builder);
    }
    private Author(boolean noInit) {}
    
    private static final Author defaultInstance;
    public static Author getDefaultInstance() {
      return defaultInstance;
    }
    
    public Author getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Author_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Author_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string forenames = 2;
    public static final int FORENAMES_FIELD_NUMBER = 2;
    private java.lang.Object forenames_;
    public boolean hasForenames() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getForenames() {
      java.lang.Object ref = forenames_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          forenames_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getForenamesBytes() {
      java.lang.Object ref = forenames_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        forenames_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string surname = 3;
    public static final int SURNAME_FIELD_NUMBER = 3;
    private java.lang.Object surname_;
    public boolean hasSurname() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getSurname() {
      java.lang.Object ref = surname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          surname_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSurnameBytes() {
      java.lang.Object ref = surname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        surname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string name = 4;
    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string email = 5;
    public static final int EMAIL_FIELD_NUMBER = 5;
    private java.lang.Object email_;
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          email_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated .AffiliationRef affiliationRef = 6;
    public static final int AFFILIATIONREF_FIELD_NUMBER = 6;
    private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef> affiliationRef_;
    public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef> getAffiliationRefList() {
      return affiliationRef_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder> 
        getAffiliationRefOrBuilderList() {
      return affiliationRef_;
    }
    public int getAffiliationRefCount() {
      return affiliationRef_.size();
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef getAffiliationRef(int index) {
      return affiliationRef_.get(index);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder getAffiliationRefOrBuilder(
        int index) {
      return affiliationRef_.get(index);
    }
    
    // optional string docId = 7;
    public static final int DOCID_FIELD_NUMBER = 7;
    private java.lang.Object docId_;
    public boolean hasDocId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getDocId() {
      java.lang.Object ref = docId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          docId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDocIdBytes() {
      java.lang.Object ref = docId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        docId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 positionNumber = 8;
    public static final int POSITIONNUMBER_FIELD_NUMBER = 8;
    private int positionNumber_;
    public boolean hasPositionNumber() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getPositionNumber() {
      return positionNumber_;
    }
    
    // repeated .ExtId extId = 9;
    public static final int EXTID_FIELD_NUMBER = 9;
    private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId> extId_;
    public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId> getExtIdList() {
      return extId_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> 
        getExtIdOrBuilderList() {
      return extId_;
    }
    public int getExtIdCount() {
      return extId_.size();
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getExtId(int index) {
      return extId_.get(index);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder getExtIdOrBuilder(
        int index) {
      return extId_.get(index);
    }
    
    private void initFields() {
      key_ = "";
      forenames_ = "";
      surname_ = "";
      name_ = "";
      email_ = "";
      affiliationRef_ = java.util.Collections.emptyList();
      docId_ = "";
      positionNumber_ = 0;
      extId_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAffiliationRefCount(); i++) {
        if (!getAffiliationRef(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getExtIdCount(); i++) {
        if (!getExtId(i).isInitialized()) {
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getForenamesBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getSurnameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getEmailBytes());
      }
      for (int i = 0; i < affiliationRef_.size(); i++) {
        output.writeMessage(6, affiliationRef_.get(i));
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(7, getDocIdBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(8, positionNumber_);
      }
      for (int i = 0; i < extId_.size(); i++) {
        output.writeMessage(9, extId_.get(i));
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
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getForenamesBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getSurnameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getEmailBytes());
      }
      for (int i = 0; i < affiliationRef_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, affiliationRef_.get(i));
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getDocIdBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, positionNumber_);
      }
      for (int i = 0; i < extId_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, extId_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Author parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.Author prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Author_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Author_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.Author.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getAffiliationRefFieldBuilder();
          getExtIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        forenames_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        surname_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        if (affiliationRefBuilder_ == null) {
          affiliationRef_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          affiliationRefBuilder_.clear();
        }
        docId_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        positionNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        if (extIdBuilder_ == null) {
          extId_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
        } else {
          extIdBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.Author.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.Author.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Author result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.Author buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Author result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Author result = new pl.edu.icm.coansys.importers.model.DocumentProtos.Author(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.forenames_ = forenames_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.surname_ = surname_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.email_ = email_;
        if (affiliationRefBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            affiliationRef_ = java.util.Collections.unmodifiableList(affiliationRef_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.affiliationRef_ = affiliationRef_;
        } else {
          result.affiliationRef_ = affiliationRefBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000020;
        }
        result.docId_ = docId_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000040;
        }
        result.positionNumber_ = positionNumber_;
        if (extIdBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100)) {
            extId_ = java.util.Collections.unmodifiableList(extId_);
            bitField0_ = (bitField0_ & ~0x00000100);
          }
          result.extId_ = extId_;
        } else {
          result.extId_ = extIdBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.Author) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.Author)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.Author other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.Author.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasForenames()) {
          setForenames(other.getForenames());
        }
        if (other.hasSurname()) {
          setSurname(other.getSurname());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasEmail()) {
          setEmail(other.getEmail());
        }
        if (affiliationRefBuilder_ == null) {
          if (!other.affiliationRef_.isEmpty()) {
            if (affiliationRef_.isEmpty()) {
              affiliationRef_ = other.affiliationRef_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureAffiliationRefIsMutable();
              affiliationRef_.addAll(other.affiliationRef_);
            }
            onChanged();
          }
        } else {
          if (!other.affiliationRef_.isEmpty()) {
            if (affiliationRefBuilder_.isEmpty()) {
              affiliationRefBuilder_.dispose();
              affiliationRefBuilder_ = null;
              affiliationRef_ = other.affiliationRef_;
              bitField0_ = (bitField0_ & ~0x00000020);
              affiliationRefBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAffiliationRefFieldBuilder() : null;
            } else {
              affiliationRefBuilder_.addAllMessages(other.affiliationRef_);
            }
          }
        }
        if (other.hasDocId()) {
          setDocId(other.getDocId());
        }
        if (other.hasPositionNumber()) {
          setPositionNumber(other.getPositionNumber());
        }
        if (extIdBuilder_ == null) {
          if (!other.extId_.isEmpty()) {
            if (extId_.isEmpty()) {
              extId_ = other.extId_;
              bitField0_ = (bitField0_ & ~0x00000100);
            } else {
              ensureExtIdIsMutable();
              extId_.addAll(other.extId_);
            }
            onChanged();
          }
        } else {
          if (!other.extId_.isEmpty()) {
            if (extIdBuilder_.isEmpty()) {
              extIdBuilder_.dispose();
              extIdBuilder_ = null;
              extId_ = other.extId_;
              bitField0_ = (bitField0_ & ~0x00000100);
              extIdBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getExtIdFieldBuilder() : null;
            } else {
              extIdBuilder_.addAllMessages(other.extId_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasKey()) {
          
          return false;
        }
        for (int i = 0; i < getAffiliationRefCount(); i++) {
          if (!getAffiliationRef(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getExtIdCount(); i++) {
          if (!getExtId(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              forenames_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              surname_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              name_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              email_ = input.readBytes();
              break;
            }
            case 50: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addAffiliationRef(subBuilder.buildPartial());
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              docId_ = input.readBytes();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              positionNumber_ = input.readInt32();
              break;
            }
            case 74: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addExtId(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string key = 1;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
      }
      
      // optional string forenames = 2;
      private java.lang.Object forenames_ = "";
      public boolean hasForenames() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getForenames() {
        java.lang.Object ref = forenames_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          forenames_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setForenames(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        forenames_ = value;
        onChanged();
        return this;
      }
      public Builder clearForenames() {
        bitField0_ = (bitField0_ & ~0x00000002);
        forenames_ = getDefaultInstance().getForenames();
        onChanged();
        return this;
      }
      void setForenames(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        forenames_ = value;
        onChanged();
      }
      
      // optional string surname = 3;
      private java.lang.Object surname_ = "";
      public boolean hasSurname() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getSurname() {
        java.lang.Object ref = surname_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          surname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSurname(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        surname_ = value;
        onChanged();
        return this;
      }
      public Builder clearSurname() {
        bitField0_ = (bitField0_ & ~0x00000004);
        surname_ = getDefaultInstance().getSurname();
        onChanged();
        return this;
      }
      void setSurname(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        surname_ = value;
        onChanged();
      }
      
      // optional string name = 4;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
      }
      
      // optional string email = 5;
      private java.lang.Object email_ = "";
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEmail(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        email_ = value;
        onChanged();
        return this;
      }
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000010);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      void setEmail(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        email_ = value;
        onChanged();
      }
      
      // repeated .AffiliationRef affiliationRef = 6;
      private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef> affiliationRef_ =
        java.util.Collections.emptyList();
      private void ensureAffiliationRefIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          affiliationRef_ = new java.util.ArrayList<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef>(affiliationRef_);
          bitField0_ |= 0x00000020;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder> affiliationRefBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef> getAffiliationRefList() {
        if (affiliationRefBuilder_ == null) {
          return java.util.Collections.unmodifiableList(affiliationRef_);
        } else {
          return affiliationRefBuilder_.getMessageList();
        }
      }
      public int getAffiliationRefCount() {
        if (affiliationRefBuilder_ == null) {
          return affiliationRef_.size();
        } else {
          return affiliationRefBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef getAffiliationRef(int index) {
        if (affiliationRefBuilder_ == null) {
          return affiliationRef_.get(index);
        } else {
          return affiliationRefBuilder_.getMessage(index);
        }
      }
      public Builder setAffiliationRef(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef value) {
        if (affiliationRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAffiliationRefIsMutable();
          affiliationRef_.set(index, value);
          onChanged();
        } else {
          affiliationRefBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setAffiliationRef(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder builderForValue) {
        if (affiliationRefBuilder_ == null) {
          ensureAffiliationRefIsMutable();
          affiliationRef_.set(index, builderForValue.build());
          onChanged();
        } else {
          affiliationRefBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAffiliationRef(pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef value) {
        if (affiliationRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAffiliationRefIsMutable();
          affiliationRef_.add(value);
          onChanged();
        } else {
          affiliationRefBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addAffiliationRef(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef value) {
        if (affiliationRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAffiliationRefIsMutable();
          affiliationRef_.add(index, value);
          onChanged();
        } else {
          affiliationRefBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addAffiliationRef(
          pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder builderForValue) {
        if (affiliationRefBuilder_ == null) {
          ensureAffiliationRefIsMutable();
          affiliationRef_.add(builderForValue.build());
          onChanged();
        } else {
          affiliationRefBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addAffiliationRef(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder builderForValue) {
        if (affiliationRefBuilder_ == null) {
          ensureAffiliationRefIsMutable();
          affiliationRef_.add(index, builderForValue.build());
          onChanged();
        } else {
          affiliationRefBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllAffiliationRef(
          java.lang.Iterable<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef> values) {
        if (affiliationRefBuilder_ == null) {
          ensureAffiliationRefIsMutable();
          super.addAll(values, affiliationRef_);
          onChanged();
        } else {
          affiliationRefBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearAffiliationRef() {
        if (affiliationRefBuilder_ == null) {
          affiliationRef_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          affiliationRefBuilder_.clear();
        }
        return this;
      }
      public Builder removeAffiliationRef(int index) {
        if (affiliationRefBuilder_ == null) {
          ensureAffiliationRefIsMutable();
          affiliationRef_.remove(index);
          onChanged();
        } else {
          affiliationRefBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder getAffiliationRefBuilder(
          int index) {
        return getAffiliationRefFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder getAffiliationRefOrBuilder(
          int index) {
        if (affiliationRefBuilder_ == null) {
          return affiliationRef_.get(index);  } else {
          return affiliationRefBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder> 
           getAffiliationRefOrBuilderList() {
        if (affiliationRefBuilder_ != null) {
          return affiliationRefBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(affiliationRef_);
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder addAffiliationRefBuilder() {
        return getAffiliationRefFieldBuilder().addBuilder(
            pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.getDefaultInstance());
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder addAffiliationRefBuilder(
          int index) {
        return getAffiliationRefFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder> 
           getAffiliationRefBuilderList() {
        return getAffiliationRefFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder> 
          getAffiliationRefFieldBuilder() {
        if (affiliationRefBuilder_ == null) {
          affiliationRefBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRefOrBuilder>(
                  affiliationRef_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          affiliationRef_ = null;
        }
        return affiliationRefBuilder_;
      }
      
      // optional string docId = 7;
      private java.lang.Object docId_ = "";
      public boolean hasDocId() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getDocId() {
        java.lang.Object ref = docId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          docId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDocId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        docId_ = value;
        onChanged();
        return this;
      }
      public Builder clearDocId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        docId_ = getDefaultInstance().getDocId();
        onChanged();
        return this;
      }
      void setDocId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        docId_ = value;
        onChanged();
      }
      
      // optional int32 positionNumber = 8;
      private int positionNumber_ ;
      public boolean hasPositionNumber() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getPositionNumber() {
        return positionNumber_;
      }
      public Builder setPositionNumber(int value) {
        bitField0_ |= 0x00000080;
        positionNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearPositionNumber() {
        bitField0_ = (bitField0_ & ~0x00000080);
        positionNumber_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .ExtId extId = 9;
      private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId> extId_ =
        java.util.Collections.emptyList();
      private void ensureExtIdIsMutable() {
        if (!((bitField0_ & 0x00000100) == 0x00000100)) {
          extId_ = new java.util.ArrayList<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId>(extId_);
          bitField0_ |= 0x00000100;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> extIdBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId> getExtIdList() {
        if (extIdBuilder_ == null) {
          return java.util.Collections.unmodifiableList(extId_);
        } else {
          return extIdBuilder_.getMessageList();
        }
      }
      public int getExtIdCount() {
        if (extIdBuilder_ == null) {
          return extId_.size();
        } else {
          return extIdBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getExtId(int index) {
        if (extIdBuilder_ == null) {
          return extId_.get(index);
        } else {
          return extIdBuilder_.getMessage(index);
        }
      }
      public Builder setExtId(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId value) {
        if (extIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtIdIsMutable();
          extId_.set(index, value);
          onChanged();
        } else {
          extIdBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setExtId(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder builderForValue) {
        if (extIdBuilder_ == null) {
          ensureExtIdIsMutable();
          extId_.set(index, builderForValue.build());
          onChanged();
        } else {
          extIdBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addExtId(pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId value) {
        if (extIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtIdIsMutable();
          extId_.add(value);
          onChanged();
        } else {
          extIdBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addExtId(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId value) {
        if (extIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExtIdIsMutable();
          extId_.add(index, value);
          onChanged();
        } else {
          extIdBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addExtId(
          pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder builderForValue) {
        if (extIdBuilder_ == null) {
          ensureExtIdIsMutable();
          extId_.add(builderForValue.build());
          onChanged();
        } else {
          extIdBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addExtId(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder builderForValue) {
        if (extIdBuilder_ == null) {
          ensureExtIdIsMutable();
          extId_.add(index, builderForValue.build());
          onChanged();
        } else {
          extIdBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllExtId(
          java.lang.Iterable<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId> values) {
        if (extIdBuilder_ == null) {
          ensureExtIdIsMutable();
          super.addAll(values, extId_);
          onChanged();
        } else {
          extIdBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearExtId() {
        if (extIdBuilder_ == null) {
          extId_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
          onChanged();
        } else {
          extIdBuilder_.clear();
        }
        return this;
      }
      public Builder removeExtId(int index) {
        if (extIdBuilder_ == null) {
          ensureExtIdIsMutable();
          extId_.remove(index);
          onChanged();
        } else {
          extIdBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder getExtIdBuilder(
          int index) {
        return getExtIdFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder getExtIdOrBuilder(
          int index) {
        if (extIdBuilder_ == null) {
          return extId_.get(index);  } else {
          return extIdBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> 
           getExtIdOrBuilderList() {
        if (extIdBuilder_ != null) {
          return extIdBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(extId_);
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder addExtIdBuilder() {
        return getExtIdFieldBuilder().addBuilder(
            pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance());
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder addExtIdBuilder(
          int index) {
        return getExtIdFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder> 
           getExtIdBuilderList() {
        return getExtIdFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> 
          getExtIdFieldBuilder() {
        if (extIdBuilder_ == null) {
          extIdBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder>(
                  extId_,
                  ((bitField0_ & 0x00000100) == 0x00000100),
                  getParentForChildren(),
                  isClean());
          extId_ = null;
        }
        return extIdBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:Author)
    }
    
    static {
      defaultInstance = new Author(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Author)
  }
  
  public interface DocumentMetadataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string key = 1;
    boolean hasKey();
    String getKey();
    
    // optional string title = 2;
    boolean hasTitle();
    String getTitle();
    
    // optional string abstrakt = 3;
    boolean hasAbstrakt();
    String getAbstrakt();
    
    // repeated string keyword = 4;
    java.util.List<String> getKeywordList();
    int getKeywordCount();
    String getKeyword(int index);
    
    // repeated .Author author = 5;
    java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Author> 
        getAuthorList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.Author getAuthor(int index);
    int getAuthorCount();
    java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder> 
        getAuthorOrBuilderList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder getAuthorOrBuilder(
        int index);
    
    // repeated .DocumentMetadata reference = 6;
    java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata> 
        getReferenceList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata getReference(int index);
    int getReferenceCount();
    java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder> 
        getReferenceOrBuilderList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder getReferenceOrBuilder(
        int index);
    
    // optional int32 bibRefPosition = 7;
    boolean hasBibRefPosition();
    int getBibRefPosition();
    
    // optional string collection = 10;
    boolean hasCollection();
    String getCollection();
    
    // optional string doi = 11;
    boolean hasDoi();
    String getDoi();
    
    // optional string isbn = 12;
    boolean hasIsbn();
    String getIsbn();
    
    // optional string issn = 13;
    boolean hasIssn();
    String getIssn();
    
    // optional string issue = 14;
    boolean hasIssue();
    String getIssue();
    
    // optional string journal = 15;
    boolean hasJournal();
    String getJournal();
    
    // optional .ExtId extId = 16;
    boolean hasExtId();
    pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getExtId();
    pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder getExtIdOrBuilder();
    
    // repeated .ClassifCode classifCode = 17;
    java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode> 
        getClassifCodeList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode getClassifCode(int index);
    int getClassifCodeCount();
    java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder> 
        getClassifCodeOrBuilderList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder getClassifCodeOrBuilder(
        int index);
    
    // optional string pages = 18;
    boolean hasPages();
    String getPages();
    
    // optional string source = 19;
    boolean hasSource();
    String getSource();
    
    // optional string text = 20;
    boolean hasText();
    String getText();
    
    // optional string volume = 21;
    boolean hasVolume();
    String getVolume();
  }
  public static final class DocumentMetadata extends
      com.google.protobuf.GeneratedMessage
      implements DocumentMetadataOrBuilder {
    // Use DocumentMetadata.newBuilder() to construct.
    private DocumentMetadata(Builder builder) {
      super(builder);
    }
    private DocumentMetadata(boolean noInit) {}
    
    private static final DocumentMetadata defaultInstance;
    public static DocumentMetadata getDefaultInstance() {
      return defaultInstance;
    }
    
    public DocumentMetadata getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_DocumentMetadata_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_DocumentMetadata_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string title = 2;
    public static final int TITLE_FIELD_NUMBER = 2;
    private java.lang.Object title_;
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getTitle() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          title_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string abstrakt = 3;
    public static final int ABSTRAKT_FIELD_NUMBER = 3;
    private java.lang.Object abstrakt_;
    public boolean hasAbstrakt() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getAbstrakt() {
      java.lang.Object ref = abstrakt_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          abstrakt_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAbstraktBytes() {
      java.lang.Object ref = abstrakt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        abstrakt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated string keyword = 4;
    public static final int KEYWORD_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList keyword_;
    public java.util.List<String>
        getKeywordList() {
      return keyword_;
    }
    public int getKeywordCount() {
      return keyword_.size();
    }
    public String getKeyword(int index) {
      return keyword_.get(index);
    }
    
    // repeated .Author author = 5;
    public static final int AUTHOR_FIELD_NUMBER = 5;
    private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Author> author_;
    public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Author> getAuthorList() {
      return author_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder> 
        getAuthorOrBuilderList() {
      return author_;
    }
    public int getAuthorCount() {
      return author_.size();
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.Author getAuthor(int index) {
      return author_.get(index);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder getAuthorOrBuilder(
        int index) {
      return author_.get(index);
    }
    
    // repeated .DocumentMetadata reference = 6;
    public static final int REFERENCE_FIELD_NUMBER = 6;
    private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata> reference_;
    public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata> getReferenceList() {
      return reference_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder> 
        getReferenceOrBuilderList() {
      return reference_;
    }
    public int getReferenceCount() {
      return reference_.size();
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata getReference(int index) {
      return reference_.get(index);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder getReferenceOrBuilder(
        int index) {
      return reference_.get(index);
    }
    
    // optional int32 bibRefPosition = 7;
    public static final int BIBREFPOSITION_FIELD_NUMBER = 7;
    private int bibRefPosition_;
    public boolean hasBibRefPosition() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getBibRefPosition() {
      return bibRefPosition_;
    }
    
    // optional string collection = 10;
    public static final int COLLECTION_FIELD_NUMBER = 10;
    private java.lang.Object collection_;
    public boolean hasCollection() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getCollection() {
      java.lang.Object ref = collection_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          collection_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCollectionBytes() {
      java.lang.Object ref = collection_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        collection_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string doi = 11;
    public static final int DOI_FIELD_NUMBER = 11;
    private java.lang.Object doi_;
    public boolean hasDoi() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getDoi() {
      java.lang.Object ref = doi_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          doi_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDoiBytes() {
      java.lang.Object ref = doi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        doi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string isbn = 12;
    public static final int ISBN_FIELD_NUMBER = 12;
    private java.lang.Object isbn_;
    public boolean hasIsbn() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getIsbn() {
      java.lang.Object ref = isbn_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          isbn_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIsbnBytes() {
      java.lang.Object ref = isbn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        isbn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string issn = 13;
    public static final int ISSN_FIELD_NUMBER = 13;
    private java.lang.Object issn_;
    public boolean hasIssn() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public String getIssn() {
      java.lang.Object ref = issn_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          issn_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIssnBytes() {
      java.lang.Object ref = issn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        issn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string issue = 14;
    public static final int ISSUE_FIELD_NUMBER = 14;
    private java.lang.Object issue_;
    public boolean hasIssue() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public String getIssue() {
      java.lang.Object ref = issue_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          issue_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIssueBytes() {
      java.lang.Object ref = issue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        issue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string journal = 15;
    public static final int JOURNAL_FIELD_NUMBER = 15;
    private java.lang.Object journal_;
    public boolean hasJournal() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public String getJournal() {
      java.lang.Object ref = journal_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          journal_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getJournalBytes() {
      java.lang.Object ref = journal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        journal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .ExtId extId = 16;
    public static final int EXTID_FIELD_NUMBER = 16;
    private pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId extId_;
    public boolean hasExtId() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getExtId() {
      return extId_;
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder getExtIdOrBuilder() {
      return extId_;
    }
    
    // repeated .ClassifCode classifCode = 17;
    public static final int CLASSIFCODE_FIELD_NUMBER = 17;
    private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode> classifCode_;
    public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode> getClassifCodeList() {
      return classifCode_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder> 
        getClassifCodeOrBuilderList() {
      return classifCode_;
    }
    public int getClassifCodeCount() {
      return classifCode_.size();
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode getClassifCode(int index) {
      return classifCode_.get(index);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder getClassifCodeOrBuilder(
        int index) {
      return classifCode_.get(index);
    }
    
    // optional string pages = 18;
    public static final int PAGES_FIELD_NUMBER = 18;
    private java.lang.Object pages_;
    public boolean hasPages() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    public String getPages() {
      java.lang.Object ref = pages_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          pages_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPagesBytes() {
      java.lang.Object ref = pages_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        pages_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string source = 19;
    public static final int SOURCE_FIELD_NUMBER = 19;
    private java.lang.Object source_;
    public boolean hasSource() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    public String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          source_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string text = 20;
    public static final int TEXT_FIELD_NUMBER = 20;
    private java.lang.Object text_;
    public boolean hasText() {
      return ((bitField0_ & 0x00002000) == 0x00002000);
    }
    public String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          text_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string volume = 21;
    public static final int VOLUME_FIELD_NUMBER = 21;
    private java.lang.Object volume_;
    public boolean hasVolume() {
      return ((bitField0_ & 0x00004000) == 0x00004000);
    }
    public String getVolume() {
      java.lang.Object ref = volume_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          volume_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getVolumeBytes() {
      java.lang.Object ref = volume_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        volume_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      key_ = "";
      title_ = "";
      abstrakt_ = "";
      keyword_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      author_ = java.util.Collections.emptyList();
      reference_ = java.util.Collections.emptyList();
      bibRefPosition_ = 0;
      collection_ = "";
      doi_ = "";
      isbn_ = "";
      issn_ = "";
      issue_ = "";
      journal_ = "";
      extId_ = pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance();
      classifCode_ = java.util.Collections.emptyList();
      pages_ = "";
      source_ = "";
      text_ = "";
      volume_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAuthorCount(); i++) {
        if (!getAuthor(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getReferenceCount(); i++) {
        if (!getReference(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasExtId()) {
        if (!getExtId().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getClassifCodeCount(); i++) {
        if (!getClassifCode(i).isInitialized()) {
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTitleBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getAbstraktBytes());
      }
      for (int i = 0; i < keyword_.size(); i++) {
        output.writeBytes(4, keyword_.getByteString(i));
      }
      for (int i = 0; i < author_.size(); i++) {
        output.writeMessage(5, author_.get(i));
      }
      for (int i = 0; i < reference_.size(); i++) {
        output.writeMessage(6, reference_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(7, bibRefPosition_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(10, getCollectionBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(11, getDoiBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(12, getIsbnBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(13, getIssnBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(14, getIssueBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBytes(15, getJournalBytes());
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeMessage(16, extId_);
      }
      for (int i = 0; i < classifCode_.size(); i++) {
        output.writeMessage(17, classifCode_.get(i));
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBytes(18, getPagesBytes());
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeBytes(19, getSourceBytes());
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        output.writeBytes(20, getTextBytes());
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        output.writeBytes(21, getVolumeBytes());
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
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTitleBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getAbstraktBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < keyword_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(keyword_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getKeywordList().size();
      }
      for (int i = 0; i < author_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, author_.get(i));
      }
      for (int i = 0; i < reference_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, reference_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, bibRefPosition_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getCollectionBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getDoiBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(12, getIsbnBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(13, getIssnBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(14, getIssueBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(15, getJournalBytes());
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(16, extId_);
      }
      for (int i = 0; i < classifCode_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(17, classifCode_.get(i));
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(18, getPagesBytes());
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(19, getSourceBytes());
      }
      if (((bitField0_ & 0x00002000) == 0x00002000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(20, getTextBytes());
      }
      if (((bitField0_ & 0x00004000) == 0x00004000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(21, getVolumeBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_DocumentMetadata_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_DocumentMetadata_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getAuthorFieldBuilder();
          getReferenceFieldBuilder();
          getExtIdFieldBuilder();
          getClassifCodeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        title_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        abstrakt_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        keyword_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (authorBuilder_ == null) {
          author_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          authorBuilder_.clear();
        }
        if (referenceBuilder_ == null) {
          reference_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          referenceBuilder_.clear();
        }
        bibRefPosition_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        collection_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        doi_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        isbn_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        issn_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        issue_ = "";
        bitField0_ = (bitField0_ & ~0x00000800);
        journal_ = "";
        bitField0_ = (bitField0_ & ~0x00001000);
        if (extIdBuilder_ == null) {
          extId_ = pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance();
        } else {
          extIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00002000);
        if (classifCodeBuilder_ == null) {
          classifCode_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00004000);
        } else {
          classifCodeBuilder_.clear();
        }
        pages_ = "";
        bitField0_ = (bitField0_ & ~0x00008000);
        source_ = "";
        bitField0_ = (bitField0_ & ~0x00010000);
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00020000);
        volume_ = "";
        bitField0_ = (bitField0_ & ~0x00040000);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata result = new pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.title_ = title_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.abstrakt_ = abstrakt_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          keyword_ = new com.google.protobuf.UnmodifiableLazyStringList(
              keyword_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.keyword_ = keyword_;
        if (authorBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            author_ = java.util.Collections.unmodifiableList(author_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.author_ = author_;
        } else {
          result.author_ = authorBuilder_.build();
        }
        if (referenceBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            reference_ = java.util.Collections.unmodifiableList(reference_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.reference_ = reference_;
        } else {
          result.reference_ = referenceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000008;
        }
        result.bibRefPosition_ = bibRefPosition_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000010;
        }
        result.collection_ = collection_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000020;
        }
        result.doi_ = doi_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000040;
        }
        result.isbn_ = isbn_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000080;
        }
        result.issn_ = issn_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000100;
        }
        result.issue_ = issue_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00000200;
        }
        result.journal_ = journal_;
        if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
          to_bitField0_ |= 0x00000400;
        }
        if (extIdBuilder_ == null) {
          result.extId_ = extId_;
        } else {
          result.extId_ = extIdBuilder_.build();
        }
        if (classifCodeBuilder_ == null) {
          if (((bitField0_ & 0x00004000) == 0x00004000)) {
            classifCode_ = java.util.Collections.unmodifiableList(classifCode_);
            bitField0_ = (bitField0_ & ~0x00004000);
          }
          result.classifCode_ = classifCode_;
        } else {
          result.classifCode_ = classifCodeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
          to_bitField0_ |= 0x00000800;
        }
        result.pages_ = pages_;
        if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.source_ = source_;
        if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
          to_bitField0_ |= 0x00002000;
        }
        result.text_ = text_;
        if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
          to_bitField0_ |= 0x00004000;
        }
        result.volume_ = volume_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasTitle()) {
          setTitle(other.getTitle());
        }
        if (other.hasAbstrakt()) {
          setAbstrakt(other.getAbstrakt());
        }
        if (!other.keyword_.isEmpty()) {
          if (keyword_.isEmpty()) {
            keyword_ = other.keyword_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureKeywordIsMutable();
            keyword_.addAll(other.keyword_);
          }
          onChanged();
        }
        if (authorBuilder_ == null) {
          if (!other.author_.isEmpty()) {
            if (author_.isEmpty()) {
              author_ = other.author_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureAuthorIsMutable();
              author_.addAll(other.author_);
            }
            onChanged();
          }
        } else {
          if (!other.author_.isEmpty()) {
            if (authorBuilder_.isEmpty()) {
              authorBuilder_.dispose();
              authorBuilder_ = null;
              author_ = other.author_;
              bitField0_ = (bitField0_ & ~0x00000010);
              authorBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAuthorFieldBuilder() : null;
            } else {
              authorBuilder_.addAllMessages(other.author_);
            }
          }
        }
        if (referenceBuilder_ == null) {
          if (!other.reference_.isEmpty()) {
            if (reference_.isEmpty()) {
              reference_ = other.reference_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureReferenceIsMutable();
              reference_.addAll(other.reference_);
            }
            onChanged();
          }
        } else {
          if (!other.reference_.isEmpty()) {
            if (referenceBuilder_.isEmpty()) {
              referenceBuilder_.dispose();
              referenceBuilder_ = null;
              reference_ = other.reference_;
              bitField0_ = (bitField0_ & ~0x00000020);
              referenceBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getReferenceFieldBuilder() : null;
            } else {
              referenceBuilder_.addAllMessages(other.reference_);
            }
          }
        }
        if (other.hasBibRefPosition()) {
          setBibRefPosition(other.getBibRefPosition());
        }
        if (other.hasCollection()) {
          setCollection(other.getCollection());
        }
        if (other.hasDoi()) {
          setDoi(other.getDoi());
        }
        if (other.hasIsbn()) {
          setIsbn(other.getIsbn());
        }
        if (other.hasIssn()) {
          setIssn(other.getIssn());
        }
        if (other.hasIssue()) {
          setIssue(other.getIssue());
        }
        if (other.hasJournal()) {
          setJournal(other.getJournal());
        }
        if (other.hasExtId()) {
          mergeExtId(other.getExtId());
        }
        if (classifCodeBuilder_ == null) {
          if (!other.classifCode_.isEmpty()) {
            if (classifCode_.isEmpty()) {
              classifCode_ = other.classifCode_;
              bitField0_ = (bitField0_ & ~0x00004000);
            } else {
              ensureClassifCodeIsMutable();
              classifCode_.addAll(other.classifCode_);
            }
            onChanged();
          }
        } else {
          if (!other.classifCode_.isEmpty()) {
            if (classifCodeBuilder_.isEmpty()) {
              classifCodeBuilder_.dispose();
              classifCodeBuilder_ = null;
              classifCode_ = other.classifCode_;
              bitField0_ = (bitField0_ & ~0x00004000);
              classifCodeBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getClassifCodeFieldBuilder() : null;
            } else {
              classifCodeBuilder_.addAllMessages(other.classifCode_);
            }
          }
        }
        if (other.hasPages()) {
          setPages(other.getPages());
        }
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        if (other.hasText()) {
          setText(other.getText());
        }
        if (other.hasVolume()) {
          setVolume(other.getVolume());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasKey()) {
          
          return false;
        }
        for (int i = 0; i < getAuthorCount(); i++) {
          if (!getAuthor(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getReferenceCount(); i++) {
          if (!getReference(i).isInitialized()) {
            
            return false;
          }
        }
        if (hasExtId()) {
          if (!getExtId().isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getClassifCodeCount(); i++) {
          if (!getClassifCode(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              title_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              abstrakt_ = input.readBytes();
              break;
            }
            case 34: {
              ensureKeywordIsMutable();
              keyword_.add(input.readBytes());
              break;
            }
            case 42: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.Author.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addAuthor(subBuilder.buildPartial());
              break;
            }
            case 50: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addReference(subBuilder.buildPartial());
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              bibRefPosition_ = input.readInt32();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000080;
              collection_ = input.readBytes();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000100;
              doi_ = input.readBytes();
              break;
            }
            case 98: {
              bitField0_ |= 0x00000200;
              isbn_ = input.readBytes();
              break;
            }
            case 106: {
              bitField0_ |= 0x00000400;
              issn_ = input.readBytes();
              break;
            }
            case 114: {
              bitField0_ |= 0x00000800;
              issue_ = input.readBytes();
              break;
            }
            case 122: {
              bitField0_ |= 0x00001000;
              journal_ = input.readBytes();
              break;
            }
            case 130: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.newBuilder();
              if (hasExtId()) {
                subBuilder.mergeFrom(getExtId());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setExtId(subBuilder.buildPartial());
              break;
            }
            case 138: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addClassifCode(subBuilder.buildPartial());
              break;
            }
            case 146: {
              bitField0_ |= 0x00008000;
              pages_ = input.readBytes();
              break;
            }
            case 154: {
              bitField0_ |= 0x00010000;
              source_ = input.readBytes();
              break;
            }
            case 162: {
              bitField0_ |= 0x00020000;
              text_ = input.readBytes();
              break;
            }
            case 170: {
              bitField0_ |= 0x00040000;
              volume_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string key = 1;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
      }
      
      // optional string title = 2;
      private java.lang.Object title_ = "";
      public boolean hasTitle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getTitle() {
        java.lang.Object ref = title_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTitle(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        title_ = value;
        onChanged();
        return this;
      }
      public Builder clearTitle() {
        bitField0_ = (bitField0_ & ~0x00000002);
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      void setTitle(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        title_ = value;
        onChanged();
      }
      
      // optional string abstrakt = 3;
      private java.lang.Object abstrakt_ = "";
      public boolean hasAbstrakt() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getAbstrakt() {
        java.lang.Object ref = abstrakt_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          abstrakt_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAbstrakt(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        abstrakt_ = value;
        onChanged();
        return this;
      }
      public Builder clearAbstrakt() {
        bitField0_ = (bitField0_ & ~0x00000004);
        abstrakt_ = getDefaultInstance().getAbstrakt();
        onChanged();
        return this;
      }
      void setAbstrakt(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        abstrakt_ = value;
        onChanged();
      }
      
      // repeated string keyword = 4;
      private com.google.protobuf.LazyStringList keyword_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureKeywordIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          keyword_ = new com.google.protobuf.LazyStringArrayList(keyword_);
          bitField0_ |= 0x00000008;
         }
      }
      public java.util.List<String>
          getKeywordList() {
        return java.util.Collections.unmodifiableList(keyword_);
      }
      public int getKeywordCount() {
        return keyword_.size();
      }
      public String getKeyword(int index) {
        return keyword_.get(index);
      }
      public Builder setKeyword(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureKeywordIsMutable();
        keyword_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addKeyword(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureKeywordIsMutable();
        keyword_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllKeyword(
          java.lang.Iterable<String> values) {
        ensureKeywordIsMutable();
        super.addAll(values, keyword_);
        onChanged();
        return this;
      }
      public Builder clearKeyword() {
        keyword_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      void addKeyword(com.google.protobuf.ByteString value) {
        ensureKeywordIsMutable();
        keyword_.add(value);
        onChanged();
      }
      
      // repeated .Author author = 5;
      private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Author> author_ =
        java.util.Collections.emptyList();
      private void ensureAuthorIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          author_ = new java.util.ArrayList<pl.edu.icm.coansys.importers.model.DocumentProtos.Author>(author_);
          bitField0_ |= 0x00000010;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.Author, pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder> authorBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Author> getAuthorList() {
        if (authorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(author_);
        } else {
          return authorBuilder_.getMessageList();
        }
      }
      public int getAuthorCount() {
        if (authorBuilder_ == null) {
          return author_.size();
        } else {
          return authorBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author getAuthor(int index) {
        if (authorBuilder_ == null) {
          return author_.get(index);
        } else {
          return authorBuilder_.getMessage(index);
        }
      }
      public Builder setAuthor(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Author value) {
        if (authorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthorIsMutable();
          author_.set(index, value);
          onChanged();
        } else {
          authorBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setAuthor(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder builderForValue) {
        if (authorBuilder_ == null) {
          ensureAuthorIsMutable();
          author_.set(index, builderForValue.build());
          onChanged();
        } else {
          authorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAuthor(pl.edu.icm.coansys.importers.model.DocumentProtos.Author value) {
        if (authorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthorIsMutable();
          author_.add(value);
          onChanged();
        } else {
          authorBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addAuthor(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Author value) {
        if (authorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthorIsMutable();
          author_.add(index, value);
          onChanged();
        } else {
          authorBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addAuthor(
          pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder builderForValue) {
        if (authorBuilder_ == null) {
          ensureAuthorIsMutable();
          author_.add(builderForValue.build());
          onChanged();
        } else {
          authorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addAuthor(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder builderForValue) {
        if (authorBuilder_ == null) {
          ensureAuthorIsMutable();
          author_.add(index, builderForValue.build());
          onChanged();
        } else {
          authorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllAuthor(
          java.lang.Iterable<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.Author> values) {
        if (authorBuilder_ == null) {
          ensureAuthorIsMutable();
          super.addAll(values, author_);
          onChanged();
        } else {
          authorBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearAuthor() {
        if (authorBuilder_ == null) {
          author_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          authorBuilder_.clear();
        }
        return this;
      }
      public Builder removeAuthor(int index) {
        if (authorBuilder_ == null) {
          ensureAuthorIsMutable();
          author_.remove(index);
          onChanged();
        } else {
          authorBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder getAuthorBuilder(
          int index) {
        return getAuthorFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder getAuthorOrBuilder(
          int index) {
        if (authorBuilder_ == null) {
          return author_.get(index);  } else {
          return authorBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder> 
           getAuthorOrBuilderList() {
        if (authorBuilder_ != null) {
          return authorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(author_);
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder addAuthorBuilder() {
        return getAuthorFieldBuilder().addBuilder(
            pl.edu.icm.coansys.importers.model.DocumentProtos.Author.getDefaultInstance());
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder addAuthorBuilder(
          int index) {
        return getAuthorFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.importers.model.DocumentProtos.Author.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder> 
           getAuthorBuilderList() {
        return getAuthorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.Author, pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder> 
          getAuthorFieldBuilder() {
        if (authorBuilder_ == null) {
          authorBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.Author, pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.AuthorOrBuilder>(
                  author_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          author_ = null;
        }
        return authorBuilder_;
      }
      
      // repeated .DocumentMetadata reference = 6;
      private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata> reference_ =
        java.util.Collections.emptyList();
      private void ensureReferenceIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          reference_ = new java.util.ArrayList<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata>(reference_);
          bitField0_ |= 0x00000020;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder> referenceBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata> getReferenceList() {
        if (referenceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reference_);
        } else {
          return referenceBuilder_.getMessageList();
        }
      }
      public int getReferenceCount() {
        if (referenceBuilder_ == null) {
          return reference_.size();
        } else {
          return referenceBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata getReference(int index) {
        if (referenceBuilder_ == null) {
          return reference_.get(index);
        } else {
          return referenceBuilder_.getMessage(index);
        }
      }
      public Builder setReference(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata value) {
        if (referenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReferenceIsMutable();
          reference_.set(index, value);
          onChanged();
        } else {
          referenceBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setReference(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder builderForValue) {
        if (referenceBuilder_ == null) {
          ensureReferenceIsMutable();
          reference_.set(index, builderForValue.build());
          onChanged();
        } else {
          referenceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addReference(pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata value) {
        if (referenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReferenceIsMutable();
          reference_.add(value);
          onChanged();
        } else {
          referenceBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addReference(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata value) {
        if (referenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReferenceIsMutable();
          reference_.add(index, value);
          onChanged();
        } else {
          referenceBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addReference(
          pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder builderForValue) {
        if (referenceBuilder_ == null) {
          ensureReferenceIsMutable();
          reference_.add(builderForValue.build());
          onChanged();
        } else {
          referenceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addReference(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder builderForValue) {
        if (referenceBuilder_ == null) {
          ensureReferenceIsMutable();
          reference_.add(index, builderForValue.build());
          onChanged();
        } else {
          referenceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllReference(
          java.lang.Iterable<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata> values) {
        if (referenceBuilder_ == null) {
          ensureReferenceIsMutable();
          super.addAll(values, reference_);
          onChanged();
        } else {
          referenceBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearReference() {
        if (referenceBuilder_ == null) {
          reference_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          referenceBuilder_.clear();
        }
        return this;
      }
      public Builder removeReference(int index) {
        if (referenceBuilder_ == null) {
          ensureReferenceIsMutable();
          reference_.remove(index);
          onChanged();
        } else {
          referenceBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder getReferenceBuilder(
          int index) {
        return getReferenceFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder getReferenceOrBuilder(
          int index) {
        if (referenceBuilder_ == null) {
          return reference_.get(index);  } else {
          return referenceBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder> 
           getReferenceOrBuilderList() {
        if (referenceBuilder_ != null) {
          return referenceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reference_);
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder addReferenceBuilder() {
        return getReferenceFieldBuilder().addBuilder(
            pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.getDefaultInstance());
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder addReferenceBuilder(
          int index) {
        return getReferenceFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder> 
           getReferenceBuilderList() {
        return getReferenceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder> 
          getReferenceFieldBuilder() {
        if (referenceBuilder_ == null) {
          referenceBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadataOrBuilder>(
                  reference_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          reference_ = null;
        }
        return referenceBuilder_;
      }
      
      // optional int32 bibRefPosition = 7;
      private int bibRefPosition_ ;
      public boolean hasBibRefPosition() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getBibRefPosition() {
        return bibRefPosition_;
      }
      public Builder setBibRefPosition(int value) {
        bitField0_ |= 0x00000040;
        bibRefPosition_ = value;
        onChanged();
        return this;
      }
      public Builder clearBibRefPosition() {
        bitField0_ = (bitField0_ & ~0x00000040);
        bibRefPosition_ = 0;
        onChanged();
        return this;
      }
      
      // optional string collection = 10;
      private java.lang.Object collection_ = "";
      public boolean hasCollection() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public String getCollection() {
        java.lang.Object ref = collection_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          collection_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCollection(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        collection_ = value;
        onChanged();
        return this;
      }
      public Builder clearCollection() {
        bitField0_ = (bitField0_ & ~0x00000080);
        collection_ = getDefaultInstance().getCollection();
        onChanged();
        return this;
      }
      void setCollection(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000080;
        collection_ = value;
        onChanged();
      }
      
      // optional string doi = 11;
      private java.lang.Object doi_ = "";
      public boolean hasDoi() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public String getDoi() {
        java.lang.Object ref = doi_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          doi_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDoi(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        doi_ = value;
        onChanged();
        return this;
      }
      public Builder clearDoi() {
        bitField0_ = (bitField0_ & ~0x00000100);
        doi_ = getDefaultInstance().getDoi();
        onChanged();
        return this;
      }
      void setDoi(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000100;
        doi_ = value;
        onChanged();
      }
      
      // optional string isbn = 12;
      private java.lang.Object isbn_ = "";
      public boolean hasIsbn() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public String getIsbn() {
        java.lang.Object ref = isbn_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          isbn_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIsbn(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        isbn_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsbn() {
        bitField0_ = (bitField0_ & ~0x00000200);
        isbn_ = getDefaultInstance().getIsbn();
        onChanged();
        return this;
      }
      void setIsbn(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000200;
        isbn_ = value;
        onChanged();
      }
      
      // optional string issn = 13;
      private java.lang.Object issn_ = "";
      public boolean hasIssn() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public String getIssn() {
        java.lang.Object ref = issn_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          issn_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIssn(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        issn_ = value;
        onChanged();
        return this;
      }
      public Builder clearIssn() {
        bitField0_ = (bitField0_ & ~0x00000400);
        issn_ = getDefaultInstance().getIssn();
        onChanged();
        return this;
      }
      void setIssn(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000400;
        issn_ = value;
        onChanged();
      }
      
      // optional string issue = 14;
      private java.lang.Object issue_ = "";
      public boolean hasIssue() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      public String getIssue() {
        java.lang.Object ref = issue_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          issue_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIssue(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000800;
        issue_ = value;
        onChanged();
        return this;
      }
      public Builder clearIssue() {
        bitField0_ = (bitField0_ & ~0x00000800);
        issue_ = getDefaultInstance().getIssue();
        onChanged();
        return this;
      }
      void setIssue(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000800;
        issue_ = value;
        onChanged();
      }
      
      // optional string journal = 15;
      private java.lang.Object journal_ = "";
      public boolean hasJournal() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      public String getJournal() {
        java.lang.Object ref = journal_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          journal_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setJournal(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        journal_ = value;
        onChanged();
        return this;
      }
      public Builder clearJournal() {
        bitField0_ = (bitField0_ & ~0x00001000);
        journal_ = getDefaultInstance().getJournal();
        onChanged();
        return this;
      }
      void setJournal(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00001000;
        journal_ = value;
        onChanged();
      }
      
      // optional .ExtId extId = 16;
      private pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId extId_ = pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> extIdBuilder_;
      public boolean hasExtId() {
        return ((bitField0_ & 0x00002000) == 0x00002000);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId getExtId() {
        if (extIdBuilder_ == null) {
          return extId_;
        } else {
          return extIdBuilder_.getMessage();
        }
      }
      public Builder setExtId(pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId value) {
        if (extIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          extId_ = value;
          onChanged();
        } else {
          extIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00002000;
        return this;
      }
      public Builder setExtId(
          pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder builderForValue) {
        if (extIdBuilder_ == null) {
          extId_ = builderForValue.build();
          onChanged();
        } else {
          extIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00002000;
        return this;
      }
      public Builder mergeExtId(pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId value) {
        if (extIdBuilder_ == null) {
          if (((bitField0_ & 0x00002000) == 0x00002000) &&
              extId_ != pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance()) {
            extId_ =
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.newBuilder(extId_).mergeFrom(value).buildPartial();
          } else {
            extId_ = value;
          }
          onChanged();
        } else {
          extIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00002000;
        return this;
      }
      public Builder clearExtId() {
        if (extIdBuilder_ == null) {
          extId_ = pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.getDefaultInstance();
          onChanged();
        } else {
          extIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00002000);
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder getExtIdBuilder() {
        bitField0_ |= 0x00002000;
        onChanged();
        return getExtIdFieldBuilder().getBuilder();
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder getExtIdOrBuilder() {
        if (extIdBuilder_ != null) {
          return extIdBuilder_.getMessageOrBuilder();
        } else {
          return extId_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder> 
          getExtIdFieldBuilder() {
        if (extIdBuilder_ == null) {
          extIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ExtIdOrBuilder>(
                  extId_,
                  getParentForChildren(),
                  isClean());
          extId_ = null;
        }
        return extIdBuilder_;
      }
      
      // repeated .ClassifCode classifCode = 17;
      private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode> classifCode_ =
        java.util.Collections.emptyList();
      private void ensureClassifCodeIsMutable() {
        if (!((bitField0_ & 0x00004000) == 0x00004000)) {
          classifCode_ = new java.util.ArrayList<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode>(classifCode_);
          bitField0_ |= 0x00004000;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder> classifCodeBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode> getClassifCodeList() {
        if (classifCodeBuilder_ == null) {
          return java.util.Collections.unmodifiableList(classifCode_);
        } else {
          return classifCodeBuilder_.getMessageList();
        }
      }
      public int getClassifCodeCount() {
        if (classifCodeBuilder_ == null) {
          return classifCode_.size();
        } else {
          return classifCodeBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode getClassifCode(int index) {
        if (classifCodeBuilder_ == null) {
          return classifCode_.get(index);
        } else {
          return classifCodeBuilder_.getMessage(index);
        }
      }
      public Builder setClassifCode(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode value) {
        if (classifCodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClassifCodeIsMutable();
          classifCode_.set(index, value);
          onChanged();
        } else {
          classifCodeBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setClassifCode(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder builderForValue) {
        if (classifCodeBuilder_ == null) {
          ensureClassifCodeIsMutable();
          classifCode_.set(index, builderForValue.build());
          onChanged();
        } else {
          classifCodeBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addClassifCode(pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode value) {
        if (classifCodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClassifCodeIsMutable();
          classifCode_.add(value);
          onChanged();
        } else {
          classifCodeBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addClassifCode(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode value) {
        if (classifCodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClassifCodeIsMutable();
          classifCode_.add(index, value);
          onChanged();
        } else {
          classifCodeBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addClassifCode(
          pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder builderForValue) {
        if (classifCodeBuilder_ == null) {
          ensureClassifCodeIsMutable();
          classifCode_.add(builderForValue.build());
          onChanged();
        } else {
          classifCodeBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addClassifCode(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder builderForValue) {
        if (classifCodeBuilder_ == null) {
          ensureClassifCodeIsMutable();
          classifCode_.add(index, builderForValue.build());
          onChanged();
        } else {
          classifCodeBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllClassifCode(
          java.lang.Iterable<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode> values) {
        if (classifCodeBuilder_ == null) {
          ensureClassifCodeIsMutable();
          super.addAll(values, classifCode_);
          onChanged();
        } else {
          classifCodeBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearClassifCode() {
        if (classifCodeBuilder_ == null) {
          classifCode_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00004000);
          onChanged();
        } else {
          classifCodeBuilder_.clear();
        }
        return this;
      }
      public Builder removeClassifCode(int index) {
        if (classifCodeBuilder_ == null) {
          ensureClassifCodeIsMutable();
          classifCode_.remove(index);
          onChanged();
        } else {
          classifCodeBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder getClassifCodeBuilder(
          int index) {
        return getClassifCodeFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder getClassifCodeOrBuilder(
          int index) {
        if (classifCodeBuilder_ == null) {
          return classifCode_.get(index);  } else {
          return classifCodeBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder> 
           getClassifCodeOrBuilderList() {
        if (classifCodeBuilder_ != null) {
          return classifCodeBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(classifCode_);
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder addClassifCodeBuilder() {
        return getClassifCodeFieldBuilder().addBuilder(
            pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.getDefaultInstance());
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder addClassifCodeBuilder(
          int index) {
        return getClassifCodeFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder> 
           getClassifCodeBuilderList() {
        return getClassifCodeFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder> 
          getClassifCodeFieldBuilder() {
        if (classifCodeBuilder_ == null) {
          classifCodeBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCodeOrBuilder>(
                  classifCode_,
                  ((bitField0_ & 0x00004000) == 0x00004000),
                  getParentForChildren(),
                  isClean());
          classifCode_ = null;
        }
        return classifCodeBuilder_;
      }
      
      // optional string pages = 18;
      private java.lang.Object pages_ = "";
      public boolean hasPages() {
        return ((bitField0_ & 0x00008000) == 0x00008000);
      }
      public String getPages() {
        java.lang.Object ref = pages_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          pages_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPages(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00008000;
        pages_ = value;
        onChanged();
        return this;
      }
      public Builder clearPages() {
        bitField0_ = (bitField0_ & ~0x00008000);
        pages_ = getDefaultInstance().getPages();
        onChanged();
        return this;
      }
      void setPages(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00008000;
        pages_ = value;
        onChanged();
      }
      
      // optional string source = 19;
      private java.lang.Object source_ = "";
      public boolean hasSource() {
        return ((bitField0_ & 0x00010000) == 0x00010000);
      }
      public String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSource(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00010000;
        source_ = value;
        onChanged();
        return this;
      }
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00010000);
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      void setSource(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00010000;
        source_ = value;
        onChanged();
      }
      
      // optional string text = 20;
      private java.lang.Object text_ = "";
      public boolean hasText() {
        return ((bitField0_ & 0x00020000) == 0x00020000);
      }
      public String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setText(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00020000;
        text_ = value;
        onChanged();
        return this;
      }
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00020000);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      void setText(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00020000;
        text_ = value;
        onChanged();
      }
      
      // optional string volume = 21;
      private java.lang.Object volume_ = "";
      public boolean hasVolume() {
        return ((bitField0_ & 0x00040000) == 0x00040000);
      }
      public String getVolume() {
        java.lang.Object ref = volume_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          volume_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setVolume(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00040000;
        volume_ = value;
        onChanged();
        return this;
      }
      public Builder clearVolume() {
        bitField0_ = (bitField0_ & ~0x00040000);
        volume_ = getDefaultInstance().getVolume();
        onChanged();
        return this;
      }
      void setVolume(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00040000;
        volume_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:DocumentMetadata)
    }
    
    static {
      defaultInstance = new DocumentMetadata(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:DocumentMetadata)
  }
  
  public interface MediaOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string key = 1;
    boolean hasKey();
    String getKey();
    
    // required string mediaType = 2;
    boolean hasMediaType();
    String getMediaType();
    
    // required bytes content = 3;
    boolean hasContent();
    com.google.protobuf.ByteString getContent();
  }
  public static final class Media extends
      com.google.protobuf.GeneratedMessage
      implements MediaOrBuilder {
    // Use Media.newBuilder() to construct.
    private Media(Builder builder) {
      super(builder);
    }
    private Media(boolean noInit) {}
    
    private static final Media defaultInstance;
    public static Media getDefaultInstance() {
      return defaultInstance;
    }
    
    public Media getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Media_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Media_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string mediaType = 2;
    public static final int MEDIATYPE_FIELD_NUMBER = 2;
    private java.lang.Object mediaType_;
    public boolean hasMediaType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getMediaType() {
      java.lang.Object ref = mediaType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          mediaType_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMediaTypeBytes() {
      java.lang.Object ref = mediaType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        mediaType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required bytes content = 3;
    public static final int CONTENT_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString content_;
    public boolean hasContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    
    private void initFields() {
      key_ = "";
      mediaType_ = "";
      content_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMediaType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContent()) {
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
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMediaTypeBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, content_);
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
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMediaTypeBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, content_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.Media parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.Media prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Media_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_Media_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.Media.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        mediaType_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        content_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.Media.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.Media.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Media result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.Media buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Media result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.Media result = new pl.edu.icm.coansys.importers.model.DocumentProtos.Media(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mediaType_ = mediaType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.Media) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.Media)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.Media other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.Media.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasMediaType()) {
          setMediaType(other.getMediaType());
        }
        if (other.hasContent()) {
          setContent(other.getContent());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasKey()) {
          
          return false;
        }
        if (!hasMediaType()) {
          
          return false;
        }
        if (!hasContent()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              mediaType_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              content_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string key = 1;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
      }
      
      // required string mediaType = 2;
      private java.lang.Object mediaType_ = "";
      public boolean hasMediaType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getMediaType() {
        java.lang.Object ref = mediaType_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          mediaType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMediaType(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        mediaType_ = value;
        onChanged();
        return this;
      }
      public Builder clearMediaType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mediaType_ = getDefaultInstance().getMediaType();
        onChanged();
        return this;
      }
      void setMediaType(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        mediaType_ = value;
        onChanged();
      }
      
      // required bytes content = 3;
      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        content_ = value;
        onChanged();
        return this;
      }
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:Media)
    }
    
    static {
      defaultInstance = new Media(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Media)
  }
  
  public interface MediaContainerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .Media media = 1;
    java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Media> 
        getMediaList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.Media getMedia(int index);
    int getMediaCount();
    java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder> 
        getMediaOrBuilderList();
    pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder getMediaOrBuilder(
        int index);
  }
  public static final class MediaContainer extends
      com.google.protobuf.GeneratedMessage
      implements MediaContainerOrBuilder {
    // Use MediaContainer.newBuilder() to construct.
    private MediaContainer(Builder builder) {
      super(builder);
    }
    private MediaContainer(boolean noInit) {}
    
    private static final MediaContainer defaultInstance;
    public static MediaContainer getDefaultInstance() {
      return defaultInstance;
    }
    
    public MediaContainer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_MediaContainer_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_MediaContainer_fieldAccessorTable;
    }
    
    // repeated .Media media = 1;
    public static final int MEDIA_FIELD_NUMBER = 1;
    private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Media> media_;
    public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Media> getMediaList() {
      return media_;
    }
    public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder> 
        getMediaOrBuilderList() {
      return media_;
    }
    public int getMediaCount() {
      return media_.size();
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.Media getMedia(int index) {
      return media_.get(index);
    }
    public pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder getMediaOrBuilder(
        int index) {
      return media_.get(index);
    }
    
    private void initFields() {
      media_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getMediaCount(); i++) {
        if (!getMedia(i).isInitialized()) {
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
      for (int i = 0; i < media_.size(); i++) {
        output.writeMessage(1, media_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < media_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, media_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_MediaContainer_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.internal_static_MediaContainer_fieldAccessorTable;
      }
      
      // Construct using pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getMediaFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (mediaBuilder_ == null) {
          media_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          mediaBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer.getDescriptor();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer getDefaultInstanceForType() {
        return pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer.getDefaultInstance();
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer build() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer buildPartial() {
        pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer result = new pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer(this);
        int from_bitField0_ = bitField0_;
        if (mediaBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            media_ = java.util.Collections.unmodifiableList(media_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.media_ = media_;
        } else {
          result.media_ = mediaBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer) {
          return mergeFrom((pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer other) {
        if (other == pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer.getDefaultInstance()) return this;
        if (mediaBuilder_ == null) {
          if (!other.media_.isEmpty()) {
            if (media_.isEmpty()) {
              media_ = other.media_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMediaIsMutable();
              media_.addAll(other.media_);
            }
            onChanged();
          }
        } else {
          if (!other.media_.isEmpty()) {
            if (mediaBuilder_.isEmpty()) {
              mediaBuilder_.dispose();
              mediaBuilder_ = null;
              media_ = other.media_;
              bitField0_ = (bitField0_ & ~0x00000001);
              mediaBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMediaFieldBuilder() : null;
            } else {
              mediaBuilder_.addAllMessages(other.media_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getMediaCount(); i++) {
          if (!getMedia(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder subBuilder = pl.edu.icm.coansys.importers.model.DocumentProtos.Media.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addMedia(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .Media media = 1;
      private java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Media> media_ =
        java.util.Collections.emptyList();
      private void ensureMediaIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          media_ = new java.util.ArrayList<pl.edu.icm.coansys.importers.model.DocumentProtos.Media>(media_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.Media, pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder> mediaBuilder_;
      
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Media> getMediaList() {
        if (mediaBuilder_ == null) {
          return java.util.Collections.unmodifiableList(media_);
        } else {
          return mediaBuilder_.getMessageList();
        }
      }
      public int getMediaCount() {
        if (mediaBuilder_ == null) {
          return media_.size();
        } else {
          return mediaBuilder_.getCount();
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media getMedia(int index) {
        if (mediaBuilder_ == null) {
          return media_.get(index);
        } else {
          return mediaBuilder_.getMessage(index);
        }
      }
      public Builder setMedia(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Media value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.set(index, value);
          onChanged();
        } else {
          mediaBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setMedia(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.set(index, builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addMedia(pl.edu.icm.coansys.importers.model.DocumentProtos.Media value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.add(value);
          onChanged();
        } else {
          mediaBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addMedia(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Media value) {
        if (mediaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMediaIsMutable();
          media_.add(index, value);
          onChanged();
        } else {
          mediaBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addMedia(
          pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.add(builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addMedia(
          int index, pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder builderForValue) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.add(index, builderForValue.build());
          onChanged();
        } else {
          mediaBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllMedia(
          java.lang.Iterable<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.Media> values) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          super.addAll(values, media_);
          onChanged();
        } else {
          mediaBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearMedia() {
        if (mediaBuilder_ == null) {
          media_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          mediaBuilder_.clear();
        }
        return this;
      }
      public Builder removeMedia(int index) {
        if (mediaBuilder_ == null) {
          ensureMediaIsMutable();
          media_.remove(index);
          onChanged();
        } else {
          mediaBuilder_.remove(index);
        }
        return this;
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder getMediaBuilder(
          int index) {
        return getMediaFieldBuilder().getBuilder(index);
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder getMediaOrBuilder(
          int index) {
        if (mediaBuilder_ == null) {
          return media_.get(index);  } else {
          return mediaBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder> 
           getMediaOrBuilderList() {
        if (mediaBuilder_ != null) {
          return mediaBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(media_);
        }
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder addMediaBuilder() {
        return getMediaFieldBuilder().addBuilder(
            pl.edu.icm.coansys.importers.model.DocumentProtos.Media.getDefaultInstance());
      }
      public pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder addMediaBuilder(
          int index) {
        return getMediaFieldBuilder().addBuilder(
            index, pl.edu.icm.coansys.importers.model.DocumentProtos.Media.getDefaultInstance());
      }
      public java.util.List<pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder> 
           getMediaBuilderList() {
        return getMediaFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          pl.edu.icm.coansys.importers.model.DocumentProtos.Media, pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder> 
          getMediaFieldBuilder() {
        if (mediaBuilder_ == null) {
          mediaBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              pl.edu.icm.coansys.importers.model.DocumentProtos.Media, pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder, pl.edu.icm.coansys.importers.model.DocumentProtos.MediaOrBuilder>(
                  media_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          media_ = null;
        }
        return mediaBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:MediaContainer)
    }
    
    static {
      defaultInstance = new MediaContainer(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MediaContainer)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ClassifCode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ClassifCode_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ExtId_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ExtId_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AffiliationRef_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AffiliationRef_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Affiliation_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Affiliation_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Author_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Author_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DocumentMetadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DocumentMetadata_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Media_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Media_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MediaContainer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MediaContainer_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tbw2.proto\",\n\013ClassifCode\022\016\n\006source\030\001 \002" +
      "(\t\022\r\n\005value\030\002 \002(\t\"&\n\005ExtId\022\016\n\006source\030\001 \002" +
      "(\t\022\r\n\005value\030\002 \002(\t\"4\n\016AffiliationRef\022\013\n\003k" +
      "ey\030\001 \002(\t\022\025\n\raffiliationId\030\002 \002(\t\"?\n\013Affil" +
      "iation\022\013\n\003key\030\001 \002(\t\022\025\n\raffiliationId\030\002 \002" +
      "(\t\022\014\n\004text\030\003 \002(\t\"\275\001\n\006Author\022\013\n\003key\030\001 \002(\t" +
      "\022\021\n\tforenames\030\002 \001(\t\022\017\n\007surname\030\003 \001(\t\022\014\n\004" +
      "name\030\004 \001(\t\022\r\n\005email\030\005 \001(\t\022\'\n\016affiliation" +
      "Ref\030\006 \003(\0132\017.AffiliationRef\022\r\n\005docId\030\007 \001(" +
      "\t\022\026\n\016positionNumber\030\010 \001(\005\022\025\n\005extId\030\t \003(\013",
      "2\006.ExtId\"\374\002\n\020DocumentMetadata\022\013\n\003key\030\001 \002" +
      "(\t\022\r\n\005title\030\002 \001(\t\022\020\n\010abstrakt\030\003 \001(\t\022\017\n\007k" +
      "eyword\030\004 \003(\t\022\027\n\006author\030\005 \003(\0132\007.Author\022$\n" +
      "\treference\030\006 \003(\0132\021.DocumentMetadata\022\026\n\016b" +
      "ibRefPosition\030\007 \001(\005\022\022\n\ncollection\030\n \001(\t\022" +
      "\013\n\003doi\030\013 \001(\t\022\014\n\004isbn\030\014 \001(\t\022\014\n\004issn\030\r \001(\t" +
      "\022\r\n\005issue\030\016 \001(\t\022\017\n\007journal\030\017 \001(\t\022\025\n\005extI" +
      "d\030\020 \001(\0132\006.ExtId\022!\n\013classifCode\030\021 \003(\0132\014.C" +
      "lassifCode\022\r\n\005pages\030\022 \001(\t\022\016\n\006source\030\023 \001(" +
      "\t\022\014\n\004text\030\024 \001(\t\022\016\n\006volume\030\025 \001(\t\"8\n\005Media",
      "\022\013\n\003key\030\001 \002(\t\022\021\n\tmediaType\030\002 \002(\t\022\017\n\007cont" +
      "ent\030\003 \002(\014\"\'\n\016MediaContainer\022\025\n\005media\030\001 \003" +
      "(\0132\006.MediaB4\n\"pl.edu.icm.coansys.importe" +
      "rs.modelB\016DocumentProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ClassifCode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ClassifCode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ClassifCode_descriptor,
              new java.lang.String[] { "Source", "Value", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.ClassifCode.Builder.class);
          internal_static_ExtId_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_ExtId_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ExtId_descriptor,
              new java.lang.String[] { "Source", "Value", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.ExtId.Builder.class);
          internal_static_AffiliationRef_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_AffiliationRef_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AffiliationRef_descriptor,
              new java.lang.String[] { "Key", "AffiliationId", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.AffiliationRef.Builder.class);
          internal_static_Affiliation_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_Affiliation_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Affiliation_descriptor,
              new java.lang.String[] { "Key", "AffiliationId", "Text", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.Affiliation.Builder.class);
          internal_static_Author_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_Author_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Author_descriptor,
              new java.lang.String[] { "Key", "Forenames", "Surname", "Name", "Email", "AffiliationRef", "DocId", "PositionNumber", "ExtId", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.Author.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.Author.Builder.class);
          internal_static_DocumentMetadata_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_DocumentMetadata_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_DocumentMetadata_descriptor,
              new java.lang.String[] { "Key", "Title", "Abstrakt", "Keyword", "Author", "Reference", "BibRefPosition", "Collection", "Doi", "Isbn", "Issn", "Issue", "Journal", "ExtId", "ClassifCode", "Pages", "Source", "Text", "Volume", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.DocumentMetadata.Builder.class);
          internal_static_Media_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_Media_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Media_descriptor,
              new java.lang.String[] { "Key", "MediaType", "Content", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.Media.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.Media.Builder.class);
          internal_static_MediaContainer_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_MediaContainer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MediaContainer_descriptor,
              new java.lang.String[] { "Media", },
              pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer.class,
              pl.edu.icm.coansys.importers.model.DocumentProtos.MediaContainer.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
