package se.iths.Uppgifter.JavaLambda;

public class Exc1 {
    public static void main(String[] args) {
        SumCalc sumCalculator = (x,y) -> x+y;
        System.out.println(sumCalculator.sum(5,7));

    }
}
interface SumCalc {
    int sum(int a, int b);
}
