package com.company.PracticePrograms.practicedProblems.Arrays.Basic_Problem;


import java.util.Arrays;
import java.util.Scanner;

public class sum_average {
    private static void sumandAverage(int[] input) {
        int index, sum = 0, average;
        for (index = 0; index < input.length; index++) {
            sum = input[index] + sum;
        }
        average = sum / input.length;
        System.out.println("sum is: " + sum);
        System.out.println("Average is: " + average);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        int element;
        for (element = 0; element < input.length; element++) {
            int input1 = sc.nextInt();
            input[element] = input1;

        }
        sumandAverage(input);
        System.out.println("array is :" + Arrays.toString(input));
    }
}

