package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public abstract class Vehicle {
    private final String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public abstract void goTo(String travelGoal);
}
