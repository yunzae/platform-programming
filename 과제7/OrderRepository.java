package com.cafe.order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();
    private int pointer = -1;


    public boolean hasNext(){
        if (pointer < (orders.size()-1))
            return true;
        return false;
    }
    public Order next(){
        pointer++;
        Order order;
        try{
            order = orders.get(pointer);
        }catch (IndexOutOfBoundsException exception){
            throw new NoSuchElementException(exception.getMessage());
        }
        return order;
    }
    public void add(Order order){
        orders.add(order);
    }

    @Override
    public String toString() {


                orders.get(pointer+1);
        String msg2="";
        for(int i = pointer+1;i<orders.size();i++){
            msg2+="주문번호: "+ (i+1) +" - "+orders.get(i)+"\n";
        }
        String msg="---주문 관리자 화면---\n" +
                "현재 주문수는 총 " + (orders.size()-pointer-1)+" 입니다.\n\n\n"+
                "<주문 내역>\n"+
                msg2+"\n";
        return msg;
    }
}