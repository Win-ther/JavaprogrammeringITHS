package se.iths.Forelasningar.notes.DemoOOP.Point;

public class Pointers {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(p1);
        p2.setX(2);
        p2.setY(4);
        Point p3 = new Point(7,6);

        System.out.println(p1.distanceTo(p2));
        System.out.println(p1.distanceTo(p3));
    }
}
