package ru.kuznetsov;

public class VendingMachine {
    private double money = 0;
    private String[] drinks = new String[]{"Кока-кола", "Спрайт", "Фанта"};

    public void addMoney(double money) {
        this.money = money;
    }


    protected String getDrink(int key) {

        if (key > this.drinks.length) {
            return "NaN";
        } else {
            return this.drinks[key];
        }
    }


    public void giveMeADrink(int key) {
        if (this.money > 0) {

            String drink = getDrink(key);
            if (!(drink.equals("NaN"))) {
                System.out.println("Возьмите ваш напиток: " + drink);
            } else {
                System.out.println("Такого напитка нет!");
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }

}