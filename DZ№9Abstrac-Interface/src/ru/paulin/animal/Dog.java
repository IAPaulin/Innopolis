package ru.paulin.animal;

public class Dog extends Animal implements Swim, Run {

    private String name;
    private double speed;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float swim(float dep) {
        System.out.println("Под водой не плаваю ");
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }

    @Override
    public void saySwim() {
        System.out.println("Плыву над водой");
    }

    @Override
    public void run() {
        System.out.println("Я бегу " + speed + " м/с");
    }
}
