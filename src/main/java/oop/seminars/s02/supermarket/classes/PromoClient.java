package oop.seminars.s02.supermarket.classes;

public class PromoClient extends Actor{
    private int clientPromoNumber;
    static int promoClientsAmount;


    static {
        promoClientsAmount = 0;
    }
    public PromoClient(String name, int currentPromoNumber){
        super(name);
        this.clientPromoNumber = currentPromoNumber;
        promoClientsAmount++;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        this.isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }
}
