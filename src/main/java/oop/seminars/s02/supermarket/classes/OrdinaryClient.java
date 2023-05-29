package oop.seminars.s02.supermarket.classes;

import java.util.List;

public class OrdinaryClient extends Actor{
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    public void setTakeOrder(boolean value){
        super.isTakeOrder = value;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public  void setMakeOrder(boolean makeOrder){
        super.isMakeOrder = makeOrder;
    }

    @Override
    public String toString() {
        return "OrdinaryClient{" +
                "name ="  + this.getName() +
            "}";
    }

}
