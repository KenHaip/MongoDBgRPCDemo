package com.example.routeguide;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: route_guide.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RouteGuideGrpc {

  private RouteGuideGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RouteGuide";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.routeguide.Point,
      com.example.routeguide.Feature> getGetFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeature",
      requestType = com.example.routeguide.Point.class,
      responseType = com.example.routeguide.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.routeguide.Point,
      com.example.routeguide.Feature> getGetFeatureMethod() {
    io.grpc.MethodDescriptor<com.example.routeguide.Point, com.example.routeguide.Feature> getGetFeatureMethod;
    if ((getGetFeatureMethod = RouteGuideGrpc.getGetFeatureMethod) == null) {
      synchronized (RouteGuideGrpc.class) {
        if ((getGetFeatureMethod = RouteGuideGrpc.getGetFeatureMethod) == null) {
          RouteGuideGrpc.getGetFeatureMethod = getGetFeatureMethod =
              io.grpc.MethodDescriptor.<com.example.routeguide.Point, com.example.routeguide.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.routeguide.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.routeguide.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideMethodDescriptorSupplier("GetFeature"))
              .build();
        }
      }
    }
    return getGetFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.routeguide.RouteNote,
      com.example.routeguide.RouteNote> getRouteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteChat",
      requestType = com.example.routeguide.RouteNote.class,
      responseType = com.example.routeguide.RouteNote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.routeguide.RouteNote,
      com.example.routeguide.RouteNote> getRouteChatMethod() {
    io.grpc.MethodDescriptor<com.example.routeguide.RouteNote, com.example.routeguide.RouteNote> getRouteChatMethod;
    if ((getRouteChatMethod = RouteGuideGrpc.getRouteChatMethod) == null) {
      synchronized (RouteGuideGrpc.class) {
        if ((getRouteChatMethod = RouteGuideGrpc.getRouteChatMethod) == null) {
          RouteGuideGrpc.getRouteChatMethod = getRouteChatMethod =
              io.grpc.MethodDescriptor.<com.example.routeguide.RouteNote, com.example.routeguide.RouteNote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.routeguide.RouteNote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.routeguide.RouteNote.getDefaultInstance()))
              .setSchemaDescriptor(new RouteGuideMethodDescriptorSupplier("RouteChat"))
              .build();
        }
      }
    }
    return getRouteChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteGuideStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideStub>() {
        @java.lang.Override
        public RouteGuideStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideStub(channel, callOptions);
        }
      };
    return RouteGuideStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideBlockingStub>() {
        @java.lang.Override
        public RouteGuideBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideBlockingStub(channel, callOptions);
        }
      };
    return RouteGuideBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteGuideFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteGuideFutureStub>() {
        @java.lang.Override
        public RouteGuideFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteGuideFutureStub(channel, callOptions);
        }
      };
    return RouteGuideFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFeature(com.example.routeguide.Point request,
        io.grpc.stub.StreamObserver<com.example.routeguide.Feature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeatureMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.example.routeguide.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.example.routeguide.RouteNote> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRouteChatMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RouteGuide.
   */
  public static abstract class RouteGuideImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RouteGuideGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RouteGuide.
   */
  public static final class RouteGuideStub
      extends io.grpc.stub.AbstractAsyncStub<RouteGuideStub> {
    private RouteGuideStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideStub(channel, callOptions);
    }

    /**
     */
    public void getFeature(com.example.routeguide.Point request,
        io.grpc.stub.StreamObserver<com.example.routeguide.Feature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.routeguide.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.example.routeguide.RouteNote> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRouteChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RouteGuide.
   */
  public static final class RouteGuideBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RouteGuideBlockingStub> {
    private RouteGuideBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.routeguide.Feature getFeature(com.example.routeguide.Point request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RouteGuide.
   */
  public static final class RouteGuideFutureStub
      extends io.grpc.stub.AbstractFutureStub<RouteGuideFutureStub> {
    private RouteGuideFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteGuideFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.routeguide.Feature> getFeature(
        com.example.routeguide.Point request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_ROUTE_CHAT = 1;

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
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((com.example.routeguide.Point) request,
              (io.grpc.stub.StreamObserver<com.example.routeguide.Feature>) responseObserver);
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
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<com.example.routeguide.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetFeatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.routeguide.Point,
              com.example.routeguide.Feature>(
                service, METHODID_GET_FEATURE)))
        .addMethod(
          getRouteChatMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.routeguide.RouteNote,
              com.example.routeguide.RouteNote>(
                service, METHODID_ROUTE_CHAT)))
        .build();
  }

  private static abstract class RouteGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteGuideBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.routeguide.RouteGuideOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteGuide");
    }
  }

  private static final class RouteGuideFileDescriptorSupplier
      extends RouteGuideBaseDescriptorSupplier {
    RouteGuideFileDescriptorSupplier() {}
  }

  private static final class RouteGuideMethodDescriptorSupplier
      extends RouteGuideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RouteGuideMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RouteGuideGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteGuideFileDescriptorSupplier())
              .addMethod(getGetFeatureMethod())
              .addMethod(getRouteChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
