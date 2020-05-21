package ru.paulin.robot;

import ru.paulin.robot.Robot;

public class Walle extends Robot {


    public Walle() {
    }

    public Walle(double weight, String name, String typeDrive, double maxPower, Manipulation manipulation) {

        super(weight, name, typeDrive, maxPower, manipulation);

        System.out.println("Валли очень добрый и любит Еву");
    }

    public void say() {
        System.out.println("Евааа !");
    }

    public void garbage(int gar) {
        if (gar == 0) {
            System.out.println("Все чисто");
        } else {
            System.out.println("Нужно убраться");
        }
    }


}
