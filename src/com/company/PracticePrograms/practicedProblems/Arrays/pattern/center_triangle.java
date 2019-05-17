package com.company.PracticePrograms.practicedProblems.Arrays.pattern;

import java.util.Scanner;

public class center_triangle {
    private static void centertriangle(int Height) {
        for (int i = 0; i < Height; i++) {

            for (int j = Height - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

//            for (int j = i; j >= 1; j--) {
//                System.out.print("* ");
//            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Height = sc.nextInt();
        centertriangle(Height);
    }
}

