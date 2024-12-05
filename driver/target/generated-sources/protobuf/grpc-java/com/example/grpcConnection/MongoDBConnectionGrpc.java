package com.example.grpcConnection;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: driver_connection.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MongoDBConnectionGrpc {

  private MongoDBConnectionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MongoDBConnection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpcConnection.CommandRequest,
      com.example.grpcConnection.CommandExecutionResult> getExecuteCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteCommand",
      requestType = com.example.grpcConnection.CommandRequest.class,
      responseType = com.example.grpcConnection.CommandExecutionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpcConnection.CommandRequest,
      com.example.grpcConnection.CommandExecutionResult> getExecuteCommandMethod() {
    io.grpc.MethodDescriptor<com.example.grpcConnection.CommandRequest, com.example.grpcConnection.CommandExecutionResult> getExecuteCommandMethod;
    if ((getExecuteCommandMethod = MongoDBConnectionGrpc.getExecuteCommandMethod) == null) {
      synchronized (MongoDBConnectionGrpc.class) {
        if ((getExecuteCommandMethod = MongoDBConnectionGrpc.getExecuteCommandMethod) == null) {
          MongoDBConnectionGrpc.getExecuteCommandMethod = getExecuteCommandMethod =
              io.grpc.MethodDescriptor.<com.example.grpcConnection.CommandRequest, com.example.grpcConnection.CommandExecutionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcConnection.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpcConnection.CommandExecutionResult.getDefaultInstance()))
              .setSchemaDescriptor(new MongoDBConnectionMethodDescriptorSupplier("ExecuteCommand"))
              .build();
        }
      }
    }
    return getExecuteCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MongoDBConnectionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MongoDBConnectionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MongoDBConnectionStub>() {
        @java.lang.Override
        public MongoDBConnectionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MongoDBConnectionStub(channel, callOptions);
        }
      };
    return MongoDBConnectionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MongoDBConnectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MongoDBConnectionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MongoDBConnectionBlockingStub>() {
        @java.lang.Override
        public MongoDBConnectionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MongoDBConnectionBlockingStub(channel, callOptions);
        }
      };
    return MongoDBConnectionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MongoDBConnectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MongoDBConnectionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MongoDBConnectionFutureStub>() {
        @java.lang.Override
        public MongoDBConnectionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MongoDBConnectionFutureStub(channel, callOptions);
        }
      };
    return MongoDBConnectionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.example.grpcConnection.CommandRequest> executeCommand(
        io.grpc.stub.StreamObserver<com.example.grpcConnection.CommandExecutionResult> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getExecuteCommandMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MongoDBConnection.
   */
  public static abstract class MongoDBConnectionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MongoDBConnectionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MongoDBConnection.
   */
  public static final class MongoDBConnectionStub
      extends io.grpc.stub.AbstractAsyncStub<MongoDBConnectionStub> {
    private MongoDBConnectionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MongoDBConnectionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MongoDBConnectionStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpcConnection.CommandRequest> executeCommand(
        io.grpc.stub.StreamObserver<com.example.grpcConnection.CommandExecutionResult> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getExecuteCommandMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MongoDBConnection.
   */
  public static final class MongoDBConnectionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MongoDBConnectionBlockingStub> {
    private MongoDBConnectionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MongoDBConnectionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MongoDBConnectionBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MongoDBConnection.
   */
  public static final class MongoDBConnectionFutureStub
      extends io.grpc.stub.AbstractFutureStub<MongoDBConnectionFutureStub> {
    private MongoDBConnectionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MongoDBConnectionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MongoDBConnectionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EXECUTE_COMMAND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_COMMAND:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeCommand(
              (io.grpc.stub.StreamObserver<com.example.grpcConnection.CommandExecutionResult>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getExecuteCommandMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.grpcConnection.CommandRequest,
              com.example.grpcConnection.CommandExecutionResult>(
                service, METHODID_EXECUTE_COMMAND)))
        .build();
  }

  private static abstract class MongoDBConnectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MongoDBConnectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpcConnection.DriverConnection.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MongoDBConnection");
    }
  }

  private static final class MongoDBConnectionFileDescriptorSupplier
      extends MongoDBConnectionBaseDescriptorSupplier {
    MongoDBConnectionFileDescriptorSupplier() {}
  }

  private static final class MongoDBConnectionMethodDescriptorSupplier
      extends MongoDBConnectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MongoDBConnectionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MongoDBConnectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MongoDBConnectionFileDescriptorSupplier())
              .addMethod(getExecuteCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
