package ru.paulin;

import ru.paulin.robot.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите какого робота хотите создать: механик, воин, уборщик");

        //String kindRobot = scan.nextLine();
       // kindRobot =kindRobot.toLowerCase();

       /* switch(kindRobot){

            case "механик":


                Mechanic r2d2 = new Mechanic();

                System.out.println("Write weight");
                r2d2.setWeight(scan.nextDouble());

                scan.nextLine();

                System.out.println("Write name");
                r2d2.setName(scan.nextLine());

                System.out.println("Write type Drive");
                r2d2.setTypeDrive(scan.nextLine());

                System.out.println("Write Power");
                r2d2.setMaxPower(scan.nextDouble());

                System.out.println("Введите вид подвижности робота");
                r2d2.setManipulation(Robot.Manipulation.DINAMIC);    // нужно сделать что бы ввод был с клавиатуры

                r2d2.pasportRobot(r2d2);

                break;

            case "уборщик":

                Walle urn = new Walle(50,"Чистильщик","Электропривод",120, Robot.Manipulation.DINAMIC);
                System.out.println(urn);
                break;

            case "воин":

                Killer term = new Killer();

                System.out.println("Write weight");
                term.setWeight(scan.nextDouble());

                scan.nextLine();

                System.out.println("Write name");
                term.setName(scan.nextLine());

                System.out.println("Write type Drive");
                term.setTypeDrive(scan.nextLine());

                System.out.println("Write Power");
                term.setMaxPower(scan.nextDouble());

                System.out.println("Введите вид подвижности робота");
                term.setManipulation(Robot.Manipulation.DINAMIC);

                term.pasportRobot(term);

                break;



        }*/

        Killer kil =new Killer(150,"I","смешанный тип",10,Robot.Manipulation.DINAMIC,2);



        kil.pasportRobot(kil);
        kil.proverkaInstllationWeapon(kil.getTypeArmament(),kil.getMaxPower());
        kil.conditioning(4,2400,kil.getTypeArmament(),Weather.RAIN);


































    }



    }

