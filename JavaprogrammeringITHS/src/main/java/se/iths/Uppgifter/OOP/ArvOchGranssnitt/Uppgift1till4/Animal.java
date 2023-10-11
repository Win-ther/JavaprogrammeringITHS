package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift1till4;

public abstract class Animal {
    private final int NR_OF_LEGS;
    private String name;
    private int weight;

    private String sound;

    public Animal(int nrOfLegs, String name, int weight, String sound) {
        this.NR_OF_LEGS = nrOfLegs;
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }

    public int getNR_OF_LEGS() {
        return NR_OF_LEGS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    public void increaseAge(){
        weight++;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void printShit(){
        System.out.println("This Animals name is "+name);
    }
    public void printLeg(){
        System.out.println("Leg "+NR_OF_LEGS);
    }
}
