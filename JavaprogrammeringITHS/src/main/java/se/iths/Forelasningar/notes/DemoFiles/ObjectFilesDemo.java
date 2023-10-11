package se.iths.Forelasningar.notes.DemoFiles;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ObjectFilesDemo {
    public static void main(String[] args) {
        Path path = Path.of(System.getProperty("user.home"), "list.bin");
        List<Cake> list = new ArrayList<>();
        list.add(new Cake(1,"Test",3));
        list.add(new Cake(2,"Test1",33));
        list.add(new Cake(3,"Test2",23));
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            // handle objectoutputstream
            oos.writeObject(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))) {
            // handle objectoutputstream
            list = (List<Cake>) oos.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}
