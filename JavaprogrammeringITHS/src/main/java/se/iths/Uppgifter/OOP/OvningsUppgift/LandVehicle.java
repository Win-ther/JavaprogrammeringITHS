package se.iths.Uppgifter.OOP.OvningsUppgift;

public abstract class LandVehicle extends Vehicle{
    private int kms;
    public LandVehicle(float weight, float price) {
        super(weight, price);
        kms = 0;
    }
    public void drive(){
     kms++;
    }
}
