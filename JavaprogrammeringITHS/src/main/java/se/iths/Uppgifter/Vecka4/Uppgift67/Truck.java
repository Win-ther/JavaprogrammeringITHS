package se.iths.Uppgifter.Vecka4.Uppgift67;

public final class Truck extends Vehicle{
    private final int LOADCAPACITY;

    public Truck(String registrationNumber, int LOADCAPACITY) {
        super(registrationNumber);
        this.LOADCAPACITY = LOADCAPACITY;
    }

    public int getLOADCAPACITY() {
        return LOADCAPACITY;
    }

    public static void main(String[] args) {
        Truck t = new Truck("Ttt",450);
        carOrTruck(t);
        Car c = new Car("Ccc",4);
        carOrTruck(c);
    }
}
