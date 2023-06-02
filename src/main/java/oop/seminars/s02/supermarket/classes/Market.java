package oop.seminars.s02.supermarket.classes;

import oop.seminars.s02.supermarket.interfaces.iActorBehaviour;
import oop.seminars.s02.supermarket.interfaces.iMarketBehaviour;
import oop.seminars.s02.supermarket.interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviour,iQueueBehaviour {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        Diagnostics.logMessage(this, actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        Diagnostics.logMessage(this,actor.getActor().getName()+" клиент добавлен в очередь ");
    }


    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            Diagnostics.logMessage(this,actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                Diagnostics.logMessage(this,actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                Diagnostics.logMessage(this,actor.getActor().getName()+" клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }


    /** Оформление заказа
     * Снабжает клиентов в очереди заказом
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                Diagnostics.logMessage(this,actor.getActor().getName()+" клиент сделал заказ ");

            }
        }

    }



}