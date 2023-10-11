package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public class Boat extends Vehicle{
    public Boat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String travelGoal) {
        System.out.println("Färdas med båt till "+travelGoal);
    }
}
