package se.iths.Uppgifter.Metoder;

public class Uppgift2 {
    public static void main(String[] args) {
       int sum= unlimitedParameters(32,4,5,6,7,8,9);
        System.out.println(sum);
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static int multi(int a, int b, int c){
        return a*b*c;
    }
    public static int unlimitedParameters(int...x){
        int sum = 0;
        for (int j : x) {
            sum += j;
        }
        return sum;
    }
}
