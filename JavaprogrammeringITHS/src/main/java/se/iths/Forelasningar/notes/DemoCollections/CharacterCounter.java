package se.iths.Forelasningar.notes.DemoCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> charCounter = new HashMap<>();
        char c;
        do {
            c = scanner.nextLine().charAt(0);
            /*if (charCounter.containsKey(c)) {
                var currentValue = charCounter.get(c);
                currentValue++;
                charCounter.put(c, currentValue);
            } else {
                charCounter.put(c, 1);
            }*/
            //Samma fast ovan fast på två rader.
            /*charCounter.computeIfPresent(c, (k, v) -> v + 1);
            charCounter.putIfAbsent(c,1);*/
            //Samma som ovan fast på en rad.
            charCounter.merge(c,1,(k,v) -> v + 1);
        } while (c != '0');
        charCounter.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
