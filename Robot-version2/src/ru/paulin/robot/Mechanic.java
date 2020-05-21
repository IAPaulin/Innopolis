package ru.paulin.robot;

import java.util.Scanner;

public class Mechanic extends Robot {


    public Mechanic() {
    }

    public Mechanic(double weight, String name, String typeDrive,
                    double maxPower, Manipulation manipulation) {

        super(weight, name, typeDrive, maxPower, manipulation);

        System.out.println("Задача: производить ремонт высокой сложности");
    }


    public void diagnosticError(int error) {

        double probability;
        Scanner scan = new Scanner(System.in);


        switch (error) {
            case 1:
                probability = Math.random() * 100;
                //System.out.println("prob "+ probability);
                if (probability > 50) {
                    System.out.println("Данная часть не исправна ");
                    System.out.println("Починить ? (Y/N)");
                    if ("Y".equals(scan.nextLine())) {

                        repairs();
                    } else {
                        System.out.println("Диагностика завершена");
                    }

                } else {
                    System.out.println("Все исправно ремонт не требуется");
                }

                break;
            case 2:
                probability = Math.random() * 100;
                //System.out.println("prob "+ probability);
                if (probability > 60) {
                    System.out.println("Данная часть не исправна ");
                    System.out.println("Починить ? (Y/N)");
                    if ("Y".equals(scan.nextLine())) {

                        repairs();
                    } else {
                        System.out.println("Диагностика завершена");
                    }

                } else {
                    System.out.println("Все исправно ремонт не требуется");
                }

                break;

            case 3:
                probability = Math.random() * 100;
                //System.out.println("prob "+ probability);
                if (probability > 50) {
                    System.out.println("Данная часть не исправна ");
                    System.out.println("Починить ? (Y/N)");
                    if ("Y".equals(scan.nextLine())) {

                        System.out.println("Извините отсутствуют необходимые инструменты");
                    } else {
                        System.out.println("Диагностика завершена");
                    }

                } else {
                    System.out.println("Все исправно ремонт не требуется");
                }

                break;

            case 4:
                probability = Math.random() * 100;
                // System.out.println("prob "+ probability);
                if (probability > 90) {
                    System.out.println("Данная часть не исправна ");
                    System.out.println("Починить ? (Y/N)");
                    if ("Y".equals(scan.nextLine())) {

                        repairs();
                    } else {
                        System.out.println("Диагностика завершена");
                    }

                } else {
                    System.out.println("Все исправно ремонт не требуется");
                }

                break;


        }


    }


    private void repairs() {
        double probability = Math.random() * 100;
        if (probability > 10) {
            System.out.println("Ремонт завершен удачно");
        } else {
            System.out.println("Ремонт не может быть выполнин");
        }
    }


}
