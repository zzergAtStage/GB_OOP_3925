package oop.seminars.s02.supermarket.classes;

import oop.seminars.s02.supermarket.interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Конструктор класса TaxService.
     */
    public TaxService() {

        this.name = "Tax audit";
    }

    /**
     * Получение имени TaxService.
     *
     * @return имя TaxService
     */
    public String getName() {
        return this.name;
    }

    /**
     * Проверка, может ли TaxService сделать заказ.
     *
     * @return true, если TaxService может сделать заказ, иначе false
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Проверка, может ли TaxService принять заказ.
     *
     * @return true, если TaxService может принять заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Установка состояния возможности сделать заказ для TaxService.
     *
     * @param makeOrder значение состояния сделать заказ
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Установка состояния возможности принять заказ для TaxService.
     *
     * @param pickUpOrder значение состояния принять заказ
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    /**
     * Получение экземпляра класса Actor (обычного клиента) для TaxService.
     *
     * @return экземпляр класса Actor (обычного клиента)
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(this.name);
    }
}
