package se.iths.Forelasningar.notes.DemoAbstractAndInterface;

public class RecordDemo {
    public static void main(String[] args) {
        Drink drunk = new Drink("NOCCO",2);
        System.out.println(drunk.energy());
        System.out.println(drunk);
    }
}
