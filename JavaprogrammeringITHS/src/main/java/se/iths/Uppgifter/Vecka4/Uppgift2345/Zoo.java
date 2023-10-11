package se.iths.Uppgifter.Vecka4.Uppgift2345;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Zoo implements Iterable<Animal>{
    private Animal[] animals;
    private int animalCounter;

    public Zoo(int max) {
        this.animals = new Animal[max];
        this.animalCounter = 0;
    }
    public void add(Animal animal){
        animals[animalCounter] = animal;
        animalCounter++;
    }

    public Animal get(int index){
        return animals[index];
    }

    @Override
    public void forEach(Consumer<? super Animal> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<Animal> iterator() {
        return new animalIterator();
    }
    private class animalIterator implements Iterator<Animal>{
        private int counter;
        @Override
        public boolean hasNext() {
            return animals[counter] != null;
        }

        @Override
        public Animal next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return animals[counter++];
        }
    }
}
