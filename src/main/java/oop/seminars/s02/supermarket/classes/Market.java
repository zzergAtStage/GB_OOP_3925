package oop.seminars.s02.supermarket.classes;

import oop.seminars.s02.supermarket.interfaces.iActorBehaviour;
import oop.seminars.s02.supermarket.interfaces.iMarketBehaviour;
import oop.seminars.s02.supermarket.interfaces.iQueueBehaviour;
import oop.seminars.s02.supermarket.interfaces.iReturnOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Маркет. Содержит характеристики и поведение, относящееся к обработке заказов.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour,iReturnOrder{

    private List<iActorBehaviour> queue;

    /**
     * Конструктор. Создает экземпляр класса и инициализирует внутреннюю очередь
     * для обработки заказов и клиентов.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Производит постановку клиента в очередь.
     *
     * @param actor Ссылка на клиента.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        Diagnostics.logMessage(this, actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Добавляет клиента в очередь.
     *
     * @param actor Ссылка на клиента.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        Diagnostics.logMessage(this, actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Освобождает клиентов из магазина.
     *
     * @param actors Список клиентов, которых нужно освободить.
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            Diagnostics.logMessage(this, actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Выполняет обновление состояния магазина.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Выдает заказы клиентам.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                Diagnostics.logMessage(this, actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Освобождает клиентов из очереди.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                Diagnostics.logMessage(this, actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Принимает заказы от клиентов в очереди.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                Diagnostics.logMessage(this, actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    /**
     * Проверяем товар на возможность возврата
     *
     * @param client Клиент
     * @return boolean
     */
    @Override
    public boolean isGoodsRefundable(iActorBehaviour client) {
        return false;
    }

    /**
     * Ставим клиента в очередь на возврат товара
     *
     * @param client Клиент
     */
    @Override
    public void getReturnOrderEnque(iActorBehaviour client) {
        client.setTakeOrder(true);
        if (client.getClass().getName() != "PromoClient"){
            giveOrder();
            releaseFromQueue();
        }
    }

    /**
     * Признак возврата средств
     *
     * @param client Клиент
     * @return Логика
     */
    @Override
    public boolean isGetRefunds(iActorBehaviour client) {
        return false;
    }
}
