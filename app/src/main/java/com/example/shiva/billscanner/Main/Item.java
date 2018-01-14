package com.example.shiva.billscanner.Main;

import java.util.Date;

/**
 * Created by shiva on 30-12-2017.
 */

public class Item {
    private int id;
    private String name;
    private int completed;
    private double price;
    private String date;
    private String purchase;

    public Item(int id,String name, int completed, double price, String date,String purchase) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.price = price;
        this.date = date;
        this.purchase = purchase;
    }

    public String getPurchase() {
        return purchase;
    }

    public String getName() {
        return name;

    }

    public int getId() {
        return id;
    }

    public int isCompleted() {
        return completed;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }


}
