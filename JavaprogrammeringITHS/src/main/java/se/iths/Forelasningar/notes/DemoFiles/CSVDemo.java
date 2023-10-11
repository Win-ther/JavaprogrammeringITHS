package se.iths.Forelasningar.notes.DemoFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CSVDemo {
    public static void main(String[] args) {
        var home = System.getProperty("user.home");
        Path path = Path.of(home, "cakes.csv");
        if (!Files.exists(path)) {
            System.out.println("cakes.csv not found");
            return;
        }
        try {
            System.out.println(Files.size(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Cake> cakes = List.of();
        try (Stream<String> lines = Files.lines(path)) {
            cakes = lines.skip(1)
                    .map(s -> s.split(","))
                    .map(CSVDemo::convert)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .toList();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        cakes.forEach(System.out::println);
    }

    private static Optional<Cake> convert(String[] c) {
        try{
            return Optional.of(new Cake(Integer.parseInt(c[0].trim()), c[1], Integer.parseInt(c[2].trim())));
        }catch (Exception e){
            return Optional.empty();
        }
    }
}
