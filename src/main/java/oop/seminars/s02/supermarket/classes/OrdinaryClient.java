package oop.seminars.s02.supermarket.classes;

import java.util.List;

public class OrdinaryClient extends Actor {

    /**
     * Конструктор класса OrdinaryClient.
     *
     * @param name имя клиента
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Получение имени клиента.
     *
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Получение экземпляра класса Actor (клиента).
     *
     * @return экземпляр класса Actor (клиента)
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Установка состояния возможности принятия заказа клиентом.
     *
     * @param value значение состояния принятия заказа
     */
    public void setTakeOrder(boolean value) {
        super.isTakeOrder = value;
    }

    /**
     * Проверка, может ли клиент сделать заказ.
     *
     * @return true, если клиент может сделать заказ, иначе false
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Проверка, может ли клиент принять заказ.
     *
     * @return true, если клиент может принять заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Установка состояния возможности сделать заказ клиентом.
     *
     * @param makeOrder значение состояния сделать заказ
     */
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Представление объекта OrdinaryClient в виде строки.
     *
     * @return строковое представление объекта OrdinaryClient
     */
    @Override
    public String toString() {
        return "OrdinaryClient{" +
                "name=" + this.getName() +
                "}";
    }
}
