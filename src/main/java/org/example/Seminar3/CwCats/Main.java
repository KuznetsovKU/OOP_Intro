package org.example.Seminar3.CwCats;

import org.example.Seminar3.CwCats.Animals.Animal;
import org.example.Seminar3.CwCats.Animals.Cat;
import org.example.Seminar3.CwCats.Shelters.CatShelter;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("name")));
        Iterator<Animal> iterator = cats.iterator();
        if(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
