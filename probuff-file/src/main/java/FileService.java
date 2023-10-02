import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import grpc.File;
import grpc.fileGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService extends fileGrpc.fileImplBase {
    @Override
    public void getFile(File.Params request, StreamObserver<File.Files> responseObserver) {
        System.out.println("mom");
        File.Content content = FileStaticObject.content;
        File.Files files = File.Files.newBuilder().addContents(content).build();
        System.getProperty("user.dir");
        responseObserver.onNext(files);
        responseObserver.onCompleted();
    }

    @Override
    public void downloadFile(File.Params request, StreamObserver<File.DataChunk> responseObserver) {
        try {
            // read the file and convert to a byte array
            System.out.println("Prepare file!");
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("content.txt");
            byte[] bytes = ByteStreams.toByteArray(inputStream);

            responseObserver.onNext(File.DataChunk.newBuilder()
                        .setData(ByteString.copyFrom(bytes))
                        .setSize(bytes.length)
                        .build());

            responseObserver.onCompleted();
        } catch (Throwable e) {
            responseObserver.onError(Status.ABORTED
                    .withDescription("Unable to acquire the image ")
                    .withCause(e)
                    .asException());
        }
    }
}
