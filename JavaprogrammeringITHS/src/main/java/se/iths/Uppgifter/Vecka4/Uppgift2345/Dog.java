package se.iths.Uppgifter.Vecka4.Uppgift2345;

public class Dog extends Animal{
    public Dog(int size) {
        super("Dog", size);
    }


    public static void main(String[] args) {
        Dog dog = new Dog(3);
        Animal animal = new Dog(5);
        Octopus o = new Octopus(1);
        Lamassu l = new Lamassu(32);
        //Animal[] arr = {animal,dog,o,l};
        //System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        Zoo z = new Zoo(10);
        z.add(dog);
        z.add(animal);
        z.add(o);
        z.add(l);

        /*for (Animal a: z) {
            System.out.println(a);
        }*/
        z.forEach(System.out::println);
    }

}
