package se.iths.Forelasningar.notes.DemoOOP;

import java.util.HashSet;
import java.util.Set;

public class DemoRect {
    public static void main(String[] args) {
        Set<Rectangle> rects = new HashSet<>();
        rects.add(new Rectangle(1,3));
        System.out.println(rects.stream().toList().get(0).getWidth());
    }
}
