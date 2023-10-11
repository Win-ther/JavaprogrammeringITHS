package se.iths.Uppgifter.Vecka1;

public class Uppgift7 {
    public static void main(String[] args) {
        int x = 10;
        int[] arr1 = new int[x];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*10);
        }
        int[] arr2 = new int[x];
        for (int i = 1; i <= arr1.length; i++) {
            arr2[i-1] = arr1[arr1.length-i];
        }
        System.out.println("Array 1\tArray 2");
        for (int i = 0; i < arr1.length; i++) {

            System.out.println("  "+arr1[i]+"\t\t  "+arr2[i]);
        }
        int sum = 0;
        for (int j : arr1) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i] % 2 == 0){
//                sum += arr1[i];
//            }
//        }
        System.out.println("Summan av alla jämna tal i de två arrayerna är: "+sum*2);
    }
}
