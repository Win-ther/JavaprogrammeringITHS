package se.iths.Uppgifter.JavaLambda;

import java.util.function.LongUnaryOperator;

public class Exc8 {
    public static void main(String[] args) {
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (int i = 1; i <= n ; i++) {
                result *= i;
            }
            return result;
        };

        long factResult = factorial.applyAsLong(15);
        System.out.println(factResult);
    }
}
