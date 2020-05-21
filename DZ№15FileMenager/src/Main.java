import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.setErr(System.out);
        Scanner scan = new Scanner(System.in);

        String comand;
        String name;

        File dir = new File("WORK/unit0");
        dir.mkdirs();
        dir = new File("WORK/unit1");
        dir.mkdirs();

        File file;

        help();

        System.out.println("Введите команду ");
        comand = scan.nextLine().toLowerCase().trim();

        while (!("exit".equals(comand))) {

            switch (comand) {
                case "cf":
                    System.out.println("введите имя файла ");
                    name = scan.nextLine();
                    file = new File("WORK/unit0/" + name);
                    try {
                        file.createNewFile();
                        System.out.println(file.getCanonicalPath());
                    } catch (IOException ex) {
                        System.out.println("Видимо что то пошло не так при создании файла");
                        ex.printStackTrace();
                    }
                    break;

                case "cd":
                    System.out.println("введите имя файла");
                    name = scan.nextLine();
                    dir = new File("WORK/" + name);
                    dir.mkdirs();
                    break;


                case "rn":
                    System.out.println("Введие имя файла который хотите переименовать");
                    name = scan.nextLine();
                    file = new File("WORK/unit0/" + name);
                    if (file.exists()) {
                        System.out.println("введите новое  имя файла ");
                        name = scan.nextLine();
                        File newfile = new File("WORK/unit0/" + name);
                        file.renameTo(newfile);
                    } else {
                        System.out.println("Файл не найден");
                    }
                    break;

                case "c":
                    try {
                        System.out.println("Введие имя файла который хотите скопировать");
                        name = scan.nextLine();
                        file = new File("WORK/unit0/" + name);
                        Path path = file.toPath();
                        Path newpath = Paths.get("WORK", "unit1", name + " - копия");
                        Files.copy(path, newpath);
                    } catch (IOException ex) {
                        System.out.println("Копия файла уже существует");
                        //System.out.println(newpath.getParent());    вопрос
                        ex.printStackTrace();
                    }
                    break;

                case "d":
                    System.out.println("Введие имя файла который хотите удалить");
                    name = scan.nextLine();
                    file = new File(name);

                    if (file.exists()) {
                        file.delete();
                        System.out.println("Файл удален");
                    } else {
                        System.out.println("Нет такого файла");
                    }
                    break;

            }
            System.out.println("Введите команду ");
            comand = scan.nextLine().toLowerCase().trim();
        }
    }

    private static void help() {
        System.out.println("Введите команду для выполнения");
        System.out.println("cf - для создания файла");
        System.out.println("cd - для создания директории");
        System.out.println("rn - для переиминования файла");
        System.out.println("с - для копирования файла");
        System.out.println("d - для удаления файла");
        System.out.println("exit - для завершения работы");
    }
}
