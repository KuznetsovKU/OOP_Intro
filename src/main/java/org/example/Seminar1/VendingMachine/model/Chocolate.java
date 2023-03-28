package org.example.Seminar1.VendingMachine.model;

public class Chocolate extends Product {
    private int sugar;

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public Chocolate(int sugar) {
        this.sugar = sugar;
    }

    public Chocolate(String name, Double price, int sugar) {
        super(name, price);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString() + ", sugar=" + sugar;
    }
}
