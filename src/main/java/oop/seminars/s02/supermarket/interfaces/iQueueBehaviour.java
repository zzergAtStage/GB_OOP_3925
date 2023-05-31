package oop.seminars.s02.supermarket.interfaces;

import oop.seminars.s02.supermarket.classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
