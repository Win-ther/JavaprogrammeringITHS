package se.iths.Uppgifter.OOP.Grunder.Uppgift7till8;

public class Counter {
    private int accounter;
    private static int nrOfCounters = 0;

    public Counter() {
        this.accounter = 0;
        nrOfCounters++;
    }

    public int value() {
        return accounter;
    }

    public void increase() {
        accounter++;
    }

    public void decrease() {
        accounter--;
    }

    public void print() {
        System.out.println("This counter is up to: " + accounter + "\nAnd there are: " + nrOfCounters + " counters active right now");
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        c1.increase();
        c1.increase();
        c1.increase();
        c1.increase();

        c1.print();
        c1.increase();
        c1.increase();
        c1.increase();
        Counter c5 = new Counter();
        Counter c6 = new Counter();
        Counter c7 = new Counter();
        Counter c8 = new Counter();
        Counter c9 = new Counter();

        System.out.println(Counter.nrOfCounters);
        c1.print();

    }
}
