package com.company.PracticePrograms.practicedProblems.Arrays.pattern;

import java.util.Scanner;

public class left_angle {
    private static void leftangle(int Max_length) {
        for (int row = 1; row <= Max_length; row++) {
            for (int space = Max_length; space > row; space--)
                System.out.print(" ");
            for (int star = 1; star <= row; star++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max_length = sc.nextInt();
        leftangle(Max_length);
    }
}
