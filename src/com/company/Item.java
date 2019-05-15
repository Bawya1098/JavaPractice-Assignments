package com.company;

public class Item {
    int quantity;
    String name;
    int price;


    Item(int quantity, String name, int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name);
    }


}
