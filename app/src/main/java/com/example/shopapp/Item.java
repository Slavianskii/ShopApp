package com.example.shopapp;

public class Item {
    private String name;
    private int price;
    private int img;
    public Item(String name, int price, int img){
        this.name = name;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getImg() {
        return img;
    }

}
