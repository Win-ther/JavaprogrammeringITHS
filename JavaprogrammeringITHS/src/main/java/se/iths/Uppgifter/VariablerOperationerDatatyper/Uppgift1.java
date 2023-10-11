package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(in.nextLine());
        System.out.println("Hej "+name+"!");
        System.out.println(num);
    }
}
