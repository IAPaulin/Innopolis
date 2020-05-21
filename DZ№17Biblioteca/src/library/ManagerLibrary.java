package library;

import java.io.*;

public class ManagerLibrary extends Library {


    private static Library lib = new Library();

    public static void addBook(Book bk) {
        final int size = lib.getBooks().length + 1;

        Book mas[] = new Book[size];


        System.arraycopy(lib.getBooks(), 0, mas, 0, lib.getBooks().length);

        mas[size - 1] = bk;
        lib.setBooks(mas);
    }

    public static void saveLibrary() {

        try {
            FileOutputStream fos = new FileOutputStream("librari.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(lib);
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void loadingLibrary() {

        try (FileInputStream fis = new FileInputStream("librari.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            lib = (Library) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void showLibrary() {

        for (Book bk : lib.getBooks()) {
            System.out.println(bk.getName() + " " + " " + bk.getAuthor() + " " + bk.getYearPublications() + " " + bk.getPrice());
        }
    }


    public static void initBook() {

        Book bk = new Book();
        bk.setName("Metro");
        bk.setAuthor("Неизвестен");
        bk.setYearPublications((short) 2015);
        bk.setPrice((float) 269.95);
        ManagerLibrary.addBook(bk);

        bk = new Book();
        bk.setName("Анна Каренина");
        bk.setAuthor("Лев Толстой");
        bk.setYearPublications((short) 1877);
        bk.setPrice((float) 1050.8);
        ManagerLibrary.addBook(bk);

        bk = new Book();
        bk.setName("Философия Java");
        bk.setAuthor("Брюс Эккель");
        bk.setYearPublications((short) 2015);
        bk.setPrice((float) 1200);
        ManagerLibrary.addBook(bk);

    }


}
