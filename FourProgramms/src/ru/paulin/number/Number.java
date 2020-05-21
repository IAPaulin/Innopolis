package ru.paulin.number;

import java.io.IOException;
import java.util.Scanner;

public class Number {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        float num;

        while (true) {

            if (scan.hasNextFloat()) {

                num = scan.nextFloat();
                if (num == 0) {
                    System.out.println("Вы ввели нулевое значение");
                } else if (num > 0) {
                    System.out.println("Число положительное");
                } else {
                    System.out.println("Число отрицательное");
                }

                if (num % 2 == 0) {
                    System.out.println("Число четное");
                } else {
                    System.out.println("Число не четное");
                }


                break;


            } else {
                System.out.println("Вы ввели не число. Повторите ввод ");
                scan.nextLine();
                //Runtime.getRuntime().exec("clear");

            }
        }

    }

}
