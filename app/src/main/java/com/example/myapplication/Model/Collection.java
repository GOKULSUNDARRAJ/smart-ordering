package com.example.myapplication.Model;

public class Collection {

    private String date;
    private String category;
    private String name;
    private String price;
    private String quantity;

    public Collection(String date, String category, String name, String price, String quantity) {
        this.date = date;
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }
}
