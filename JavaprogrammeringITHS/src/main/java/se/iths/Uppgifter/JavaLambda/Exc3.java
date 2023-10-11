package se.iths.Uppgifter.JavaLambda;

import java.util.Arrays;
import java.util.List;

public class Exc3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Green","BlUe","RDE");
        System.out.println(stringList);
        stringList.replaceAll(s -> s.toLowerCase());
        System.out.println(stringList);

        stringList.replaceAll(String::toUpperCase);
        System.out.println(stringList);
    }
}
