package oop.seminars.s02.supermarket.classes;
import java.util.List;

import  oop.seminars.s02.supermarket.interfaces.*;
public class Market implements iQueueBehavior, iMarketBehavior{
    private List<iActorBehavior> queue;


    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " entered to the shop");
        takeInQueue(actor);
    }
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " taked in queue (line)");
    }

    @Override
    public void releaseFromQueue(iActorBehavior actor) {
        for (iActorBehavior item : queue) {
                queue.remove(actor);
        }
    }
    public void releaseFromMarket(List<Actor> actors){
        
    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void getOrder() {

    }
}
