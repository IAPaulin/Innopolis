package ru.kuznetsov.good_child;

public class Food1 extends Exception {

    private String name = "Каша";


    @Override
    public String getMessage() {
        return "Фу " + name;
    }


}