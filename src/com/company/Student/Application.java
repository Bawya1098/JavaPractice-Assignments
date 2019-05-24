package com.company.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Department dept = new Department();
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
        printStudentDetailsWithResult(students, dept.setDepartment());


        System.out.println("---------STUDENT DETAILS WITH DEPARTMENT----------------------");
        printDepartmentWiseStudentDetails(students, dept.setDepartment());

        System.out.println("---------STUDENT DETAILS WITH DEPARTMENT--HOD--------------------");
        printDepartmentWithHOD(students, dept.setDepartment());


    }

    private static void printDepartmentWithHOD(List<Student> students, HashMap<String, String> department) {
        for (String key : department.keySet()) {
            System.out.println("Department:" + key);
            System.out.println("Hod: " + department.get(key));
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                int total = student.total();
                String result = student.result();
                if (key.equalsIgnoreCase(student.department)) {
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
    }


    private static void printDepartmentWiseStudentDetails(List<Student> students, HashMap<String, String> department) {
        for (String key : department.keySet()) {
            System.out.println("Department:" + key);
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                int total = student.total();
                String result = student.result();
                if (key.equalsIgnoreCase(student.department)) {
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
    }

    private static void printStudentDetailsWithResult
            (List<Student> students, HashMap<String, String> department) {
        System.out.println("---------STUDENT DETAILS WITH RESULT----------------------");
        System.out.printf("%5s %5s %5s %5s %5s %5s %10s %5s %10s", "ROLLNO", "NAME", "MARKS 1", "MARKS 2", "MARKS 3", "TOTAL", "RESULT", "DEPARTMENT", "DEPARTMENT__HOD");
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int total = student.total();
            String result = student.result();
            if (department.containsKey(student.department)) {
                if (result.equals("FAIL")) {
                    String totalMarks = "-";
                    System.out.printf("%5s %5s %5s %5s %5s %10s %10s %5s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, totalMarks, result, student.department, department.get(student.department));
                    System.out.println();
                } else {
                    System.out.printf("%5s %5s %5s %5s %5s %10s %10s %5s %10s", student.rollno, student.name, student.subMarks1, student.subMarks2, student.subMarks3, total, result, student.department, department.get(student.department));
                    System.out.println();
                }
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
        String dept = arr[5];
        return new Student(rollno, name, subMarks1, subMarks2, subMarks3, dept);
    }


}