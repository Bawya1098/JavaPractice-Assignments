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

     static void calculateSaleTax(String name, int quantity, int cost, double Tax) {
        double calculatedTax = cost * Tax;
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %20s %20s ", "name", "quantity", "cost", "Tax", "TotalCost");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %20s %20s ", name, quantity, cost, Tax, calculatedTax);


    }


}
