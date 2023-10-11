package se.iths.Uppgifter.Kontrollstrukturer;

import java.util.Scanner;

public class Uppgift10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder buildAStringDotCom = new StringBuilder();
        String wordUp = "Not empty";
        Foul: while(true){
            System.out.println("Enter a word: (. to exit)");
            wordUp = scanner.next();
            if (wordUp.equals("."))
                break;
            buildAStringDotCom.append(" ").append(wordUp);
        }
        System.out.println(buildAStringDotCom);
    }
}
