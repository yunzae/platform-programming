package com.cafe.order;
import com.cafe.menu.Beverage;

public class OrderItem {
    private Beverage beverage;
    private int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return beverage.toString() + ", quantity=" + quantity ;
    }
}