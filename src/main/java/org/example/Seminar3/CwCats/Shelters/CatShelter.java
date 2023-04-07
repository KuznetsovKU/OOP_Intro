package org.example.Seminar3.CwCats.Shelters;

import org.example.Seminar3.CwCats.Animals.Animal;
import org.example.Seminar3.CwCats.Animals.Cat;
import org.example.Seminar3.CwCats.IteratorsAndComparartors.AnimalIterator;
import org.example.Seminar3.CwCats.IteratorsAndComparartors.CatIterator;


import java.util.Iterator;
import java.util.List;

public class CatShelter extends AnimalShelter {
    private List<Cat> cats;

    public CatShelter(List<Cat> cats) {
        this.cats = cats;
    }

    public CatShelter() {
    }

//    @Override
//    public Iterator<Animal> iterator() {
//        return new AnimalIterator(animals);
//    }
//
//    @Override
//    public Iterator<Cat> iterator() {
//        return new AnimalIterator(cats); {
//        }
//    }
}

