package se.iths.Uppgifter.JavaLambda;

import java.util.function.BiFunction;

public class Exc10 {
    public static void main(String[] args) {
        BiFunction<String,String,String> concatenate = (s1,s2) -> s1+s2;
        String s1 = "SEESESE";
        String s2 = "NONONO";

        String result = concatenate.apply(s1,s2);
        System.out.println(result);
    }
}
