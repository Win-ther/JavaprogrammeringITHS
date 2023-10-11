package se.iths.Uppgifter.OOP.OvningsUppgift;

public abstract class WaterVehicle extends Vehicle{
    private int posX;
    private int posY;
    public WaterVehicle(float weight, float price) {
        super(weight, price);
        posX = 0;
        posY = 0;
    }
    public void go(int posX,int posY){
        this.posX = posX;
        this.posY = posY;
    }
}
