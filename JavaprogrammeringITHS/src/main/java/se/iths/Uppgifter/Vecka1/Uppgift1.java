package se.iths.Uppgifter.Vecka1;

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad är ditt namn?");
        String name = scanner.next();
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        System.out.println("Hej "+name+"!");
    }
}
