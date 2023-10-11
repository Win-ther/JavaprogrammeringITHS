package se.iths.Forelasningar.notes.DemoLambda;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        Integer[] arr = {5,4,3,2,1};
        //Arrays.sort(arr);
       // Arrays.sort(arr, (a,b) -> a-b);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, comInt());
        System.out.println(Arrays.toString(arr));
        Tuple[] ttt = {new Tuple(1,"s"),new Tuple(5,"f"),new Tuple(2,"j"), new Tuple(19,"2")};
        Arrays.sort(ttt, Comparator.comparingInt(Tuple::n));
        System.out.println(Arrays.toString(ttt));
        Arrays.sort(ttt,Comparator.comparing(Tuple::s).thenComparingInt(Tuple::n));
        System.out.println(Arrays.toString(ttt));
    }
    public static Comparator<Integer> comInt(){
        return (Comparator.comparingInt(o -> o));
    }
}
record Tuple(int n, String s){}