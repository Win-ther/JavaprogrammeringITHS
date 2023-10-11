package se.iths.Uppgifter.Vecka3;

import java.util.Arrays;

public class Uppgift2och3 {
    public static void main(String[] args) {
        String[] arr = {"Hej","ddd","7780","femfemfem","ddd","ddd","ddd","ddd","sek"};
        System.out.println(Arrays.toString(arr));
        arr = removeItem(arr,2);
        System.out.println(Arrays.toString(arr));
        arr = removeItem(arr,"ddd");
        System.out.println(Arrays.toString(arr));
    }
    public static String[] removeItem(String[] array, int index){
        if(index >= array.length || index < 0)
            return Arrays.copyOf(array, array.length);
        String[] tempArr = new String[array.length-1];
        int tempArrCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                tempArr[tempArrCounter] = array[i];
                tempArrCounter++;
            }
        }
        return tempArr;
    }
    public static String[] removeItem(String[] array, String remove){
        int countRemoval = 0;
        for (String s : array) {
            if (s.equals(remove))
                countRemoval++;
        }
        String[] tempArr = new String[array.length-countRemoval];
        int tempArrCounter = 0;
        for (String s : array) {
            if (!s.equals(remove)) {
                tempArr[tempArrCounter] = s;
                tempArrCounter++;
            }
        }
        return tempArr;
    }
}
