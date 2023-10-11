package se.iths.Uppgifter.Arrayer;

import java.util.Arrays;

public class Uppgift8 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        boolean sorting = true;
        int temp;
        while (sorting) {
            sorting = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    temp = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i] = temp;
                    sorting = true;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
