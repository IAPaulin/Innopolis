import ru.kuznetsov.VendingMachine;
import ru.kuznetsov.drinks.DrinkType;

import java.util.Scanner;

public class Main {


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
     * @param money - сумма
     */
    private static void processAddMoney(int money) {
        // TODO: добавить обработку исключительной ситуации - замятия
        if(vm.addMoney(money)==0){
            outzamitMony();
        }else{
            System.out.println("Текущий баланс: " + vm.getMoney());
        }

    }

    /**
     * обработка получения напитка
     * @param key - код напитка в автомате
     */
    private static void processGetDrink(int key) {
        // TODO: обработать все возможные исключения
        DrinkType drinkType = vm.giveMeADrink(key);
        if (drinkType != null) {
            System.out.println("Ммм! " + drinkType.getName() + "!");
        } else {
            System.out.println("Напиток почему-то не получен...");
        }
    }

    /**
     * обработка получения сдачи
     */
    private static void processEnd() {
        System.out.println("Ваша сдача: " + vm.getChange());
    }

    /**
     * выводит подсказку по доступным командам
     */
    private static void printHelp() {
        System.out.println( "Введите 'add <количество>' для добавления купюр" );
        System.out.println( "Введите 'get <код напитка>' для получения напитка" );
        System.out.println( "Введите 'end' для получения сдачи" );
    }


    /**
     * выдает замятые деньги обратно
     */
    public static  void outzamitMony(){
        System.out.println("Произошло замятие купюры ");
        processEnd();

    }
}
