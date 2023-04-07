package org.example.Homework2.model;

import org.example.Homework2.model.Laptops.Laptop;

import java.util.Iterator;
import java.util.List;

public class LaptopList implements Iterable<Laptop> {
    public List<Laptop> laptopList;

    public LaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    @Override
    public Iterator<Laptop> iterator() {
        return new LaptopIterator(laptopList);
    }
}
