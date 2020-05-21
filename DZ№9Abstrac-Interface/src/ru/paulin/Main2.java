package ru.paulin;

import ru.paulin.animal.Cat;
import ru.paulin.animal.Dog;
import ru.paulin.animal.Duck;

public class Main2 {

    public static void main(String[] args) {

        Duck duck = new Duck();
        System.out.println(duck.getName());
        duck.saySwim();
        duck.swim();
        duck.fly();
        duck.run();
        System.out.println(duck.swim(10));

        System.out.println("**********************************");

        Duck duck1 = new Duck("Duck", (float) 15.7);
        System.out.println(duck1.getName());
        duck1.saySwim();
        duck1.swim();
        duck1.fly();
        duck1.run();
        System.out.println(duck1.swim(10));

        System.out.println("**********************************");

        Dog dog = new Dog("Bim", 2.4);
        System.out.println(dog.getName());
        dog.run();
        dog.saySwim();
        dog.swim();
        System.out.println(dog.swim(14));

        System.out.println("**********************************");

        Cat cat = new Cat("Leopold");
        System.out.println(cat.getName());
        cat.run();


    }
}
