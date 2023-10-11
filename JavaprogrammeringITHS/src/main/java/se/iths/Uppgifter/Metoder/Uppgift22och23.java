package se.iths.Uppgifter.Metoder;

import java.util.Arrays;

public class Uppgift22och23 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            arr2[i] = (int)(Math.random()*100);
        }
        bubbleSort(arr);
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(merge(arr,arr2)));
    }
    public static void bubbleSort(int[] arr){
        boolean swapping = true;
        int temp;
        int max = 1;
        while(swapping){
            swapping = false;
            for (int i = 0; i < arr.length-max; i++) {
                if (arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    swapping = true;
                }
            }
            max++;
        }
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] mergedArr = new int[arr1.length+ arr2.length];
        int arr1Counter = 0, arr2Counter = 0, mergeCounter = 0;
        while(arr1Counter < arr1.length && arr2Counter < arr2.length){
            if (arr1[arr1Counter] < arr2[arr2Counter]){
                mergedArr[mergeCounter] = arr1[arr1Counter];
                arr1Counter++;
            }else {
                mergedArr[mergeCounter] = arr2[arr2Counter];
                arr2Counter++;
            }
            mergeCounter++;
        }
        while(arr1Counter < arr1.length){
            mergedArr[mergeCounter] = arr1[arr1Counter];
            arr1Counter++;
            mergeCounter++;
        }
        while(arr2Counter < arr2.length){
            mergedArr[mergeCounter] = arr2[arr2Counter];
            arr2Counter++;
            mergeCounter++;
        }
        return mergedArr;
    }
}
