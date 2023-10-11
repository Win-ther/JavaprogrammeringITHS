package se.iths.Uppgifter.Vecka2;

public class Uppgift1 {
    public static void main(String[] args) {
        int[] numbers = {5,9,10,5,3,7};
        System.out.println(lowestNum(numbers));

    }
    public static int lowestNum(int[] arr){
        int min = arr[0];
        for (int j : arr)
            if (j < min)
                min = j;

        return min;
    }
}
