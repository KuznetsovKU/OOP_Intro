package org.example.Seminar2.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour,
        MarketBehaviour {
    List<Actor> actorList = new LinkedList<Actor>();
    Queue<Actor> actorQueue = new LinkedList<Actor>();

    @Override
    public void takeInQueue(Actor actor) {
        actorQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        actorQueue.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        actorQueue.peek().setTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        actorQueue.poll();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actorList.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actorList.remove(actor);
    }

    @Override
    public void update() {

    }
}
