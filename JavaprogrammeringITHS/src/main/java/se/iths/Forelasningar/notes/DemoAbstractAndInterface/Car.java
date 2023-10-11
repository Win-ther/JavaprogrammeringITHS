package se.iths.Forelasningar.notes.DemoAbstractAndInterface;

public final class Car extends Vehicle{

    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public int getServiceIntervalInKm() {
        return 20000;
    }
}
