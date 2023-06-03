package oop.seminars.s02.supermarket.classes;

import oop.seminars.s02.supermarket.interfaces.iActorBehaviour;

/**
 * Абстрактный класс, представляющий актера в супермаркете.
 */
abstract public class Actor implements iActorBehaviour {

    /**
     * Имя актера.
     */
    protected String name;

    /**
     * Флаг, указывающий, может ли актер принять заказ.
     */
    protected boolean isTakeOrder;

    /**
     * Флаг, указывающий, может ли актер сформировать заказ.
     */
    protected boolean isMakeOrder;

    /**
     * Конструктор класса Actor.
     *
     * @param name Имя актера.
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени актера.
     *
     * @return Имя актера.
     */
    abstract public String getName();

    /**
     * Абстрактный метод для получения экземпляра актера.
     *
     * @return Экземпляр актера.
     */
    abstract public Actor getActor();
}
