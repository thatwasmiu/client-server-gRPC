package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: file.proto")
public final class fileGrpc {

  private fileGrpc() {}

  public static final String SERVICE_NAME = "file";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<File.Params,
      File.Files> getGetFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFile",
      requestType = File.Params.class,
      responseType = File.Files.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<File.Params,
      File.Files> getGetFileMethod() {
    io.grpc.MethodDescriptor<File.Params, File.Files> getGetFileMethod;
    if ((getGetFileMethod = fileGrpc.getGetFileMethod) == null) {
      synchronized (fileGrpc.class) {
        if ((getGetFileMethod = fileGrpc.getGetFileMethod) == null) {
          fileGrpc.getGetFileMethod = getGetFileMethod = 
              io.grpc.MethodDescriptor.<File.Params, File.Files>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file", "getFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  File.Params.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  File.Files.getDefaultInstance()))
                  .setSchemaDescriptor(new fileMethodDescriptorSupplier("getFile"))
                  .build();
          }
        }
     }
     return getGetFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<File.Params,
      File.DataChunk> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "downloadFile",
      requestType = File.Params.class,
      responseType = File.DataChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<File.Params,
      File.DataChunk> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<File.Params, File.DataChunk> getDownloadFileMethod;
    if ((getDownloadFileMethod = fileGrpc.getDownloadFileMethod) == null) {
      synchronized (fileGrpc.class) {
        if ((getDownloadFileMethod = fileGrpc.getDownloadFileMethod) == null) {
          fileGrpc.getDownloadFileMethod = getDownloadFileMethod = 
              io.grpc.MethodDescriptor.<File.Params, File.DataChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "file", "downloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  File.Params.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  File.DataChunk.getDefaultInstance()))
                  .setSchemaDescriptor(new fileMethodDescriptorSupplier("downloadFile"))
                  .build();
          }
        }
     }
     return getDownloadFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static fileStub newStub(io.grpc.Channel channel) {
    return new fileStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static fileBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new fileBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static fileFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new fileFutureStub(channel);
  }

  /**
   */
  public static abstract class fileImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFile(File.Params request,
                        io.grpc.stub.StreamObserver<File.Files> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileMethod(), responseObserver);
    }

    /**
     */
    public void downloadFile(File.Params request,
                             io.grpc.stub.StreamObserver<File.DataChunk> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                File.Params,
                File.Files>(
                  this, METHODID_GET_FILE)))
          .addMethod(
            getDownloadFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                File.Params,
                File.DataChunk>(
                  this, METHODID_DOWNLOAD_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class fileStub extends io.grpc.stub.AbstractStub<fileStub> {
    private fileStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fileStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected fileStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fileStub(channel, callOptions);
    }

    /**
     */
    public void getFile(File.Params request,
                        io.grpc.stub.StreamObserver<File.Files> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadFile(File.Params request,
                             io.grpc.stub.StreamObserver<File.DataChunk> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class fileBlockingStub extends io.grpc.stub.AbstractStub<fileBlockingStub> {
    private fileBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fileBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected fileBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fileBlockingStub(channel, callOptions);
    }

    /**
     */
    public File.Files getFile(File.Params request) {
      return blockingUnaryCall(
          getChannel(), getGetFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<File.DataChunk> downloadFile(
        File.Params request) {
      return blockingServerStreamingCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class fileFutureStub extends io.grpc.stub.AbstractStub<fileFutureStub> {
    private fileFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fileFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected fileFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fileFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<File.Files> getFile(
        File.Params request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FILE = 0;
  private static final int METHODID_DOWNLOAD_FILE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final fileImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(fileImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FILE:
          serviceImpl.getFile((File.Params) request,
              (io.grpc.stub.StreamObserver<File.Files>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((File.Params) request,
              (io.grpc.stub.StreamObserver<File.DataChunk>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class fileBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    fileBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return File.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("file");
    }
  }

  private static final class fileFileDescriptorSupplier
      extends fileBaseDescriptorSupplier {
    fileFileDescriptorSupplier() {}
  }

  private static final class fileMethodDescriptorSupplier
      extends fileBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    fileMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (fileGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new fileFileDescriptorSupplier())
              .addMethod(getGetFileMethod())
              .addMethod(getDownloadFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
