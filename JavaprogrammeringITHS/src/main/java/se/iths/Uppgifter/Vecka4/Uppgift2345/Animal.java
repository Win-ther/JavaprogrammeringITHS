package se.iths.Uppgifter.Vecka4.Uppgift2345;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal>{
    private final String speciesName;
    private int size;
    public Animal(String name, int size){
        this.speciesName = name;
        this.size = size;
    }
    public String getSpeciesName() {
        return speciesName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speciesName='" + speciesName + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return size == animal.size && Objects.equals(speciesName, animal.speciesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciesName, size);
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.size, o.size);
    }
}
