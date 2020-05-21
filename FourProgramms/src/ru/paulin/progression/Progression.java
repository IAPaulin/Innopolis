package ru.paulin.progression;

import java.util.Scanner;

public class Progression {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String progressiv;
        float coff, number, sum;
        boolean exit = true;


        System.out.println("Для получения арифмитической прогрессии нужно ввести 'A' ");
        System.out.println("Для получения геометрической прогрессии нужно ввести 'G' ");
        System.out.println("Какую прогрессию нужно получить ?");

        progressiv = scan.nextLine();


        System.out.println("Введите количество элементов");
        number = proverka();
        System.out.println("Введите коэффициент прогрессии");
        coff = sum = proverka();


        while (exit) {

            switch (progressiv) {

                case "A":
                    for (int i = 1; i <= number; i++) {
                        if (i == 1) {
                            System.out.printf("%4d", i);
                            sum++;
                        } else {
                            System.out.printf("%4.0f ", sum);
                            sum += coff;

                        }

                    }
                    exit = false;
                    break;

                case "G":

                    for (int i = 1; i <= number; i++) {
                        if (i == 1) {
                            System.out.printf("%4d", i);

                        } else {
                            System.out.printf("%4.0f ", sum);
                            sum *= coff;

                        }

                    }
                    exit = false;
                    break;

                default: {
                    System.out.println("Такого варианта нет повторите выбор прогрессии");
                    System.out.println("Какую прогрессию нужно получить ?");
                    progressiv = scan.nextLine();
                    break;

                }

            }

        }


    }

    public static float proverka() {

        Scanner scan = new Scanner(System.in);

        float num;

        while (true) {

            if (scan.hasNextInt()) {
                num = scan.nextInt();
                System.out.println("Ввод принят");
                break;
            } else {
                System.out.println("Повторите ввод");
                scan.nextLine();
            }
        }

        return num;

    }

}
