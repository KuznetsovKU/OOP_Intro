package org.example.Seminar2;

import org.example.Seminar2.model.Actor;
import org.example.Seminar2.model.Human;
import org.example.Seminar2.model.Market;

public class Caffe {
    public static void main(String[] args) {
        Human human1 = new Human();
        Market caffe1 = new Market();

        caffe1.acceptToMarket(human1);
        caffe1.takeInQueue(human1);
        caffe1.takeOrders();
        caffe1.giveOrders();
        caffe1.releaseFromQueue();
        caffe1.releaseFromMarket(human1);
    }
}
