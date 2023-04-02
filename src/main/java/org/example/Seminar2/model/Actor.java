package org.example.Seminar2.model;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public abstract String getName();

    public Actor() {
        this("someClient");
    }

    public Actor(String name) {
        this.name = name;
        this.makeOrder = false;
        this.takeOrder = false;
    }

    @Override
    public boolean isMakeOrder() {
        return makeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return takeOrder;
    }
}
