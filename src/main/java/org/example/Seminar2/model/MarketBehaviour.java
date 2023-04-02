package org.example.Seminar2.model;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
    void update();
}
