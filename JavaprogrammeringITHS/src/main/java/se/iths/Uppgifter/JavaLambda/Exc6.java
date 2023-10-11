package se.iths.Uppgifter.JavaLambda;

import java.util.Arrays;
import java.util.List;

public class Exc6 {
    public static void main(String[] args) {
        List<Double> dList = Arrays.asList(1.1,5.1,7.4,5.3,19.6,12.2,1.3,4.5,3.6,6.5);
        double average = dList.stream().mapToDouble(d -> d/ dList.size()).sum();
        double average2 = dList.stream().mapToDouble(d -> d).average().orElse(0.0);
        System.out.println(average);
        System.out.println(average2);
    }
}
