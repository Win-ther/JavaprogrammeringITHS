package se.iths.Uppgifter.Felhantering;

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimaltal änna: ");
        double dub =-1.1;
        String string;
        while(dub < 0){
            try{
                dub = Double.parseDouble(scanner.next());
            }catch (NumberFormatException e){
                System.out.println("Incorrect inmatning försök again");
            }
        }
    }
}
