package com.example.demo.flowers;

import com.example.demo.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class FlowerBucket extends Item {
    static List<Flower> flowers = new ArrayList<>();
    private double price = 0;

    public Flower searchFlower(double price){
        for (Flower flower: flowers)
            if (flower.price()== price) return flower;
        return null;
    }

    public void addFlowers(Flower flower){
        flowers.add(flower);
    }

    @Override
    public double price() {
        for(Flower flower: flowers)
            price += flower.price();
        return price;
    }

}
