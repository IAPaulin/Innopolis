package ru.kuznetsov.good_child;

public class Child {

    public String eat(int variant) throws Exception {

        Food2 f = new Food2();
        Food3 f2 = new Food3();

        String say;

        switch (variant) {

            case 1:
                throw new Food1();

            case 2:
                return say = "Отлично, " + f.getName();

            case 3:
                return say = "Мое любимое блюдо " + f2.getName();

            default:
                throw new RuntimeException();
        }


    }
}



