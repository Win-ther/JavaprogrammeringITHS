package se.iths.Uppgifter.Kontrollstrukturer;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 100) {
            System.out.println("lika med 100");
        }else if(num >100){
            System.out.println("Större än 100");
        }else{
            System.out.println("Mindre än 100");
        }
    }
}
