package se.iths.Uppgifter.Kontrollstrukturer;

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        String storedPw = "Goblinmode";
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equals(storedPw)){
            System.out.println("Correct");
        }
        else
            System.out.println("Incorrect");
    }
}
