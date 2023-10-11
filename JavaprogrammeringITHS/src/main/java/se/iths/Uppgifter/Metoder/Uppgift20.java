package se.iths.Uppgifter.Metoder;

import java.util.Arrays;

public class Uppgift20 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 3, 6, 9, 4};
        System.out.println(Arrays.toString(filterLessThan(arr, 5)));

    }

    public static int[] filterLessThan(int[] arr, int index) {
        int counter = 0;
        for (int k : arr) {
            if (k < index)
                counter++;
        }
        System.out.println(counter);
        int[] copy = new int[counter];
        counter = 0;
        for (int j : arr) {
            if (j < index) {
                copy[counter] = j;
                counter++;
            }
        }
        return copy;
    }
}
