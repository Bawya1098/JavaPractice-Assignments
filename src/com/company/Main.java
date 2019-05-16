package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double Tax = 0.15;
        Scanner sc = new Scanner(System.in);
        Item Item1 = new Item(1, "pen", 3);
        Item Item2 = new Item(1, "rubber", 5);
        Item Item3 = new Item(1, "scale", 10);
        Item Item4 = new Item(1, "Paper", 20);
        Item1.display();
        Item2.display();
        Item3.display();
        Item4.display();
        System.out.println("Enter the input");
        String[] input = sc.nextLine().split(" ");
        int quantity = Integer.parseInt(input[0]);
        String name = input[1];
        int cost = Integer.parseInt(input[3]);
        Item.calculateSaleTax(name, quantity, cost, Tax);
    }

}

