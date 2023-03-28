package org.example.Seminar1.VendingMachine.model;

public class BottledWater extends Product {
    private Double volume;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public BottledWater(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume;
    }

    public BottledWater(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }


}
