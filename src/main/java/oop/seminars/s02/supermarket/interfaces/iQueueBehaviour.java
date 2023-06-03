package oop.seminars.s02.supermarket.interfaces;

import oop.seminars.s02.supermarket.classes.Actor;

/**
 * Описывает поведение клиента в очереди.
 * Помещение в очередь, удаление, заказ товара и его выдачу
 */
public interface iQueueBehaviour {
    /**
     * Поставка клиента в очередь
     * @param actor любой из доступных в конструкторе ассоциированных типов
     */

    void takeInQueue(iActorBehaviour actor);

    /**
     * Извлечение клиента из очереди
     * Обрабатывает всю очередь
     */
    void releaseFromQueue();

    /**
     * Размещение заказа
     */
    void takeOrder();
    void giveOrder();
}
