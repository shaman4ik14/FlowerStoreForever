package com.example.demo.decorators;

import com.example.demo.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription(){
        return item.getDescription() + "wrapped with basket";
    }

    @Override
    public double price(){
        return (4 + getPrice());
    }

    public double getPrice(){
        return item.price();
    }
}
