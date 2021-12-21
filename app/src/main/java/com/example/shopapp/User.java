package com.example.shopapp;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String login;
    private List<Item> cart;

    public User(String login){
        this.login = login;
        this.cart = new LinkedList<Item>();
    }
    void Add_to_Cart(Item item){
        this.cart.add(item);
    }
    int Cart_Size(){
        return cart.size();
    }
    String getLogin(){
        return this.login;
    }
    void Delete_from_Cart(Item item){
        this.cart.remove(item);
    }

}
