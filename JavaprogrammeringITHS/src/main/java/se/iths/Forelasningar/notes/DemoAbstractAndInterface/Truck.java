package se.iths.Forelasningar.notes.DemoAbstractAndInterface;

public final class Truck extends Vehicle{
    public Truck(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public int getServiceIntervalInKm() {
        return 50000;
    }
}
