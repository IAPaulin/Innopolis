package ru.paulin;

import ru.paulin.robot.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int polomka;
        double maxPower;
        int typeArm;

        Mechanic r2d2 = new Mechanic(75, "R2D2", "Электропривод", 100,
                Robot.Manipulation.DINAMIC);

        System.out.println("Введите что нужно проверить (электроника 1) (механика 2)");
        System.out.println("(гидравлика или пневматика 3) (программа 4 ) ");

        polomka = proverka();
        r2d2.diagnosticError(polomka);

        System.out.println("******************************");
        System.out.println("******************************");


        System.out.println("Введите тип вооружения");
        typeArm = proverka();

        System.out.println("Введите мощность робота");
        maxPower = proverkaD();


        Killer terminator = new Killer(100, "T900", "Электро-пневматический",
                maxPower, Robot.Manipulation.DINAMIC, typeArm);

        terminator.setAtaka(terminator.conformanceInspection(typeArm, maxPower));
        terminator.conditioning(4, 800, typeArm);


        System.out.println("******************************");
        System.out.println("******************************");


        Walle walle = new Walle(30, "Валли", "Электромеханический",
                400, Robot.Manipulation.DINAMIC);

        walle.garbage(1);











        // write your code here
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


    protected static double proverkaD() {

        Scanner scan = new Scanner(System.in);

        double num;

        while (true) {

            if (scan.hasNextDouble()) {
                num = scan.nextDouble();

                break;
            } else {
                System.out.println("Повторите ввод");
                scan.nextLine();
            }
        }

        return num;

    }
}
