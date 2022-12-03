package com.example.demo.decorators;

import com.example.demo.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
}
