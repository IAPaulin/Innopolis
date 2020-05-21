import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        Filter fil = new Filter();

        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");

        System.out.println(map.entrySet());

        System.out.println("В списке нет дубликатов по фамилии ? " + fil.isUnique(map));

        map.replace("Виктор", "Иванов");

        System.out.println(map.entrySet());

        System.out.println("В списке нет дубликатов по фамилии ? " + fil.isUnique(map));


    }
}
