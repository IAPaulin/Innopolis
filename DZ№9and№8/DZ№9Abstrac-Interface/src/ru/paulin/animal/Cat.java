package ru.paulin.animal;


public class Cat extends Animal implements Run {


    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Я не плавою и не летаю ");
        System.out.println("Я только бегаю и лежу ");
    }
}
