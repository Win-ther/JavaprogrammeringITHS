package se.iths.Uppgifter.Vecka1;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;

        test: while (true) {
            System.out.println("Enter a weekday(English only)");
            day = scanner.next();
            switch (day.toLowerCase()) {
                default -> System.out.println("0");
                case "monday", "mon" -> System.out.println("1");
                case "tuesday", "tue" -> System.out.println("2");
                case "wednesday", "wed" -> System.out.println("3");
                case "thursday", "thur" -> System.out.println("4");
                case "friday", "fri" -> System.out.println("5");
                case "saturday", "sat" -> System.out.println("6");
                case "sunday", "sun" -> System.out.println("7");
                case "stop" -> {
                    break test;
                }
            }
        }
    }
}
