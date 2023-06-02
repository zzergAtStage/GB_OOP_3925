package oop.seminars.s02.supermarket.interfaces;

public interface iReturnOrder {
    /**
     * Проверяем товар на возможность возврата
     *
     * @param client Клиент
     * @return boolean
     */
    boolean isGoodsRefundable(iActorBehaviour client);

    /**
     *
     * Ставим клиента в очередь
     *
     * @param client Клиент
     */
    void getReturnOrderEnque(iActorBehaviour client);

    /**
     * Признак возврата средств
     *
     * @param client Клиент
     * @return Логика
     */
    boolean isGetRefunds(iActorBehaviour client);


}
