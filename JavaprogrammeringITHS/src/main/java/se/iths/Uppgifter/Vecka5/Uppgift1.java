package se.iths.Uppgifter.Vecka5;

import java.util.ArrayList;
import java.util.Comparator;

public class Uppgift1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Etthundra");
        list.add("Två");
        list.add("Trettio");

        System.out.println(list.get(1));
        list.add(1,"Two");
        list.remove(2);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("Two"));

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        //list.sort(Comparator.comparing(s -> ((String) s).charAt(1)).thenComparing(s -> ((String) s).charAt(0)));
        System.out.println(list);
    }
}
