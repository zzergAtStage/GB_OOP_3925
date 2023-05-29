package oop.seminars.s02.supermarket.classes;

public class SpecialClient extends Actor{
    private int id;
    public SpecialClient(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    public void setMakeOrder(boolean makeOrder){
        super.isMakeOrder = isTakeOrder;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Actor getActor() {
        return this;
    }
}
