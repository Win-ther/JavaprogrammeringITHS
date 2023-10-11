package se.iths.Uppgifter.JavaLambda;

import java.util.Arrays;
import java.util.List;

public class Exc5 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Spent","Fent","Gwent","Aent","Kent");
        System.out.println(stringList.stream().sorted().toList());
        System.out.println(stringList);
        stringList.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(stringList);
    }
}
