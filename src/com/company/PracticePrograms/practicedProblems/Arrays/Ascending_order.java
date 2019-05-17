package com.company.PracticePrograms.practicedProblems.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int index, next_index, temp = 0;
        for (index = 0; index < arr.length; index++) {
            int element = sc.nextInt();
            arr[index] = element;
        }
        for (index = 0; index < arr.length; index++) {
            for (next_index = index + 1; next_index < arr.length; next_index++) {
                if (arr[index] < arr[next_index]) {
                    arr[index] = arr[index];
                } else {
                    temp = arr[index];
                    arr[index] = arr[next_index];
                    arr[next_index] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
