package org.example.Seminar3.CwCats.IteratorsAndComparartors;

import org.example.Seminar3.CwCats.Animals.Animal;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator<T extends Animal> implements Iterator<T> {
    protected int counter;
    private List<Animal> animals;
    public AnimalIterator(List<Animal> animals) {
        this.counter = 0;
        this.animals = animals;
    }

    public AnimalIterator() {
    }

    @Override
    public boolean hasNext() {
        return this.counter < this.animals.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return (T) animals.get(counter++);
    }
}
