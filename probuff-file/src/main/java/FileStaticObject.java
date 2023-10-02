import grpc.File;

public class FileStaticObject {
    public static File.Content content = File.Content.newBuilder()
            .setId(1)
            .setTitle("Hello Mom")
            .setContent("Hello mommy!!")
            .build();
}
