package se.iths.Uppgifter.Vecka1;

import java.util.Scanner;

public class Uppgift8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Ange storlek på Array, måste vara jämna tal och över 4st");

        int size = scanner.nextInt();
            System.out.println("_________");
        int[] arr;
        if (size < 4){
            arr = new int[4];
        }else if(size%2 != 0){
            arr = new int[size+1];
        }else{
            arr= new int[size];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            System.out.println(arr[i]);
        }
        int compare = 0;
        for(int i = 0; i < arr.length-2; i+=2) {
            System.out.println(arr[i]+"\t"+arr[i+1] + "\t\\\t"+arr[i+2]+"\t"+arr[i+3]);
            if (arr[i] == arr[i+2] || arr[i+1] == arr[i+3] || arr[i] == arr[i+3] || arr[i+1] == arr[i+2]){
                compare+=2;
            }
        }
        if (compare == 0){
            System.out.println("Nowhere");
        } else if (compare == arr.length-2) {
            System.out.println("Everywhere");
        }else{
            System.out.println("Somewhere");
        }
    }}
}
