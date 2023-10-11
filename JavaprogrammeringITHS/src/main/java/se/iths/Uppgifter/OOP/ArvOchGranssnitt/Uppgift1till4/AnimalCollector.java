package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift1till4;

public class AnimalCollector {
    public static void main(String[] args) {
        //Animal genericAnimal = new Animal(5,"Generic Joe",5,"Male");
        Mammal eric = new Mammal(2,"Eric", 46,"Male");

        eric.printLeg();
        eric.printShit();

        Animal jeff = new Mammal(2,"Jeff",31,"Non-binary");
        jeff.printLeg();
        jeff.printShit();

        //genericAnimal.printLeg();
        //genericAnimal.printShit();

    }
}
