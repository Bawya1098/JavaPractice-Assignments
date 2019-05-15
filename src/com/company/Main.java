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

    }
}
