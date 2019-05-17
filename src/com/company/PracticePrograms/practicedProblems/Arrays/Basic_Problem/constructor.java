package com.company.PracticePrograms.practicedProblems.Arrays.Basic_Problem;

class constructor {

    int no;
    String name;

    constructor(int no, String name) {
        this.no = no;
        this.name = name;
    }

     void display() {
        System.out.println(no);
        System.out.println(name);

    }


    public static void main(String[] args) {
        constructor c = new constructor(22, "jayashree");
        c.display();

    }
}

