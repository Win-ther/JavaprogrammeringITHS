package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public class Sailboat extends Boat{
    public Sailboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String travelGoal) {
        System.out.println("Färdas med segelbåt till "+travelGoal);
    }
}
