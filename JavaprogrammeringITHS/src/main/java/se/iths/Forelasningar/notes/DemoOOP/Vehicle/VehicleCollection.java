package se.iths.Forelasningar.notes.DemoOOP.Vehicle;

public class VehicleCollection {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4000,1.5f,500);

        Vehicle v2 = new Vehicle(5,3.32f,334);

        Vehicle v3 = new Vehicle(24,0.9f,1167);

        System.out.println(v1.computeMaxRange());
        System.out.println(v2.computeMaxRange());
        System.out.println(v3.computeMaxRange());

        System.out.printf("Vehicle 1 can take %02d passengers.", v1.getPassengers());
        System.out.printf("\nAnd go %.2f mil.", v1.computeMaxRange());
    }
}
