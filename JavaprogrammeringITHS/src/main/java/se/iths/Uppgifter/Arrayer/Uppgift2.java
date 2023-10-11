package se.iths.Uppgifter.Arrayer;

public class Uppgift2 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,13,21,34};
        int sumOfAll = 0;
        int sum2 = 0;
        for (int j = 0, arrLength = arr.length; j < arrLength; j++) {
            sumOfAll += arr[j];
            if (j%2 == 0)
                sum2 += arr[j];
            else
                sum2 -= arr[j];
        }
        System.out.println(sumOfAll);
        System.out.println(sum2);
    }
}
