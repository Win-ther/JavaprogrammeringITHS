package se.iths.Forelasningar.notes.DemoOOP.Vehicle;

public class Vehicle {
    private static final int MAX_PASSENGERS = 1000;
    private final int passengers;
    private final float fuelUsage;
    private final float fuelCap;

    public Vehicle(int passengers, float fuelUsage, float fuelCap) {
        this.passengers = Math.min(passengers, MAX_PASSENGERS);
        this.fuelUsage = fuelUsage;
        this.fuelCap = fuelCap;
    }

    public int getPassengers() {
        return passengers;
    }
    public String getPassengerAsString(){
        return Integer.toString(passengers);
    }
    public float getFuelUsage() {
        return fuelUsage;
    }

    public float getFuelCap() {
        return fuelCap;
    }

    public float computeMaxRange(){
        return fuelCap/ fuelUsage;
    }
}
