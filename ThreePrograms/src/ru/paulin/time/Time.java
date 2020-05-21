package ru.paulin.time;

import java.io.InputStream;
import java.util.Scanner;

public class Time {

    public static void time() {


        /*

        //Почему не работает ?  взят из примера.

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); */

        System.out.println("Введите колличество секунд");
        Scanner scan = new Scanner(System.in);
        float seconds = scan.nextFloat();
        System.out.println(seconds + " секунд это " + seconds / 3600 + " часв ");


    }
}
