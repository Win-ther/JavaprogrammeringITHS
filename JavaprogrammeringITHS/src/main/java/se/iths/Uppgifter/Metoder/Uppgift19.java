package se.iths.Uppgifter.Metoder;

import java.util.Arrays;

public class Uppgift19 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = copyArr(arr);
        arr2[3] = 56;
        arr[3] = 600;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));


    }
    public static int[] copyArr(int[] arr){
        return Arrays.copyOf(arr,arr.length);
    }
}
