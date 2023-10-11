package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        double a, b;
        a = in.nextInt();
        b = in.nextInt();
        printMV(a,b);
    }
    public static void printMV(double a, double b){
        double sum = (a+b)/2;
        System.out.println("Medelvärdet är: "+sum);
    }
}
