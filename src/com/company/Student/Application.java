package com.company.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter details");

        for (int index = 0; index < size; index++) {
            String userInput = scanner.nextLine();
            Student s = getStudent(userInput);
            students.add(s);
        }

        printStudentDetails(students);

        System.out.println();

        printStudentsDetailsWithTotal(students);

        System.out.println();

        printStudentDetailsWithResult(students);


        System.out.println("---------STUDENT DETAILS WITH DEPARTMENT----------------------");
        printDepartmentWiseStudentDetails(students, "CSE");
        printDepartmentWiseStudentDetails(students, "ECE");
    }

    private static void printDepartmentWiseStudentDetails(List<Student> students, String department) {
        System.out.println("department: " + department);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int total = student.total();
            String result = student.result();
            if ((student.department.equalsIgnoreCase(department))) {
                if (result.equals("FAIL")) {
                    String totalMarks = "-";
                    System.out.printf("%5s %5s %5s %5s %5s %10s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, totalMarks, result);
                    System.out.println();
                } else {
                    System.out.printf("%5s %5s %5s %5s %5s %10s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, total, result);
                    System.out.println();
                }
            }
        }
    }

    private static void printStudentDetailsWithResult(List<Student> students) {
        System.out.println("---------STUDENT DETAILS WITH RESULT----------------------");
        System.out.printf("%5s %5s %5s %5s %5s %5s %10s", "ROLLNO", "NAME", "MARKS 1", "MARKS 2", "MARKS 3", "TOTAL", "RESULT");
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int total = student.total();
            String result = student.result();
            if (result.equals("FAIL")) {
                String totalMarks = "-";
                System.out.printf("%5s %5s %5s %5s %5s %10s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, totalMarks, result);
                System.out.println();
            } else {
                System.out.printf("%5s %5s %5s %5s %5s %10s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, total, result);
                System.out.println();
            }
        }
    }

    private static void printStudentsDetailsWithTotal(List<Student> students) {
        System.out.println("---------STUDENT DETAILS WITH TOTAL----------------------");
        System.out.printf("%5s %5s %5s %5s %5s %5s", "ROLLNO", "NAME", "MARKS 1", "MARKS 2", "MARKS 3", "TOTAL");
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int total = student.total();
            System.out.printf("%5s %5s %5s %5s %5s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, total);
            System.out.println();
        }
    }

    private static void printStudentDetails(List<Student> students) {
        System.out.println("-------STUDENT DETAILS WITH MARKS-------");
        System.out.printf("%5s %5s %5s %5s %5s", "ROLLNO", "NAME", "MARKS 1", "MARKS 2", "MARKS 3");
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.printf("%5s %5s %5s %5s %5s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3);
            System.out.println();
        }
    }

    private static Student getStudent(String userInput) {
        String[] arr = userInput.split(" ");
        int rollno = Integer.parseInt(arr[0]);
        String name = arr[1];
        int subMarks1 = Integer.parseInt(arr[2]);
        int subMarks2 = Integer.parseInt(arr[3]);
        int subMarks3 = Integer.parseInt(arr[4]);
        String department = arr[5];
        return new Student(rollno, name, subMarks1, subMarks2, subMarks3, department);
    }


}