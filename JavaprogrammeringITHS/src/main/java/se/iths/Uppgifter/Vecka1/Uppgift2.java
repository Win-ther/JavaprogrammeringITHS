package se.iths.Uppgifter.Vecka1;

import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.println("Mata in två tal: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();

        System.out.println("Du skrev in "+arr[0]+" och "+arr[1]+"\nMedelvärdet är: "+(double)(arr[0]+arr[1])/arr.length);
    }
}

