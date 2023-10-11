package se.iths.Uppgifter.Kontrollstrukturer;

import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        switch (sc.nextLine().toLowerCase()) {
            case "jan"-> System.out.println(1);
            case "feb"-> System.out.println(2);
            case "mar"-> System.out.println(3);
            case "apr"-> System.out.println(4);
            case "may"-> System.out.println(5);
            case "jun"-> System.out.println(6);
            case "jul"-> System.out.println(7);
            case "aug"-> System.out.println(8);
            case "sep"-> System.out.println(9);
            case "okt"-> System.out.println(10);
            case "nov"-> System.out.println(11);
            case "dec"-> System.out.println(12);
        }
    }
}
