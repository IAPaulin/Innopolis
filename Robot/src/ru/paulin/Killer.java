package ru.paulin;

public class Killer extends Robot {

    protected void conditioning() {

        int numberAim;
        double distance;
        System.out.println("Введите количество целей");
        numberAim = proverka();

        System.out.println("Введите расстояние до цели в метрах");
        distance = proverka();

        if ((numberAim < 6) & (distance < 10000)) {

            shot(numberAim, distance);

        } else if (numberAim > 6) {
            System.out.println("Слишком много целей");
        } else if (distance > 10000) {
            System.out.println("Цели вне поля зрения");

        }


    }

    private void shot(int aim, double dis) {

        double result = ((1 / (float) aim) * (1000 / dis) * 1.2);
        //System.out.println(result);

        if (result > aim) {
            System.out.println("Все цели уничтожены");
        } else {
            System.out.println("Поражено целей " + (int) result);
        }

    }

    @Override
    protected void diagnostics() {
        super.diagnostics();
        System.out.println("Задача: уничтожение противника");
    }
}
