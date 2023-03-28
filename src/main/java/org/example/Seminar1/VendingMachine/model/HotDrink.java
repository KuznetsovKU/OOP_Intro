package org.example.Seminar1.VendingMachine.model;

public class HotDrink extends Product{
    private Double volume;
    private int temperature;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(Double volume, int temperature) {
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink(String name, Double price, Double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume + ", temperature=" + temperature;
    }
}
