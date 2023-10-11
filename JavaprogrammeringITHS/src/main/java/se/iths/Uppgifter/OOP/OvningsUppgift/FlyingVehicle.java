package se.iths.Uppgifter.OOP.OvningsUppgift;

public abstract class FlyingVehicle extends Vehicle{
    private boolean flying;
    private int altitude;
    public FlyingVehicle(float weight, float price) {
        super(weight, price);
        flying = false;
        altitude = 0;
    }
    public void fly(boolean isFlying){
        flying = isFlying;
        if (!flying)
            altitude = 0;
        else
            altitude++;
    }
}
