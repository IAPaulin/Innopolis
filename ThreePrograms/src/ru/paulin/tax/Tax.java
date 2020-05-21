package ru.paulin.tax;

import java.util.Scanner;

public class Tax {

    public static void tax() {
        System.out.println("Введите зарплату");
        Scanner scan = new Scanner(System.in);
        float salary = scan.nextFloat();
        System.out.println(" При зарплате в " + salary + " $ вы будете получать " + salary * 0.87 + " $");

    }
}
