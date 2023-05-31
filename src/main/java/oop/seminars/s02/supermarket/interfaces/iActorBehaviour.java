package oop.seminars.s02.supermarket.interfaces;

import oop.seminars.s02.supermarket.classes.Actor;

import java.util.List;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}
