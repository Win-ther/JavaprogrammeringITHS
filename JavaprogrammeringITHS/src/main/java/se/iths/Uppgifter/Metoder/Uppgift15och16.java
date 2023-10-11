package se.iths.Uppgifter.Metoder;

public class Uppgift15och16 {
    public static void main(String[] args) {
        System.out.println(factorialLoop(9));
        System.out.println(factorialRecursive(9));
    }
    public static int factorialLoop(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum*i;
        }
        return sum;
    }
    public static int factorialRecursive(int n){
        if (n == 1)
            return n;
        else
            return n*factorialRecursive(n-1);
    }
}
