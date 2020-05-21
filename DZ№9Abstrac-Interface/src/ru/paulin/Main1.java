package ru.paulin;

import ru.paulin.animal.Cat;
import ru.paulin.animal.Dog;
import ru.paulin.animal.Mouse;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя кота");
        Cat cat = new Cat(scan.nextLine());

        System.out.println("Введите имя кота");
        Cat cat1 = new Cat(scan.nextLine());

        System.out.println(cat.getName());
        System.out.println(cat1.getName());

        System.out.println("Введите имя собаки");
        Dog dog = new Dog(scan.nextLine());
        System.out.println(dog.getName());

        System.out.println("Введите имя мыши");
        Mouse mouse = new Mouse(scan.nextLine());
        System.out.println(mouse.getName());


//        Cat cat2 =new Cat();
//        Animal am =new Cat();
//
//        System.out.println(am);


    }
}
