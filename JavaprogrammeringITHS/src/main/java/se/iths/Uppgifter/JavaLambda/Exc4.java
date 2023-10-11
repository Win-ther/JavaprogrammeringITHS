package se.iths.Uppgifter.JavaLambda;

import java.util.Arrays;
import java.util.List;

public class Exc4 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(intList);
        List<Integer> evenList = intList.stream().filter(n -> n%2 == 0).toList();
        System.out.println(evenList);
        List<Integer> oddList = intList.stream().filter(n -> n%2 != 0).toList();
        System.out.println(oddList);
    }
}
