package com.example.demo.item;


public abstract class Item {
    private String description;
    public Item() {}
    public abstract double price();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
