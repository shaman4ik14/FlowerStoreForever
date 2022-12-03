package com.example.demo.decorators;

import com.example.demo.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public double getPrice() {return 40 + item.price();}

    @Override
    public double price(){return getPrice();}

    @Override
    public String getDescription(){
        item.setDescription(item.getDescription() + "wrapped with Ribbon");
        return item.getDescription();
    }


}
