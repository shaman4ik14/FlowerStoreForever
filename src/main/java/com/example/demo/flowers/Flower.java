package com.example.demo.flowers;

import com.example.demo.item.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    @Id @GeneratedValue @Getter @Setter
    private int id;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private double petal;
    @Getter
    private double price;

    @Override
    public double price(){
        return price;
    }
}
