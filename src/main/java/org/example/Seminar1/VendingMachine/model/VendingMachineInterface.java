package org.example.Seminar1.VendingMachine.model;

public interface VendingMachineInterface {
    void addProduct(Product item);

    Product getProduct(String name);

    void printStorage();
}
