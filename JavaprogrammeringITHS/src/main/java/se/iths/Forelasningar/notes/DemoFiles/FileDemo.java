package se.iths.Forelasningar.notes.DemoFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FileDemo {
    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
        Path path = Path.of(userHome, "readme.txt");
        System.out.println(path);
        System.out.println(Files.exists(path));

        try {
            Files.delete(path);
            //if (!Files.exists(path)) {
            //    Files.createFile(path);
            //}
            //FileTime fileTime = Files.getLastModifiedTime(path);
            //System.out.println(fileTime.toInstant().atZone(ZoneId.of("UTC+2")));

        } catch (IOException e) {
            //System.out.println("Could not create file " + e.getMessage());
        }
        try {
            Files.writeString(path, "Hello there\t");
            Files.writeString(path, "Gänäröl Känåbi\n", StandardOpenOption.APPEND);
            Files.writeString(path, "Hungrig\n", StandardOpenOption.APPEND);
            Files.writeString(path, "Kalle Anka\n", StandardOpenOption.APPEND);
            Files.writeString(path, "Universal studios\n", StandardOpenOption.APPEND);
            String fileContent = Files.readString(path);
            System.out.println(fileContent);

        } catch (IOException e) {
            System.out.println("Could not access file "+e.getMessage());
        }
        //Stänger streamen om något går fel i fil läsningen
        try(Stream<String> stringStream = Files.lines(path)) {
            stringStream.filter(s -> !s.startsWith("H")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Could not access file "+e.getMessage());
        }

    }
}
