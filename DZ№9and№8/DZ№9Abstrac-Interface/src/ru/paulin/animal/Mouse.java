package ru.paulin.animal;

public class Mouse extends Animal {

    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }
}
