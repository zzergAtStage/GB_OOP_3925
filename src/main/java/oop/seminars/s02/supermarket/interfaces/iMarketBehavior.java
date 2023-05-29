package oop.seminars.s02.supermarket.interfaces;

import oop.seminars.s02.supermarket.classes.Actor;

import java.util.List;

public interface iMarketBehavior {
    public interface iMarketBehaviour {
        void acceptToMarket(Actor actor);
        void releaseFromMarket(List<Actor> actors);
        void update();
    }

}
