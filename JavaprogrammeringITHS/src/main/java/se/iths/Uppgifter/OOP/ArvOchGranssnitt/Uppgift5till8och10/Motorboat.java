package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public class Motorboat extends Boat{
    public Motorboat(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String travelGoal) {
        System.out.println("Färdas med motorbåt till "+travelGoal);
    }
}
