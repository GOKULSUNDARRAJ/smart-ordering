package com.example.myapplication.Model;


public class Product {
    private int imageResourceId;
    private String title;
    private String countAndPrice;


    public Product(int imageResourceId, String title, String countAndPrice) {
        this.imageResourceId = imageResourceId;
        this.title = title;
        this.countAndPrice = countAndPrice;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getCountAndPrice() {
        return countAndPrice;
    }
}
