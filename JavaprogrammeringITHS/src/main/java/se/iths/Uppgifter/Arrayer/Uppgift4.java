package se.iths.Uppgifter.Arrayer;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cap = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[cap];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println((double)sum/arr.length);
    }
}
