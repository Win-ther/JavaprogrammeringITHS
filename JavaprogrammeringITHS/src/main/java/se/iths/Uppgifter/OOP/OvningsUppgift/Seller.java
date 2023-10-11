package se.iths.Uppgifter.OOP.OvningsUppgift;

public class Seller extends Person{
    public Seller(String name, int age, String job, float money, Vehicle ownedVehicle) {
        super(name, age, job, money, ownedVehicle);
    }

    public Seller(String name, int age, String job, float money) {
        super(name, age, job, money);
    }
}
