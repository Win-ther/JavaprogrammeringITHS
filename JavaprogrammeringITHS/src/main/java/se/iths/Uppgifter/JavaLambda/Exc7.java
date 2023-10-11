package se.iths.Uppgifter.JavaLambda;

import java.util.Arrays;
import java.util.List;

public class Exc7 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,1,4,5,4,6,7,6,8,9,7);
        System.out.println(intList);
        intList.stream().distinct().forEach(System.out::println);
    }
}
