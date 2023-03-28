package org.example.Seminar1.VendingMachine.model;

import java.util.ArrayList;

public class WaterVM implements VendingMachineInterface {
    private ArrayList<Product> productsList;

    public WaterVM() {
        this.productsList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product item) {
        if (item instanceof BottledWater) {
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

    public BottledWater getProduct(String name, Double volume) {
        for (Product item : productsList) {
            if (item instanceof BottledWater) {
                if (item.getName().equalsIgnoreCase(name) && ((BottledWater) item).getVolume().equals(volume)) {
                    return (BottledWater) item;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

//    public Chocolate getProduct(Double price) {
//        for (Product item : productsList) {
//            if (item instanceof Chocolate) {
//                if (((Chocolate) item).getSugar() == price) {
//                    return (Chocolate) item;
//                }
//            }
//        }
//        throw new IllegalStateException("Такой продукт не найден.");
//    }
}
