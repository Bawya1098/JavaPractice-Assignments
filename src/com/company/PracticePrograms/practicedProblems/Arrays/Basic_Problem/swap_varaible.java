package com.company.PracticePrograms.practicedProblems.Arrays.Basic_Problem;

import java.util.Scanner;

public class swap_varaible {
    private static void swapvaraibles(int number1, int number2) {
        int swaped_number1, swaped_number2;
        swaped_number1 = number2 - number1;
        swaped_number2 = number2 - swaped_number1;
        swaped_number1 = swaped_number1 + swaped_number2;
        System.out.println("swaped_number1 is " + swaped_number1);
        System.out.println("swaped_number2 is :" + swaped_number2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1 + "\n" + number2);
        swapvaraibles(number1, number2);
    }
}
