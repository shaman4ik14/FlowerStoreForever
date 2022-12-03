package com.example.demo.payments;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreditCartPaymentStrategy implements Payment{
    private String name;
    private String description;

    public CreditCartPaymentStrategy() {
        name = "Credit Card";
        description = "Credit Card Payment";
    }

    @Override
    public boolean pay(double amount){
        System.out.println("Paid with Credit card");
        return true;
    }
}
