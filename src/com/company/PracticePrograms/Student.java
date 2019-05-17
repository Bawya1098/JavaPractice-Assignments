package com.company.PracticePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    int subMarks1;
    int subMarks2;
    int subMarks3;

    Student(int rollno, String name, int subMarks1, int subMarks2, int subMarks3) {
        this.rollno = rollno;
        this.name = name;
        this.subMarks1 = subMarks1;
        this.subMarks2 = subMarks2;
        this.subMarks3 = subMarks3;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter details");
        for (int index = 0; index < size; index++) {
            String[] arr = scanner.nextLine().split(" ");
            int rollno = Integer.parseInt(arr[0]);
            String name = arr[1];
            int subMarks1 = Integer.parseInt(arr[2]);
            int subMarks2 = Integer.parseInt(arr[3]);
            int subMarks3 = Integer.parseInt(arr[4]);
            Student s = new Student(rollno, name, subMarks1, subMarks2, subMarks3);
            list.add(s);
            System.out.println(list);

        }


    }


}

