package oop.seminars.s02.supermarket.interfaces;

import oop.seminars.s02.supermarket.classes.Actor;

import java.util.List;

public interface iActorBehaviour {
    /**
     * Устанавливает признак сформированного заказа
     * @param makeOrder Клиент создал заказ (да?нет)
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Устанавливает признак выдачи заказа клиенту
     * @param pickUpOrder Клиент получил заказ
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * Возвращает состояние заказа (создан-не создат)
     * @return Результат проверки
     */
    boolean isMakeOrder();

    /**
     * Возвращает признак получения заказа
     * @return Результат проверки
     */
    boolean isTakeOrder();

    /**
     * Ссылка на создателя заказа
     * @return ссылка на экземпляр
     */
    Actor getActor();
}
