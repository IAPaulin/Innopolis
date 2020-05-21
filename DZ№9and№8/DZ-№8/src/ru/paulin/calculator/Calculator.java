package ru.paulin.calculator;

public class Calculator {

    public static double sum(double a, double b) {

        return a + b;
    }

    public static double mult(double a, double b) {

        return a * b;
    }

    public static double dev(double a, double b) {

        return a / b;
    }

    public static double dif(double a, double b) {

        return a - b;
    }

    public static double percent(double a, double b) {
        return (a / 100) * b;
    }
}
