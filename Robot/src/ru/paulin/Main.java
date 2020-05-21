package ru.paulin;

public class Main {

    public static void main(String[] args) {

        Mechanic r2d2 = new Mechanic();

        r2d2.maxPower = 20;
        r2d2.name = "R2D2";
        r2d2.typeDrive = "Электромеханический";
        r2d2.weight = 80;
        r2d2.diagnostics();
        r2d2.diagnosticError();


        System.out.println("******************************");


        Killer terminator = new Killer();

        terminator.maxPower = 300;
        terminator.name = "T-800";
        terminator.typeDrive = "Электромеханический";
        terminator.weight = 100;
        terminator.diagnostics();
        terminator.conditioning();

        System.out.println("******************************");

        Walle walle = new Walle();

        walle.maxPower = 500;
        walle.name = "Wall*e";
        walle.typeDrive = "Электромеханический";
        walle.weight = 75;
        walle.diagnostics();
        walle.say();
        walle.garbage(10);
        // write your code here
    }
}
