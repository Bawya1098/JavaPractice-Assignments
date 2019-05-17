package com.company.PracticePrograms.practicedProblems.Arrays.Basic_Problem;

import java.util.Scanner;

public class reverse_string {
    private static void reversestring(char[] input) {
        int index;
        for (index = input.length - 1; index >= 0; index--) {
            System.out.print(input[index]);

        }
        System.out.print("\n");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        reversestring(input);
        System.out.println(input);


    }
}
