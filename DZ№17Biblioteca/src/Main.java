import library.Book;
import library.ManagerLibrary;

import java.util.Scanner;

public class Main {

    //private static Library lib;

    public static void main(String[] args) {

        ManagerLibrary.initBook();
        ManagerLibrary.saveLibrary();


        ManagerLibrary.loadingLibrary();
        addBook();
        ManagerLibrary.showLibrary();

    }

    private static void addBook() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            String answer;
            // ManagerLibrary.loadingLibrary();  //если добовлять эту строчку,сохранение новой книги
            // не происходит, когда выбираем N  в сохранение (строка 55 , в else)передается старая lib без дополнения
            // это связано с потоками ?
            System.out.println("Хотите добавить книгу в библиотеку Y/N");
            answer = scan.nextLine();
            answer = answer.toUpperCase();

            if (answer.equals("Y")) {
                Book bk = new Book();

                System.out.println("Введите название книги");
                bk.setName(scan.nextLine());

                System.out.println("Введите автора ");
                bk.setAuthor(scan.nextLine());

                System.out.println("Введите год издания");
                bk.setYearPublications(scan.nextShort());

                System.out.println("Введите стоимость книги");
                bk.setPrice(scan.nextFloat());

                ManagerLibrary.addBook(bk);

            } else {
                ManagerLibrary.saveLibrary();
                break;
            }
        }
    }


}
