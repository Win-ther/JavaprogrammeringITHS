package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println("Mean: "+(double)(one+two)/2);

    }
}
