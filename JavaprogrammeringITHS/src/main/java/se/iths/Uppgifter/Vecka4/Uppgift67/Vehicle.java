package se.iths.Uppgifter.Vecka4.Uppgift67;

public sealed abstract class Vehicle permits Car,Truck{
    private final String REGISTRATIONNUMBER;

    public Vehicle(String registrationNumber) {
        this.REGISTRATIONNUMBER = registrationNumber;
    }

    public String getREGISTRATIONNUMBER() {
        return REGISTRATIONNUMBER;
    }
   public static void carOrTruck(Vehicle gameshow){
        switch (gameshow){
            case Car car -> System.out.println("CAR!");
            case Truck truck -> System.out.println("TRUCC!");
        }
    }
}
