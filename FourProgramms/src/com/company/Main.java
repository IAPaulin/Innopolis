package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String stroka;

        stroka = creatData();
        String[] mass = stroka.split(" ");
        float[] masNum = new float[4];

        for (int i = 0; i < mass.length; i++) {
            masNum[i] = Float.parseFloat(mass[i]);
        }

        System.out.println("Минимальное из введеных чисел =" + masMin(masNum));


        // write your code here
    }

    public static String creatData() {
        String strok;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите 4 числа через пробел");
            strok = scan.nextLine();
            String[] mass = strok.split(" ");
            if (mass.length == 4) {
                break;
            } else {
                System.out.println("Повторите ввод");
            }
        }
        return strok;
    }


    public static float masMin(float[] masNum) {
        float min = masNum[0];
        for (int i = 1; i < masNum.length; i++) {
            if (min > masNum[i]) {
                min = masNum[i];
            }

        }
        return min;
    }
}
