package se.iths.Uppgifter.Arrayer;

import java.util.Arrays;

public class Uppgift3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int uddaCntr = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            if (arr[i]%2 != 0)
                uddaCntr++;
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(min+ " är min");
        System.out.println(max+" är max");
        System.out.println(uddaCntr+" udda nummer");
    }
}
