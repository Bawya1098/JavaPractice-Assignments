package com.company.PracticePrograms.Calculator;


import java.util.Scanner;

class Calculator {
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();

    int add() {
        int result = number1 + number2;
        return result;
    }

    int subtract() {
        int result = number1 - number2;
        return result;
    }

    int multiply() {
        int result = number1 * number2;
        return result;
    }

    double divide() {
        double result = number1 / number2;
        return result;
    }
}


