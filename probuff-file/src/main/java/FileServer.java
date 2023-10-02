import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class FileServer {
    public static void main(String args[]) throws IOException, InterruptedException {

        System.out.println("starting GRPC Server");
        Server server = ServerBuilder.forPort(9090).addService(

                new FileService()).build();

        server.start();
        System.out.println(System.getProperty("user.dir"));
        System.out.println("server started at "+ server.getPort());
        server.awaitTermination();
    }
}
