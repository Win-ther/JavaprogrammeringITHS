package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Din summa är: "+getSum(a,b));
        System.out.println("Din produkt är: "+getProd(a,b));
    }
    public static int getSum(int a, int b){
        return a+b;
    }
    public static int getProd(int a, int b){
        return a*b;
    }
}
