package ru.paulin;

import ru.paulin.person.Child;
import ru.paulin.person.Sportsman;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Sportsman frenk = new Sportsman();
        System.out.println("Введите глубину погружения");
        frenk.swim(frenk.dive(scan.nextInt()));
        scan.nextLine();
        System.out.println("Введите какая у вас обувь");
        frenk.run(frenk.footwear(scan.nextLine()));


        Child kewin = new Child();
        kewin.swim(0);
        kewin.run(false);
    }
}
