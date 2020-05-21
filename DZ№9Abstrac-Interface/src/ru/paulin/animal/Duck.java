package ru.paulin.animal;

public class Duck extends Animal implements Fly, Swim,Run{

    private String name;
    private float depth;

    public Duck() {
    }


    public Duck(String name, float depth) {
        this.name = name;
        this.depth = depth;
    }



    @Override
    public void saySwim() {
        System.out.println("Я на глубине "+ depth);
    }

    @Override
    public void swim() {
        System.out.println("Я  плыву на глубине "+ depth);
    }

    @Override
    public float swim(float dep) {
        this.depth =dep;
        return depth;
    }


    @Override
    public void fly() {
        System.out.println("Я лечу");
    }


    @Override
    public void run() {
        System.out.println("Я бегу");
    }




    @Override
    public String getName() {
        return name;
    }
}
