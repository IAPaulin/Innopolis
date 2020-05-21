import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class WorkCollections {


    private final Logger LOG = Logger.getLogger(WorkCollections.class.getName());


    /**
     * Удаляет элементы коллекции если элементы удовлетворяют условию
     *
     * @param set
     * @return
     */

    public Set<String> removeEvenLength(Set<String> set) {

        Iterator<String> iter = set.iterator();
        String str;

        while (iter.hasNext()) {
            str = iter.next();
            if ((str.length()) % 2 == 0) {
                iter.remove();
                LOG.info("Элемент удален");
            }
        }

        return set;
    }

    /**
     * Добавляет элементы в коллекцию
     *
     * @param set
     * @return
     */

    public Set<String> addElement(Set<String> set) {

        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");


        LOG.info("В коллекцию были добавлены элементы");
        for (String str : set) {
            LOG.info(str);
        }

        return set;
    }


    /**
     * Добавляет элементы в коллекцию из файла
     *
     * @param set
     * @return
     */
    public Set<String> addElementFromFile(Set<String> set) {

        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String str;
            LOG.info("Из файла в коллекцию были добавлены элементы ");
            while (br.ready()) {
                str = br.readLine();
                String mass[] = str.split(",");
                for (String s : mass) {
                    set.add(s);
                    LOG.info(s);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return set;
    }
}
