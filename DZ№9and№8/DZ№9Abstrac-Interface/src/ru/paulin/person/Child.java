package ru.paulin.person;

import java.time.Period;

public class Child extends Person {

    @Override
    public void swim(int glubina) {

        System.out.println("Ребенок не умеет плавать");
    }


    @Override
    public void run(boolean kros) {

        System.out.println("Ребенок не умеет бегать");

    }
}
