package se.iths.Uppgifter.Generics.Uppgift2;

import java.util.ArrayList;

public class DoublesToList {
    public static void main(String[] args) {
        ArrayList<Double> doublesList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            doublesList.add(i,Math.random()*100);
        }
        for (double d: doublesList) {
            System.out.println(d);
        }
    }
}
