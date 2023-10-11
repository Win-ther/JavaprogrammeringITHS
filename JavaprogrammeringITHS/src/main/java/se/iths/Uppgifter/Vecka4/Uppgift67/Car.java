package se.iths.Uppgifter.Vecka4.Uppgift67;

public final class Car extends Vehicle{
    private final int NUMBEROFSEATS;

    public Car(String registrationNumber, int NUMBEROFSEATS) {
        super(registrationNumber);
        this.NUMBEROFSEATS = NUMBEROFSEATS;
    }

    public int getNUMBEROFSEATS() {
        return NUMBEROFSEATS;
    }
}
