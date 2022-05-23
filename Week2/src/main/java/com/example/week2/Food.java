package com.example.week2;


import java.util.Date;

public class Food {
    private int id;
    private  String Name;
    private double Price;
    private Date Expiry_date;
    private int Quantity;

    public Food(int id, String name, double price, Date expiry_date, int quantity) {
        this.id = id;
        Name = name;
        Price = price;
        Expiry_date = expiry_date;
        Quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Date getExpiry_date() {
        return Expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        Expiry_date = expiry_date;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
