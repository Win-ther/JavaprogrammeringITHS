package se.iths.Forelasningar.notes.DemoFiles;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaryDemo {
    public static void main(String[] args) {
        final int value = 123456789;
        Path path = Path.of(System.getProperty("user.home"), "test.bin");
        byte[] bytes = ByteBuffer.allocate(4).putInt(value).array();
        try {
            Files.write(path,bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            byte[] inputBytes = Files.readAllBytes(path);
            var restoredValue = ByteBuffer.wrap(inputBytes).getInt();
            System.out.println(restoredValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
