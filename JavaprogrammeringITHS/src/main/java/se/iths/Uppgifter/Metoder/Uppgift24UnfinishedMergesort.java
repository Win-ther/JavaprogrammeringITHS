package se.iths.Uppgifter.Metoder;

import java.util.Arrays;

public class Uppgift24UnfinishedMergesort {
    public static void main(String[] args) {
        int[] arr = {5,7,1,34,78,12,56,34,78};
        mergeSort(arr);

    }
    public static void mergeSort(int[] array){
        if (array.length > 1){
            int[] firstHalf = Arrays.copyOf(array,array.length/2);
            mergeSort(firstHalf);

            int[] secondHalf = Arrays.copyOfRange(array,array.length/2,array.length);
            mergeSort(secondHalf);
        }
    }
}
