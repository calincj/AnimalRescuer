package org.fasttrackit;

import java.time.LocalDateTime;

public class Food {


    String foodName;
    String foodType;
    String manufacturer;
    double qty;
    LocalDateTime expiryDate;
    boolean stock;

    public Food(String foodName) {
        this.foodName = foodName;
    }



}
