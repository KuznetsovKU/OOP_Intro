package org.example.Seminar1.VendingMachine;


import org.example.Seminar1.VendingMachine.model.*;

import java.util.ArrayList;

public class Vending {
    public static void main(String[] args) {
        WaterVM waterVM1 = new WaterVM();
        waterVM1.addProduct(new Chocolate("snickers", 100.0, 5));
        waterVM1.addProduct(new Chocolate("mars", 200.0, 10));
        waterVM1.addProduct(new BottledWater("water 0.5l", 100.0, 0.5));
        waterVM1.addProduct(new BottledWater("water 1l", 200.0, 1.0));

        waterVM1.printStorage();
        System.out.println();
        System.out.println(waterVM1.getProduct("water 1l", 1.0));

        System.out.println();

        HotDrinkVM hdVM1 = new HotDrinkVM();
        hdVM1.addProduct(new HotDrink("black tea", 50.0, 0.4, 60));
        hdVM1.addProduct(new HotDrink("green tea", 60.0, 0.4, 50));
        hdVM1.addProduct(new HotDrink("americano", 90.0, 0.3, 65));
        hdVM1.addProduct(new HotDrink("latte", 120.0, 0.5, 45));

        hdVM1.printStorage();
        System.out.println();
        System.out.println(hdVM1.getProduct("green tea", 0.4, 50));
    }
}
