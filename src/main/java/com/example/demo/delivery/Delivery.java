package com.example.demo.delivery;

import com.example.demo.item.Item;

import java.util.LinkedList;

public interface Delivery {
    public void deliver(LinkedList<Item> flowerList);
}
