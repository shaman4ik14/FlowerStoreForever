package com.example.demo.decorators;


import com.example.demo.item.Item;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public double price() {return getPrice();}

    @Override
    public String getDescription(){
        item.setDescription(item.getDescription() + "Wrapped in paper");
        return item.getDescription();
    }

    public double getPrice(){return 13 + item.price();}

}
