package ru.paulin.fuel;

import ru.paulin.tax.Tax;
import ru.paulin.time.Time;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Введите количество литров");
        Scanner scan = new Scanner(System.in);
        float numberLiter = scan.nextFloat();
        sumFuel(numberLiter);

        System.out.println();
        System.out.println();

        Tax cost = new Tax();
        cost.tax();

        System.out.println();
        System.out.println();

        Time converter = new Time();
        converter.time();


        // write your code here
    }

    static void sumFuel(float liter) {
        float cost = 43;
        System.out.println("стоимость за " + liter + " литра будет равна " + liter * cost);
    }
}
