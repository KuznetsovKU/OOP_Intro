package org.example.Homework2.model;

import org.example.Homework2.model.Laptops.Laptop;

import java.util.Iterator;
import java.util.List;

public class LaptopIterator implements Iterator<Laptop> {
    private int counter;
    private List<Laptop> laptops;

    public LaptopIterator(List<Laptop> laptops) {
        this.counter = 0;
        this.laptops = laptops;
    }

    @Override
    public boolean hasNext() {
        return counter < laptops.size();
    }

    @Override
    public Laptop next() {
        if (!hasNext()) {
            return null;
        }
        return laptops.get(counter++);
    }
}
