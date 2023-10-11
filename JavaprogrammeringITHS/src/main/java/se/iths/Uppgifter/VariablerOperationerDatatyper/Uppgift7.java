package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur mycket pengar på kontot?");
        int money = scanner.nextInt();
        System.out.println("Vad är räntesatsen, skriv i decimalform");
        double interest = scanner.nextDouble();

        System.out.println(money*interest);
    }
}
