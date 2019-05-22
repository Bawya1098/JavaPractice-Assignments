package com.company.HackerRank;

import java.util.Scanner;

public class ArraySum {
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int index = 0; index < ar.length; index++) {
            sum = sum + ar[index];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        System.out.println(simpleArraySum(ar));

    }
}



