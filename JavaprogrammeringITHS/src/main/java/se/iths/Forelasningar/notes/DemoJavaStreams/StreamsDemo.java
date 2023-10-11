package se.iths.Forelasningar.notes.DemoJavaStreams;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("Hej", "Halla", "Bleh", "Altan", "Ben");
        strings.stream()
                .peek(p -> System.out.println("Value before B-filter: "+p))
                .filter(s -> s.startsWith("B"))
                .peek(p -> System.out.println("Value after B-filter: "+p))
                .filter(s -> s.endsWith("h"))
                .forEach(System.out::println);


    }
}
