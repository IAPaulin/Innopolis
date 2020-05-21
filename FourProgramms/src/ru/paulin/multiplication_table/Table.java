package ru.paulin.multiplication_table;

public class Table {

    public static void main(String[] args) {

        System.out.println("Данная прогррамма выводит таблицу умножения");
        table();

    }

    public static void table() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%4d", i * j);

            }
            System.out.println();

        }
    }

}
