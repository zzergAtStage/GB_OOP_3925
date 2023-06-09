package oop.seminars.s02.supermarket.classes;

import oop.seminars.s02.supermarket.interfaces.iActorBehaviour;
import oop.seminars.s02.supermarket.interfaces.iReturnOrder;

public class PromoClient extends Actor implements iReturnOrder {
    private int clientPromoNumber;
    static int promoClientsAmount;
    final static int PROMO_CLIENT_LIMIT = 2;

    static {
        promoClientsAmount = 0;
    }

    /**
     * Конструктор класса PromoClient.
     *
     * @param name               имя клиента
     * @param currentPromoNumber текущий номер клиента в акции
     * @throws TooManyClientException если достигнуто максимальное количество клиентов в акции
     */
    public PromoClient(String name, int currentPromoNumber) throws TooManyClientException {
        super(name);
        this.clientPromoNumber = currentPromoNumber;
        if (promoClientsAmount == PROMO_CLIENT_LIMIT) {
            StringBuilder sb = new StringBuilder();
            sb.append("Достигнуто максимальное количество клиентов, участвующих в акции: ")
                    .append(PROMO_CLIENT_LIMIT);
            //пишем в лог
            Diagnostics.logError(this, sb.toString());
            throw new TooManyClientException(sb.toString());
        }
        promoClientsAmount++;
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
     * Установка состояния возможности сделать заказ для клиента.
     *
     * @param makeOrder значение состояния сделать заказ
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    /**
     * Установка состояния возможности принять заказ для клиента.
     *
     * @param pickUpOrder значение состояния принять заказ
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        this.isTakeOrder = pickUpOrder;
    }

    /**
     * Проверка, может ли клиент сделать заказ.
     *
     * @return true, если клиент может сделать заказ, иначе false
     */
    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    /**
     * Проверка, может ли клиент принять заказ.
     *
     * @return true, если клиент может принять заказ, иначе false
     */
    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
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

    @Override
    public String toString() {
        return "PromoClient{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * Проверяем товар на возможность возврата
     *
     * @param client Клиент
     * @return boolean
     */
    @Override
    public boolean isGoodsRefundable(iActorBehaviour client) {
        if (((PromoClient) client).isTakeOrder){
            return true;
        }
        return false;
    }

    /**
     * Ставим клиента в очередь на возврат товара
     *
     * @param client Клиент
     */
    @Override
    public void getReturnOrderEnque(iActorBehaviour client) {
        client.setTakeOrder(true);
    }

    /**
     * Признак возврата средств
     *
     * @param client Клиент
     * @return Логика
     */
    @Override
    public boolean isGetRefunds(iActorBehaviour client) {
        return false;
    }
}
