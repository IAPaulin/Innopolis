package ru.paulin.person;

public abstract class Person implements Run, Swim {


    @Override
    public int dive(int glubina) {

        if (glubina < 1) {
            System.out.println("Я на поверхности воды");
        } else {
            if (glubina > 100) {
                System.out.println("Большая глубина не могу нырнуть");
                glubina = 0;
            } else {
                System.out.println("Я на глубине " + glubina + " м");
            }
        }
        return glubina;
    }


    @Override
    public void swim(int glubina) {
        if (glubina < 1) {
            System.out.println("Я плыву на поверхности воды");
        } else {
            System.out.println("Я плыву на глубине " + glubina + "м");
        }
    }


    @Override
    public boolean footwear(String kros) {

        if (kros.equalsIgnoreCase("кросовки")) {
            return true;
        } else {
            return false;
        }

    }


    @Override
    public void run(boolean kros) {
        if (kros) {
            System.out.println("Я бегу");
        } else {
            System.out.println("Не могу бежать, нужна другая обувь");
        }
    }


}


