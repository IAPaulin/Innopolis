package ru.paulin;

import ru.paulin.trade.Act;
import ru.paulin.trade.Contract;
import ru.paulin.trade.Convertor;

import java.time.LocalDate;
import java.util.Scanner;

public class TradeMain {

    public static void main(String[] args) {


        Contract con1 = new Contract();
        System.out.println("введите количество товара");
        con1.setNumber(proverka());

        System.out.println("Введите номер договора");
        con1.setNumberContract(proverka());

        System.out.println("Введите дату  договора  год, месяц, день ");
        con1.setData(LocalDate.of(proverka(), proverkaMonth(), proverkaDay()));


        System.out.println(con1.getNumberContract());
        System.out.println(con1.getData());

        String[] a;
        a = con1.getProduct();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        System.out.println("**********ACT*************");

        Act act = Convertor.convertor(con1);


        Convertor.convertor(con1);
        System.out.println(act.getNumberContract());
        System.out.println(act.getData());
        System.out.println(act.getProduct());
    }


    private static int proverka() {

        Scanner scan = new Scanner(System.in);

        int num;

        while (true) {

            if (scan.hasNextInt()) {
                num = scan.nextInt();
                break;
            } else {
                System.out.println("Повторите ввод");
                scan.nextLine();
            }
        }

        return num;

    }

    private static int proverkaMonth() {

        Scanner scan = new Scanner(System.in);

        int num;

        while (true) {

            if ((scan.hasNextInt()) && ((num = scan.nextInt()) < 13)) {
                break;
            } else {
                System.out.println("Повторите ввод");
                scan.nextLine();
            }
        }

        return num;

    }

    private static int proverkaDay() {

        Scanner scan = new Scanner(System.in);

        int num;

        while (true) {

            if ((scan.hasNextInt()) && ((num = scan.nextInt()) < 32)) {
                break;
            } else {
                System.out.println("Повторите ввод");
                scan.nextLine();
            }
        }

        return num;

    }


}
