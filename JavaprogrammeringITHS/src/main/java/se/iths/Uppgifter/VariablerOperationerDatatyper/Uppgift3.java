package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double dV = in.nextDouble();
        System.out.println("Double: " +dV);
        int iV = (int)dV;
        System.out.println("Made to Integer: " + iV);
        int rV = (int) Math.round(dV);
        System.out.println("Rounded to closest Integer: "+rV);
    }
}
