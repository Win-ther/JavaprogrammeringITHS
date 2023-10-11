package se.iths.Forelasningar.notes.DemoAbstractAndInterface;

public class Demo {
    public static void main(String[] args) {
        Car vehicle1 = new Car("ABC123");
        Vehicle vehicle2 = new Car("ABC321");
        Vehicle vehicle3 = new Truck("TRK123");

        checkForMaintenance(vehicle1);
        //JDK21 endast
        /*switch (vehicle1){
            case Car car-> System.out.println("Car");
        }*/
    }
    //Gör så att man bara kommer åt objekt som har implementerat Maintainable
    //Ser också bara metoder som finns i Maintainable så då getServiceIntervalInKm
    //Behöver inte vara ett vehicle, behöver bara ha implementerat Maintainable interface.
    public static void checkForMaintenance(Maintainable vehicle){
        System.out.println(vehicle.getServiceIntervalInKm());
    }

}
