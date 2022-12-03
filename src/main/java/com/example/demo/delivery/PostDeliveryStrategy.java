package com.example.demo.delivery;

import com.example.demo.item.Item;
import lombok.AllArgsConstructor;

import java.util.LinkedList;

@AllArgsConstructor
public class PostDeliveryStrategy implements Delivery{
    private String name;
    private  String description;


    public PostDeliveryStrategy(){
        this.description = "Post Delivery Strategy";
        this.name = "Post Delivery";
    }

    @Override
    public void deliver(LinkedList<Item> flowerList) {
        flowerList.removeAll(flowerList);
        System.out.println("Items are delivered by PDS");
        }
    }
