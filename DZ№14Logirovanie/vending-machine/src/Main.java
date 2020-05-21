import org.apache.log4j.Logger;
import ru.kuznetsov.VendingMachine;
import ru.kuznetsov.drinks.DrinkType;
import ru.kuznetsov.exception.BrokenMoneyException;
import ru.kuznetsov.exception.NotEnoughMoneyException;
import ru.kuznetsov.exception.WrongDrinkException;

import java.util.Scanner;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    private static VendingMachine vm = new VendingMachine();

    public static void main(String[] args) {

        System.setErr(System.out);

        System.out.println("Наши напитки: ");
        for (String line : vm.getDrinkTypes()) {
            System.out.println(line);
        }

        Scanner scan = new Scanner(System.in);
        printHelp();
        while (scan.hasNext()) {
            String command = scan.next();
            switch (command) {
                case "add": {
                    int money = scan.nextInt();
                    processAddMoney(money);
                    break;
                }
                case "get": {
                    int key = scan.nextInt();
                    processGetDrink(key);
                    break;
                }
                case "end": {
                    processEnd();
                    return;
                }
                default:
                    System.out.println("Команда не определена");
            }
            scan.nextLine();
        }

    }

    /**
     * обработка добавления денег в автомат
     *
     * @param money - сумма
     */
    private static void processAddMoney(int money) {
        // TODO: добавить обработку исключительной ситуации - замятия
        try {
            LOG.info("Добовление денег на счет");
            vm.addMoney(money);


        } catch (BrokenMoneyException e) {
            LOG.error("произошле замятие купюры");
            outzamitMony();

        }

    }

    /**
     * обработка получения напитка
     *
     * @param key - код напитка в автомате
     */
    private static void processGetDrink(int key) {
        // TODO: обработать все возможные исключения
        DrinkType drinkType = null;
        try {
            drinkType = vm.giveMeADrink(key);

        } catch (WrongDrinkException e) {
            System.out.println("В списке нет такого напитка");
            LOG.error("Выбран не сущиствующий товар");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Для покупки не хватает денег");
            System.out.println("Ваш баланс " + vm.getMoney());
            LOG.error("Попытка купить товар с низким балансом");
        }
        if (drinkType != null) {
            System.out.println("Ммм! " + drinkType.getName() + "!");
            LOG.info("Был получен товар " + drinkType.getName());
        }
    }

    /**
     * обработка получения сдачи
     */
    private static void processEnd() {
        System.out.println("Ваша сдача: " + vm.getChange());
        BrokenMoneyException.setZamitMony(0);
        LOG.info("Выдана сдача");
    }

    /**
     * выводит подсказку по доступным командам
     */
    private static void printHelp() {
        System.out.println("Введите 'add <количество>' для добавления купюр");
        System.out.println("Введите 'get <код напитка>' для получения напитка");
        System.out.println("Введите 'end' для получения сдачи");
    }


    /**
     * выдает замятые деньги обратно
     */
    public static void outzamitMony() {
        System.out.println("Произошло замятие купюры сейчас получите сдачу ");
        processEnd();

    }
}
