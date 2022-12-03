package com.example.demo.order;

import com.example.demo.delivery.Delivery;
import com.example.demo.item.Item;
import com.example.demo.payments.Payment;
import org.springframework.core.SpringVersion;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public void addItem(Item item){items.add(item);}

    public Item removeItem(Item item){
        items.remove(item);
        return item;
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for(Item flower: items)
            totalPrice += flower.price();
        return totalPrice;
    }

    public void processOrder(){
        if (payment.pay(calculateTotalPrice())){
            delivery.deliver(items);
        }
    }
}
