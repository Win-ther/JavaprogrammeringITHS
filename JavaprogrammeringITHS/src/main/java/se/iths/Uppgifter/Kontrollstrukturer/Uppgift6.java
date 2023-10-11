package se.iths.Uppgifter.Kontrollstrukturer;

import java.util.Scanner;

public class Uppgift6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100)+1;
        int guess = 0;
        int numGuess = 0;
        while (guess != randomNum){
            System.out.println("Guess the number:");
            guess = scanner.nextInt();
            if (guess > randomNum)
                System.out.println("Too high!");
            else if (guess < randomNum)
                System.out.println("Too low!");
            else
                System.out.println("Correct!");
            numGuess++;
        }
        System.out.printf("It took %d guesses to find the correct number",numGuess);

    }
}
