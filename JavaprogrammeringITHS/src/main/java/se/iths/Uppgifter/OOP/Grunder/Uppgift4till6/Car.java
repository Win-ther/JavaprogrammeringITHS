package se.iths.Uppgifter.OOP.Grunder.Uppgift4till6;

import java.awt.*;

public class Car {
    private String model;
    private float price;
    private Color color;

    public Car(){
        this.model = "SAAB";
        this.price = 100000;
        this.color = Color.GRAY;
    }

    public Car(String model, float price, Color color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void halfPrice(){
        this.price = this.price/2;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("Volvo",320000, Color.MAGENTA);
        System.out.println(car2.getPrice());
        car2.halfPrice();
        System.out.println(car2.getPrice());
    }
}
