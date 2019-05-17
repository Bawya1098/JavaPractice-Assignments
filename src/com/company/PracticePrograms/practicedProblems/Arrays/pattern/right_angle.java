package com.company.PracticePrograms.practicedProblems.Arrays.pattern;

import java.util.Scanner;

public class right_angle {
    private static void rightangle(int max_Height) {
        int row, column;
        for (row = 1; row <= max_Height; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_Height = sc.nextInt();
        rightangle(max_Height);


    }
}
