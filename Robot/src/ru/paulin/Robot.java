package ru.paulin;

import java.util.Scanner;

public class Robot {

    protected double weight;
    protected String name;
    protected String typeDrive;
    protected double maxPower;


    protected void diagnostics() {

        System.out.println("Робот имеет имя " + this.name);
        System.out.println("Уникальный номер = " + hashCode());
        System.out.println("Тип " + this.typeDrive);
        System.out.println("Максимальное усилие " + this.maxPower);


    }

    protected static int proverka() {

        Scanner scan = new Scanner(System.in);

        int num;

        while (true) {

            if (scan.hasNextInt()) {
                num = scan.nextInt();

                break;
            } else {
                System.out.println("Повторите ввод");
                scan.nextLine();
            }
        }

        return num;

    }
}
