package se.iths.Forelasningar.notes.DemoFiles;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonDemo {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(System.getProperty("user.home"), "list.json");

        List<Cake> list = new ArrayList<>();
        list.add(new Cake(1, "Test1", 100));
        list.add(new Cake(2, "Test2", 200));
        list.add(new Cake(3, "Test3", 300));
        list.add(new Cake(4, "Test4", 400));
        list.add(new Cake(5, "Test5", 500));

        new ObjectMapper().writeValue(Files.newOutputStream(path), list);

        var result = new ObjectMapper().readValue(Files.newInputStream(path), Cake[].class);

        System.out.println(Arrays.toString(result));
    }
}
