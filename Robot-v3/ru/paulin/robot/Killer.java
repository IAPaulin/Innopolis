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

    }


    public int getTypeArmament() {
        return typeArmament;
    }

    public void setTypeArmament(int typeArmament) {
        this.typeArmament = typeArmament;
    }

    public void pasportRobot(Killer rob) {

        System.out.println("Робот имеет имя " + rob.getName());
        System.out.println("Уникальный номер = " + hashCode());
        System.out.println("Тип привода " + rob.getTypeDrive());
        System.out.println("Максимальное усилие " + rob.getMaxPower());
        System.out.println("Подвижность робота  " + rob.getManipulation());
        System.out.println("Установлен тип вооружения " + rob.getTypeArmament());
        System.out.println("Задача: уничтожение противника");

    }


    public void proverkaInstllationWeapon(int typeArmament, double maxPower) {


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


    }


    public void conditioning(int numberAim, float distance, int typeArmament, Weather pog) {

        if (this.ataka) {

            switch (typeArmament) {
                case 1:
                    if ((numberAim < 5) && (distance < (100 * pog.getHindrance()))) {

                        shot(numberAim, distance, typeArmament);

                    } else if (numberAim >= 6) {
                        System.out.println("Слишком много целей");
                    } else if (distance > 100) {
                        System.out.println("Цели вне поля зрения");

                    } else if (distance * pog.getHindrance() < 100) {
                        System.out.println("Погода ограничивает дальность стрельбы, прицельная дальность равна " + 2500 * pog.getHindrance());
                    }
                    break;

                case 2:
                    if ((numberAim < 20) && (distance < (2500 * pog.getHindrance()))) {

                        shot(numberAim, distance, typeArmament);

                    } else if (numberAim >= 20) {
                        System.out.println("Слишком много целей");
                    } else if (distance >= 2500) {
                        System.out.println("Цели вне поля зрения");
                    } else if (distance * pog.getHindrance() < 2500) {
                        System.out.println("Погода ограничивает дальность стрельбы, прицельная дальность равна " + 2500 * pog.getHindrance());
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
                result = ((1 / (float) aim) * (100 / dis) * 5.2);
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
