package ru.paulin;

import ru.paulin.car.Car;

public class CarMain {

    public static void main(String[] args) {

        final int part;

        Car toyta = new Car();
        System.out.println(Car.getCounter());
        System.out.println(toyta);

        Car reno = new Car();
        System.out.println(Car.getCounter());
        System.out.println(reno);

        Car lada = new Car();
        System.out.println(Car.getCounter());
        System.out.println(lada);

        Car ferari = new Car();
        System.out.println(Car.getCounter());
        System.out.println(ferari);

        part = Car.getCounter();
        System.out.println("Переменная final = " + part);

        Car jeep = new Car();
        System.out.println(Car.getCounter());

        //part = Car.getCounter();
        System.out.println("Переменная final = " + part);
    }
}
