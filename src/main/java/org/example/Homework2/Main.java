package org.example.Homework2;

import org.example.Homework2.model.LaptopComparator;
import org.example.Homework2.model.LaptopList;
import org.example.Homework2.model.Laptops.Laptop;
import org.example.Homework2.model.Storage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage myStorage = new Storage().createRandomStorage(10);
        myStorage.printStorage();

//        Storage clientChoice = new Storage().getFilteredStorage(myStorage);
//        clientChoice.printStorage();

        Comparator<Laptop> comparator = new LaptopComparator();
        List<Laptop> laptopList = myStorage.getLaptopList();
        Collections.sort(laptopList, comparator);
        System.out.println("-----");

        System.out.println(laptopList.size());
        Iterator<Laptop> iterator = laptopList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
