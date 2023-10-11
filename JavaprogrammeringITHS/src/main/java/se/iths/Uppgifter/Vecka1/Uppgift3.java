package se.iths.Uppgifter.Vecka1;

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mata in två tal:");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        if(num1 < 0){
            num1 = Math.abs(num1); // Samma som num1*=-1;
        }
        if (num2 < 0) {
            num2 = Math.abs(num2); //Samma som num2*=-1;
        }
        int sum;
        if (num1 == num2){
            sum = (num1+num2)*2;
        }else {
            sum = num1 + num2;
        }

        System.out.println(sum);
    }
}
