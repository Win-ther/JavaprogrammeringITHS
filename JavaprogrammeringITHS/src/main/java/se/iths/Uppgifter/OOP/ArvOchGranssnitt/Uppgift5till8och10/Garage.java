package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift5till8och10;

public class Garage {
    public static void main(String[] args) {
       // Vehicle v = new Vehicle("Estrella"); Går inte är abstrakt
       // v.goTo("Frankrike");
        Bicycle b = new Bicycle("Biltema");
        b.goTo("Coop");
        Car c = new Car("SAAB");
        c.goTo("The beach");
        Boat bo = new Boat("Boatington");
        bo.goTo("Sea");
        Motorboat m = new Motorboat("Motorboatington");
        m.goTo("Super sea");
        Sailboat s = new Sailboat("Sailboatington");
        s.goTo("Sea 2");
        System.out.println(s.getManufacturer());
        System.out.println(c.getManufacturer());
    }
}
