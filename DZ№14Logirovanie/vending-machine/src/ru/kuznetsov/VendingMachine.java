package ru.kuznetsov;

import org.apache.log4j.Logger;


import ru.kuznetsov.drinks.ColdDrinkType;
import ru.kuznetsov.drinks.DrinkType;
import ru.kuznetsov.drinks.HotDrinkType;
import ru.kuznetsov.drinks.Product;
import ru.kuznetsov.exception.BrokenMoneyException;
import ru.kuznetsov.exception.NotEnoughMoneyException;
import ru.kuznetsov.exception.WrongDrinkException;


/**
 * Торговый автомат
 */
public class VendingMachine {

    private static final Logger LOG = Logger.getLogger(VendingMachine.class.getName());//
    private double money = 0;


    private Product[] drinks = new Product[]{
            new Product(ColdDrinkType.COCA, 10),
            new Product(ColdDrinkType.PEPSI, 10),
            new Product(ColdDrinkType.SPRITE, 1),
            new Product(ColdDrinkType.FANTA, 3),
            new Product(HotDrinkType.GREEN_TEA, 100),
            new Product(HotDrinkType.BLACK_TEA, 100),
            new Product(HotDrinkType.AMERICANO, 100),
            new Product(HotDrinkType.CAPPUCINO, 100)
    };

    /**
     * Добавление купюр в автомат
     *
     * @param money - сумма внесенных купюр
     * @return текущий остаток
     */
    public double addMoney(double money) throws BrokenMoneyException {


        // TODO: имитировать замятие купюры
        // TODO: сумму замятых купюр сохранить в исключении
        // TODO: ошибка должна обрабатываться на уровне пользователя (в классе Main)

        if (probability()) {

            throw new BrokenMoneyException("купюра замята", money);


        } else {
            this.money += money;
        }

        return this.money;
    }

    /**
     * Получает из автомата выбранный напиток
     * <p>
     * В методе есть проверка корректности кода напитка, проверка остатков данного продукта
     * и достаточно ли денег чтобы его купить. В случае ошибок выбрасывать соответствующее исключение
     *
     * @param key код продукта
     * @return напиток;
     */
    public DrinkType giveMeADrink(int key) throws WrongDrinkException, NotEnoughMoneyException {
        if (!isKeyValid(key)) {
            // TODO: возвращать соответствующую ошибку
            throw new WrongDrinkException("Не верно выбран напиток");
            // Неправильный код товара - товар не возвращается

        }

        Product selected = drinks[key];
        if (!isMoneyEnough(selected)) {
            // TODO: возвращать соответствующую ошибку
            throw new NotEnoughMoneyException("Не хватает денег");
            // Нехватает денег - товар не возвращается

        }

        DrinkType drink = selected.take();
        money -= drink.getPrice();
        return drink;


    }

    /**
     * Формирует список товаров
     *
     * @return строки с информацией о товаре
     */
    public String[] getDrinkTypes() {
        String[] result = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            result[i] = String.format("%d - %12s: %6.2f руб", i, drinks[i].getName(), drinks[i].getPrice());
        }
        return result;
    }

    /**
     * Проверка что хватает денег на выбранный напиток
     *
     * @param selected - выбранный напиток
     * @return true если денег хватает, иначе - false
     */
    private boolean isMoneyEnough(Product selected) {
        return money >= selected.getPrice();
    }

    /**
     * Проверка что выбрали существующий тип напитка
     * Не проверяет остаток, только границы массива
     *
     * @param key номер напитка
     * @return true если есть напиток с таким номером, иначе false
     */
    private boolean isKeyValid(int key) {
        return key >= 0 && key < drinks.length;
    }

    /**
     * Выдать сдачу.
     * Количество введеных купюр обнуляется
     *
     * @return остаток
     */
    public double getChange() {
        double money = this.money;
        this.money = 0;
        return money + BrokenMoneyException.getZamitMony();
    }

    /**
     * Мой код
     *
     * @return
     */


    public double getMoney() {
        return money;
    }

    /**
     * Метод создает вероятность замятие купюры
     */
    private boolean probability() {

        double a = Math.random();
        System.out.println("aaaaaaaaaaaaaa" + a);

        return a > 0.5;

    }


}


