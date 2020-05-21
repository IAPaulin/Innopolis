package shop;

import org.apache.log4j.Logger;


public class Cashier {

    private final Logger LOG = Logger.getLogger(Cashier.class.getName());
    private float summa;
    Customer pok = new Customer();


    public void printCheck() {
        Product basket[] = pok.buyProduct();
        if (basket != null) {
            System.out.println(String.format("%10s  %13s %13s %13s", "Наименование товара", "Цена", "Колличество",
                    "Стоимость"));
            System.out.println(String.format("%53s", "=============================================================="));
            for (int i = 0; i < basket.length; i++) {
                if (basket[i] != null) {
                    System.out.println(String.format("%-15s  %17.2f %2s %6.2f %10s %-15.2f", basket[i].getName(),
                            basket[i].getCost(), "x",
                            basket[i].getNumber(), "=", basket[i].getNumber() * basket[i].getCost()));

                    summa += basket[i].getNumber() * basket[i].getCost();

                } else {
                    break;
                }


            }
            System.out.println(String.format("%53s", "=============================================================="));
            System.out.println(String.format("%-30s %30.2f", "Итого:", summa));

        } else {
            System.out.println("Корзина пуста");
        }
    }
}



