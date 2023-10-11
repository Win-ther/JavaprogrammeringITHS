package se.iths.Uppgifter.OOP.OvningsUppgift;

public class Marketplace {
    public static void main(String[] args) {
        Buyer b1 = new Buyer("Karl-bertil",45,"Professional dancer",1500000);
        Buyer b2 = new Buyer("Kerstin",32,"Mathematician",300000);
        Buyer b3 = new Buyer("Dong-dillert",56,"Fat-bastard in Austin Powers",7800000);
        Seller s1 = new Seller("Kent",44,"Professional looser",150000, new Car(900,18000));
        Seller s2 = new Seller("StenSten", 73,"Retired and tired",780000,new Helicopeter(320,1500000));
        VehicleBuyer v = new VehicleBuyer("Ford-konny",53,"Vehicle buyer",10000000);
        System.out.println(s1.getOwnedVehicle());
        System.out.println(s1.getMoney());
        System.out.println(b1.getMoney());
        System.out.println(v.getMoney());
        v.transferCar(s1,b1);
        System.out.println(b1.getOwnedVehicle());
        System.out.println(s1.getMoney());
        System.out.println(b1.getMoney());

        System.out.println(v.getMoney());
    }
}
