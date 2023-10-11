package se.iths.Uppgifter.Generics.Uppgift4och5;

public class Trio<D,O,H> {
    private D first;
    private O second;
    private H third;

    public Trio(D first, O second, H third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static void main(String[] args) {
        Trio<Integer,String,Double> trulyThis = new Trio<>(123,"Hej",4.5);
    }
}
