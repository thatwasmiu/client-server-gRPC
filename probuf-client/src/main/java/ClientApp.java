import grpc.File;
import grpc.fileGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.FileOutputStream;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9091).build();
        System.out.println("hmmmmmmmmmmmmm");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1",9090).usePlaintext().build();
        fileGrpc.fileBlockingStub fileBlockingStub = fileGrpc.newBlockingStub(channel);

        File.Params params = File.Params.newBuilder().build();

        File.DataChunk dataChunk = fileBlockingStub.downloadFile(params).next();
        try (FileOutputStream fos = new FileOutputStream("server_output_file.txt")) {
            server.start();
            fos.write(dataChunk.getData().toByteArray());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        listFile().forEach(System.out::println);

        server.awaitTermination();
    }

    private static Set<String> listFile() {

            return Stream.of(Objects.requireNonNull(new java.io.File(System.getProperty("user.dir")).listFiles()))
                    .filter(file -> !file.isDirectory())
                    .map(java.io.File::getName)
                    .collect(Collectors.toSet());

    }
}
