package ru.paulin.robot;

import java.util.Scanner;

public class Robot {

    private double weight;
    private String name;
    private String typeDrive;
    private double maxPower;


    private Manipulation manipulation;

    public Robot() {
    }

    public Robot(double weight, String name, String typeDrive, double maxPower, Manipulation manipulation) {
        this.weight = weight;
        this.name = name;
        this.typeDrive = typeDrive;
        this.maxPower = maxPower;
        this.manipulation = manipulation;

        System.out.println("Робот имеет имя " + this.name);
        System.out.println("Уникальный номер = " + hashCode());
        System.out.println("Тип " + this.typeDrive);
        System.out.println("Максимальное усилие " + this.maxPower);
        System.out.println("Подвижность робота  " + this.manipulation);
    }


    public enum Manipulation {

        STATIC, DINAMIC;
    }


}




