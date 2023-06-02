package oop.seminars.s02.supermarket.classes;

public class PromoClient extends Actor{
    private int clientPromoNumber;
    static int promoClientsAmount;
    final static int PROMO_CLIENT_LIMIT = 2;

    static {
        promoClientsAmount = 0;
    }
    public PromoClient(String name, int currentPromoNumber) throws TooManyClientException {
        super(name);
        this.clientPromoNumber = currentPromoNumber;
        if (promoClientsAmount==PROMO_CLIENT_LIMIT) {
            StringBuilder sb = new StringBuilder();
            sb.append("Достигнуто максимальное количество клиентов, участвующих в акции:")
                    .append(PROMO_CLIENT_LIMIT);
            throw new TooManyClientException(sb.toString());
        }
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
