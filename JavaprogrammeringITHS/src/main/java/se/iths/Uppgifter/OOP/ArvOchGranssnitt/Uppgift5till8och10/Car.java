package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public class Car extends Vehicle{
    public Car(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public void goTo(String travelGoal) {
        System.out.println("Färdas med bil till "+travelGoal);
    }
}
