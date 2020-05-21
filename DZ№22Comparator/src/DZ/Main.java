package DZ;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> collecctionPerson = new ArrayList<>();

        System.out.println("Коллекция перед сортировкой");
        MyCollection.initCollectionPolice(collecctionPerson);
        MyCollection.showCollection(collecctionPerson);

        System.out.println();

        System.out.println("Коллекция после сортировки через Comparator (по имени и возрасту)");
        PersonSuperComparator psCom = new PersonSuperComparator();
        //collecctionPerson.sort(psCom);
        Collections.sort(collecctionPerson, psCom);
        MyCollection.showCollection(collecctionPerson);
    }
}
