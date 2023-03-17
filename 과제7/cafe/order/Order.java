package com.cafe.order;

import com.cafe.menu.Beverage;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Order.PickUp delivery;
    private List<OrderItem> items = new ArrayList<>();
    private static int orderCounter = 1;
    private int orderNo;

    public static interface PickUp {
        public abstract void handle(Order o);

    }

    public void setPickUp(Order.PickUp pickup){
        //code
        this.delivery = pickup;
    }
    public void addItem(OrderItem orderitem){
        //code
        items.add(orderitem);

    }
    public void completed(){
        //code
        delivery.handle(this);
        orderCounter++;


    }
    //code here
    public int getOrderNo(){
        orderNo=orderCounter;
        return orderNo;
    }
    @Override
    public String toString() {
        return ""+items;
    }
}
