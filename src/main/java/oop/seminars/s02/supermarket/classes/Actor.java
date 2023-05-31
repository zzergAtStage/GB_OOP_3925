package oop.seminars.s02.supermarket.classes;
import oop.seminars.s02.supermarket.interfaces.*;

abstract public class Actor implements iActorBehavior{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }
    abstract public String getName();

    abstract public Actor getActor();
}
