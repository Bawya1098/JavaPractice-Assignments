package com.company.PracticePrograms.practicedProblems.Arrays.pattern;

import java.util.Scanner;

public class invert_triangle {
    private static void triangle(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        triangle(height);
    }
}
