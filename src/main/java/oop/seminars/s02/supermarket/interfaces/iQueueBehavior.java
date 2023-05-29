package oop.seminars.s02.supermarket.interfaces;

import oop.seminars.s02.supermarket.classes.Actor;

public interface iQueueBehavior {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    void takeOrder();
    void getOrder();
}
