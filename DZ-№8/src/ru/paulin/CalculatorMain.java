package ru.paulin;

import ru.paulin.calculator.Calculator;

import static ru.paulin.calculator.Calculator.*;
import static ru.paulin.calculator.Calculator.percent;

public class CalculatorMain {

    public static void main(String[] args) {

        System.out.println(Calculator.percent(100, 15));

        System.out.println(sum(4, 1));
        System.out.println(dif(26, 20));
        System.out.println(mult(3.5, 2));
        System.out.println(dev(0.24, 0.03));
        System.out.println(percent(16.8, 23.4));
    }
}
