package GrpcClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Message.proto")
public final class MessagesGrpc {

  private MessagesGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Messages";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Message.MessageIdRequested,
      GrpcClasses.Message.MessageModel> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Message.MessageIdRequested.class,
      responseType = GrpcClasses.Message.MessageModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Message.MessageIdRequested,
      GrpcClasses.Message.MessageModel> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Message.MessageIdRequested, GrpcClasses.Message.MessageModel> getFindByIdMethod;
    if ((getFindByIdMethod = MessagesGrpc.getFindByIdMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getFindByIdMethod = MessagesGrpc.getFindByIdMethod) == null) {
          MessagesGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Message.MessageIdRequested, GrpcClasses.Message.MessageModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageIdRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageModel.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Message.ChatIdRequested,
      GrpcClasses.Message.MessageModel> getFindAllMessagesForAChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllMessagesForAChat",
      requestType = GrpcClasses.Message.ChatIdRequested.class,
      responseType = GrpcClasses.Message.MessageModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Message.ChatIdRequested,
      GrpcClasses.Message.MessageModel> getFindAllMessagesForAChatMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Message.ChatIdRequested, GrpcClasses.Message.MessageModel> getFindAllMessagesForAChatMethod;
    if ((getFindAllMessagesForAChatMethod = MessagesGrpc.getFindAllMessagesForAChatMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getFindAllMessagesForAChatMethod = MessagesGrpc.getFindAllMessagesForAChatMethod) == null) {
          MessagesGrpc.getFindAllMessagesForAChatMethod = getFindAllMessagesForAChatMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Message.ChatIdRequested, GrpcClasses.Message.MessageModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllMessagesForAChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.ChatIdRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageModel.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("findAllMessagesForAChat"))
              .build();
        }
      }
    }
    return getFindAllMessagesForAChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Message.MessageModel,
      GrpcClasses.Message.MessageModel> getSaveMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveMessage",
      requestType = GrpcClasses.Message.MessageModel.class,
      responseType = GrpcClasses.Message.MessageModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Message.MessageModel,
      GrpcClasses.Message.MessageModel> getSaveMessageMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Message.MessageModel, GrpcClasses.Message.MessageModel> getSaveMessageMethod;
    if ((getSaveMessageMethod = MessagesGrpc.getSaveMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getSaveMessageMethod = MessagesGrpc.getSaveMessageMethod) == null) {
          MessagesGrpc.getSaveMessageMethod = getSaveMessageMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Message.MessageModel, GrpcClasses.Message.MessageModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageModel.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("saveMessage"))
              .build();
        }
      }
    }
    return getSaveMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Message.MessageIdRequested,
      GrpcClasses.Message.MessageDeleted> getDeleteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMessage",
      requestType = GrpcClasses.Message.MessageIdRequested.class,
      responseType = GrpcClasses.Message.MessageDeleted.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Message.MessageIdRequested,
      GrpcClasses.Message.MessageDeleted> getDeleteMessageMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Message.MessageIdRequested, GrpcClasses.Message.MessageDeleted> getDeleteMessageMethod;
    if ((getDeleteMessageMethod = MessagesGrpc.getDeleteMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getDeleteMessageMethod = MessagesGrpc.getDeleteMessageMethod) == null) {
          MessagesGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Message.MessageIdRequested, GrpcClasses.Message.MessageDeleted>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageIdRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Message.MessageDeleted.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("deleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesStub>() {
        @java.lang.Override
        public MessagesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesStub(channel, callOptions);
        }
      };
    return MessagesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesBlockingStub>() {
        @java.lang.Override
        public MessagesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesBlockingStub(channel, callOptions);
        }
      };
    return MessagesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesFutureStub>() {
        @java.lang.Override
        public MessagesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesFutureStub(channel, callOptions);
        }
      };
    return MessagesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessagesImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(GrpcClasses.Message.MessageIdRequested request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAllMessagesForAChat(GrpcClasses.Message.ChatIdRequested request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMessagesForAChatMethod(), responseObserver);
    }

    /**
     */
    public void saveMessage(GrpcClasses.Message.MessageModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMessageMethod(), responseObserver);
    }

    /**
     */
    public void deleteMessage(GrpcClasses.Message.MessageIdRequested request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageDeleted> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Message.MessageIdRequested,
                GrpcClasses.Message.MessageModel>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getFindAllMessagesForAChatMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Message.ChatIdRequested,
                GrpcClasses.Message.MessageModel>(
                  this, METHODID_FIND_ALL_MESSAGES_FOR_ACHAT)))
          .addMethod(
            getSaveMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Message.MessageModel,
                GrpcClasses.Message.MessageModel>(
                  this, METHODID_SAVE_MESSAGE)))
          .addMethod(
            getDeleteMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Message.MessageIdRequested,
                GrpcClasses.Message.MessageDeleted>(
                  this, METHODID_DELETE_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class MessagesStub extends io.grpc.stub.AbstractAsyncStub<MessagesStub> {
    private MessagesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesStub(channel, callOptions);
    }

    /**
     */
    public void findById(GrpcClasses.Message.MessageIdRequested request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllMessagesForAChat(GrpcClasses.Message.ChatIdRequested request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllMessagesForAChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveMessage(GrpcClasses.Message.MessageModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessage(GrpcClasses.Message.MessageIdRequested request,
        io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageDeleted> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessagesBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessagesBlockingStub> {
    private MessagesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.Message.MessageModel findById(GrpcClasses.Message.MessageIdRequested request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Message.MessageModel> findAllMessagesForAChat(
        GrpcClasses.Message.ChatIdRequested request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllMessagesForAChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Message.MessageModel saveMessage(GrpcClasses.Message.MessageModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Message.MessageDeleted deleteMessage(GrpcClasses.Message.MessageIdRequested request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessagesFutureStub extends io.grpc.stub.AbstractFutureStub<MessagesFutureStub> {
    private MessagesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Message.MessageModel> findById(
        GrpcClasses.Message.MessageIdRequested request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Message.MessageModel> saveMessage(
        GrpcClasses.Message.MessageModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Message.MessageDeleted> deleteMessage(
        GrpcClasses.Message.MessageIdRequested request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_FIND_ALL_MESSAGES_FOR_ACHAT = 1;
  private static final int METHODID_SAVE_MESSAGE = 2;
  private static final int METHODID_DELETE_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Message.MessageIdRequested) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel>) responseObserver);
          break;
        case METHODID_FIND_ALL_MESSAGES_FOR_ACHAT:
          serviceImpl.findAllMessagesForAChat((GrpcClasses.Message.ChatIdRequested) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel>) responseObserver);
          break;
        case METHODID_SAVE_MESSAGE:
          serviceImpl.saveMessage((GrpcClasses.Message.MessageModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageModel>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((GrpcClasses.Message.MessageIdRequested) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Message.MessageDeleted>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Messages");
    }
  }

  private static final class MessagesFileDescriptorSupplier
      extends MessagesBaseDescriptorSupplier {
    MessagesFileDescriptorSupplier() {}
  }

  private static final class MessagesMethodDescriptorSupplier
      extends MessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessagesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagesFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindAllMessagesForAChatMethod())
              .addMethod(getSaveMessageMethod())
              .addMethod(getDeleteMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
