package se.iths.Uppgifter.Kontrollstrukturer;

import java.util.Scanner;

public class Uppgift11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num > 2){
            if (num%2 != 0)
                num = num*3 +1;
            else
                num/=2;
            System.out.println(num);
        }
    }
}
