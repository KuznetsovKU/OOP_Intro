package org.example.Seminar3.CwCats.IteratorsAndComparartors;

import org.example.Seminar3.CwCats.Animals.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getWeight();
    }
}
