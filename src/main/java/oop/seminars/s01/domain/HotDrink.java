package oop.seminars.s01.domain;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(int productId, String productName, String productCategory, double price, int temperature) throws Exception {
        super(productId, productName, productCategory, price);
        //if vendingMachine does not support heating - we will set the temp of environment
        this.temperature = temperature == 0 ? DEFAULTTEMP : temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getProductName() + '\'' +
                ", category='" + super.getProductCategory() + '\'' +
                ", cost=" + super.getPrice() +
                ", temperature=" + this.temperature +
                "} ";
    }
}
