package ru.paulin.robot;

public class Killer extends Robot {


    private int typeArmament;
    private boolean ataka;


    public Killer() {
    }

    public Killer(double weight, String name, String typeDrive, double maxPower,
                  Manipulation manipulation, int typeArmament) {

        super(weight, name, typeDrive, maxPower, manipulation);
        this.typeArmament = typeArmament;


        System.out.println("Тип вооружения  " + this.typeArmament);
        System.out.println("Задача: уничтожение противника");
    }

    public boolean conformanceInspection(int typeArmament, double maxPower) {

        boolean ataka;

        switch (typeArmament) {
            case 1:
                if (maxPower >= 50) {
                    System.out.println("Данный тип вооружения подходит для данной модели");
                    ataka = true;
                } else {
                    System.out.println("Невозможно установить");
                    ataka = false;
                }
                break;
            case 2:
                if (maxPower >= 200) {
                    System.out.println("Данный тип вооружения подходит для данной модели");
                    ataka = true;
                } else {
                    System.out.println("Невозможно установить");
                    ataka = false;
                }
                break;
            case 3:
                if (maxPower >= 500) {
                    System.out.println("Данный тип вооружения подходит для данной модели");
                    ataka = true;
                } else {
                    System.out.println("Невозможно установить");
                    ataka = false;
                }
                break;

            default:
                System.out.println("Такого типа вооружения не существует");
                ataka = false;

        }

        return ataka;

    }

    public void setAtaka(boolean ataka) {
        this.ataka = ataka;
    }

    public void conditioning(int numberAim, float distance, int typeArmament) {

        if (this.ataka) {

            switch (typeArmament) {
                case 1:
                    if ((numberAim < 5) && (distance < 100)) {

                        shot(numberAim, distance, typeArmament);

                    } else if (numberAim >= 6) {
                        System.out.println("Слишком много целей");
                    } else if (distance > 100) {
                        System.out.println("Цели вне поля зрения");

                    }
                    break;

                case 2:
                    if ((numberAim < 20) && (distance < 2500)) {

                        shot(numberAim, distance, typeArmament);

                    } else if (numberAim >= 20) {
                        System.out.println("Слишком много целей");
                    } else if (distance >= 2500) {
                        System.out.println("Цели вне поля зрения");

                    }
                    break;

                case 3:
                    if ((500 <= distance) && (distance < 15000)) {

                        shot(numberAim, distance, typeArmament);

                    } else {
                        System.out.println("Цели вне поля зрения");

                    }
                    break;

            }


        } else {
            System.out.println("огонь не возможен, нет вооружения");
        }
    }


    private void shot(int aim, float dis, int typeArmament) {

        double result;

        switch (typeArmament) {
            case 1:
                result = ((1 / (float) aim) * (80 / dis) * 1.2);
                break;
            case 2:
                result = ((10 / (float) aim) * (1500 / dis) * 2.4);
                break;

            case 3:
                result = ((10000 / dis) * 101);
                break;
            default:
                result = 0;

        }

        if (result > aim) {
            System.out.println("Все цели уничтожены");
        } else {
            System.out.println("Поражено целей " + (int) result);
        }

    }


}
