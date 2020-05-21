import java.util.*;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Collections collections = new Collections();
        WorkCollections workCollections = new WorkCollections();


        collections.setSet(new HashSet<>());
        LOGGER.info("Создаем  HashSet коллекцию");
        showWorkCollection(collections, workCollections);

        System.out.println();

        collections.setSet(new TreeSet<>());
        LOGGER.info("Создаем TreeSet коллекцию");
        showWorkCollection(collections, workCollections);

        System.out.println();

        collections.setSet(new LinkedHashSet<>());
        LOGGER.info("Создаем LinkedHashSet коллекцию");
        showWorkCollection(collections, workCollections);


        // TODO разобраться  с доступом из вне
        // TODO инкапсулировать коллекцию
        /*System.out.println();
        System.out.println();

        Set<String> set ;
        set=collections.getSet();
        //set.clear();
        System.out.println(set);

        workCollections.addElementFromFile(set);
        set.add("fdfdf444");
        System.out.println(set);

        System.out.println(collections.getSet());
*/


    }

    /**
     * Данный метод добавляет элементы в коллекцию
     * затем выводит ее на экран
     * далее удаляет элементы коллекции которые выполнили условия
     * далее показывает полученную коллекцию
     *
     * @param col
     * @param wrkCol
     */

    private static void showWorkCollection(Collections col, WorkCollections wrkCol) {

        System.out.println(col.getSet());
        wrkCol.addElement(col.getSet());
        System.out.println(col.getSet());
        wrkCol.removeEvenLength(col.getSet());
        System.out.println(col.getSet());

    }


}
