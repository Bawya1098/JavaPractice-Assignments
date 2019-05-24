package com.company.Student;

public class Student {
    int rollno;
    String name;
    int subMarks1;
    int subMarks2;
    int subMarks3;
    String department;

    public Student(int rollno, String name, int subMarks1, int subMarks2, int subMarks3, String department) {
        this.rollno = rollno;
        this.name = name;
        this.subMarks1 = subMarks1;
        this.subMarks2 = subMarks2;
        this.subMarks3 = subMarks3;
        this.department = department;

    }

    public int total() {
        return subMarks1 + subMarks2 + subMarks3;
    }


    public String result() {
        String result;
        if (subMarks1 <= 25 || subMarks2 <= 25 || subMarks3 <= 25) {
            result = "FAIL";
        } else {
            result = "PASS";

        }
        return result;
    }


}




