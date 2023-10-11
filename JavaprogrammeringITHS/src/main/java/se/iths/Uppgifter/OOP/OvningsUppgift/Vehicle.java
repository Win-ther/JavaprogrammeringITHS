package se.iths.Uppgifter.OOP.OvningsUppgift;

public abstract class Vehicle {
    private final float weight;
    private float price;

    public Vehicle(float weight, float price) {
        this.weight = weight;
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
