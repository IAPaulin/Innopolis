package ru.paulin.robot;

import java.util.Scanner;

public abstract class Robot {

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
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getTypeDrive() {
        return typeDrive;
    }

    public void setTypeDrive(String typeDrive) {

        this.typeDrive = typeDrive;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public Manipulation getManipulation() {
        return manipulation;
    }

    public void setManipulation(Manipulation manipulation) {
        this.manipulation = manipulation;
    }


    public enum Manipulation {

        STATIC, DINAMIC;
    }


}




