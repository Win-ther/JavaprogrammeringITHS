package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public class Bicycle extends Vehicle{

    public Bicycle(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String travelGoal) {
        System.out.println("Färdas med cykel till "+travelGoal);
    }
}
