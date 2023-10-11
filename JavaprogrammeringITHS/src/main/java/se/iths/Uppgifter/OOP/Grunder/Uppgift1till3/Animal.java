package se.iths.Uppgifter.OOP.Grunder.Uppgift1till3;

public class Animal {
    public final int numberOfLegs;
    public int age;
    public String race;

    public Animal(int numberOfLegs, int age, String race) {
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.race = race;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public void printAnimal(){
        System.out.println("This animal is a "+race+" of "+age+" years, surprisingly it has "+numberOfLegs+" legs");
    }

    public static void main(String[] args) {
        Animal snake = new Animal(2, 23,"SNEK");
        Animal snake2 = new Animal(87, 2,"SNEK");
        snake.printAnimal();
        snake2.printAnimal();
    }
}
