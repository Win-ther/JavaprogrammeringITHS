package se.iths.Uppgifter.OOP.OvningsUppgift;

public class Buyer extends Person{
    public Buyer(String name, int age, String job, float money, Vehicle ownedVehicle) {
        super(name, age, job, money, ownedVehicle);
    }

    public Buyer(String name, int age, String job, float money) {
        super(name, age, job, money);
    }
}
