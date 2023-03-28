package org.example.Seminar1.VendingMachine.model;

import java.util.ArrayList;

public class ChocolateVM implements VendingMachineInterface {
    private final ArrayList<Product> productsList;

    public ChocolateVM() {
        this.productsList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product item) {
        if (item instanceof Chocolate) {
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

    public Chocolate getProduct(String name, int sugar) {
        for (Product item : productsList) {
            if (item instanceof Chocolate) {
                if (item.getName().equalsIgnoreCase(name) && ((Chocolate) item).getSugar() == sugar) {
                    return (Chocolate) item;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

//    public Chocolate getProduct(String name, Double price) {
//        for (Product item : productsList) {
//            if (item instanceof Chocolate) {
//                if (item.getName().equalsIgnoreCase(name) && ((Chocolate) item).getSugar() == price) {
//                    return (Chocolate) item;
//                }
//            }
//        }
//        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
//    }
//
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
