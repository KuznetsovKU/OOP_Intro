package org.example.Homework2.model;

import org.example.Homework2.model.Laptops.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage implements StorageFiller {
    protected static Integer storageIdCounter;

    static {
        Storage.storageIdCounter = 1;
    }

    protected Integer storageId;
    protected String storageType;
    protected Integer capacity;
    protected List<Laptop> laptopList = new LinkedList<Laptop>();

    public Storage(String storageType, Integer capacity) {
        this.storageId = storageIdCounter++;
        this.storageType = storageType;
        this.capacity = capacity;
    }

    public Storage() {
        this("Technics", 100);
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    @Override
    public void addToStorage(Laptop laptop) {
        laptopList.add(laptop);
    }

    @Override
    public void printStorage() {
        System.out.println("Нашлись следующие ноутбуки:");
        for (Laptop laptop : laptopList) System.out.println(laptop);
    }

    @Override
    public Storage createRandomStorage(int amount) {
        Random rand = new Random();
        Storage storage = new Storage();
        while (amount > 0) {
            int type = rand.nextInt(1, 4);
            switch (type) {
                case 1:
                    storage.laptopList.add(new Macbook().createRandomLaptop());
                    amount--;
                case 2:
                    storage.laptopList.add(new Ultrabook().createRandomLaptop());
                    amount--;
                case 3:
                    storage.laptopList.add(new Transformer().createRandomLaptop());
                    amount--;
                case 4:
                    storage.laptopList.add(new ClassicLaptop().createRandomLaptop());
                    amount--;
            }
            amount--;
        }
        return storage;
    }

    @Override
    public Storage getFilteredStorage(Storage storage) {
        Laptop filter = new ClientChoice().createLaptopManually();
        Storage filteredStorage = new Storage();
        for (Laptop laptop : storage.getLaptopList()) {
            if (filter.isEqualsLaptop(laptop)) {
                filteredStorage.addToStorage(laptop);
            }
        }
        return filteredStorage;
    }


}
