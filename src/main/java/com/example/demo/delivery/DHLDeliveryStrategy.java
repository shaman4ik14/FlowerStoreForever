package com.example.demo.delivery;

import com.example.demo.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter @Setter
public class DHLDeliveryStrategy implements Delivery{
    private String name;
    private String description;

    public DHLDeliveryStrategy(){
        this.name = "DHL Delivery";
        this.description = "DHL Delivery Strategy";
    }

    @Override
    public void deliver(LinkedList<Item> items){
        items.removeAll(items);
        System.out.println("Items are delivered by DHL");
    }
}
