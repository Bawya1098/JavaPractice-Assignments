package com.company.PracticePrograms.practicedProblems.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class inserting_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int index;
        for (index = 0; index < arr.length; index++) {
            int element = sc.nextInt();
            arr[index] = element;
        }
        System.out.println(Arrays.toString((arr)));
        System.out.println("Enter the index at which the element inserted:");
        int insert_index = sc.nextInt();
        System.out.println("Enter element to be inserted:");
        int inserted_element = sc.nextInt();
        for (index = 0; index < arr.length; index++) {
            arr[insert_index] = inserted_element;
        }
        System.out.println("Changed list:");
        System.out.println(Arrays.toString(arr));
    }
}
