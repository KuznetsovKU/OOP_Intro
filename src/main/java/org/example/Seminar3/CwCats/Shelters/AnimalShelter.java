package org.example.Seminar3.CwCats.Shelters;

import org.example.Seminar3.CwCats.IteratorsAndComparartors.AnimalIterator;
import org.example.Seminar3.CwCats.Animals.Animal;

import java.util.Iterator;
import java.util.List;

public class AnimalShelter<T extends Animal> implements Iterable<T>{
    private List<Animal> animals;

    public AnimalShelter(List<Animal> animals) {
        this.animals = animals;
    }

    public AnimalShelter() {
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    @Override
    public Iterator<T> iterator() {
        return new AnimalIterator(animals);
    }
}
