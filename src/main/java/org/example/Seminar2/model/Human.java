package org.example.Seminar2.model;

public class Human extends  Actor{
    public Human(String name) {
        super(name);
    }

    public Human() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }
}
