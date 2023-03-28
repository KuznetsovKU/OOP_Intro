package org.example.Seminar1.VendingMachine.model;

import java.util.ArrayList;

public class HotDrinkVM implements VendingMachineInterface{
    private ArrayList<Product> productsList;

    public HotDrinkVM() {
        this.productsList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product item) {
        if (item instanceof HotDrink) {
            productsList.add(item);
        }
    }

    @Override
    public void printStorage() {
        for (Product item : productsList) {
            System.out.println(item);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productsList) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, Double volume, int temperature) {
        for (Product item : productsList) {
            if (item instanceof HotDrink) {
                if (item.getName().equalsIgnoreCase(name) && ((HotDrink) item).getVolume().equals(volume) &&
                        ((HotDrink) item).getTemperature() == temperature) {
                    return (HotDrink) item;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
