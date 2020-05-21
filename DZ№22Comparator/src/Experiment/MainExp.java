package Experiment;

import DZ.MyCollection;
import DZ.Person;
import DZ.PersonSuperComparator;
import Experiment.Criminal;
import Experiment.CriminalComparator;
import Experiment.CriminalComparatorCrime;


import java.util.ArrayList;
import java.util.Collections;

public class MainExp {

    public static void main(String[] args) {

        ArrayList<Person>  collecctionPerson = new ArrayList<>();

        System.out.println("Коллекция перед сортировкой");
        MyCollection.initCollectionPolice(collecctionPerson);
        MyCollection.showCollection(collecctionPerson);

        System.out.println();

        System.out.println("Коллекция после сортировки через Comparator (по имени и возрасту)");
        PersonSuperComparator psCom = new PersonSuperComparator();
        //collecctionPerson.sort(psCom);
        Collections.sort(collecctionPerson,psCom);
        MyCollection.showCollection(collecctionPerson);


        System.out.println();
        System.out.println();


        ArrayList<Criminal> collecMafia = new ArrayList<>();

        System.out.println("Коллекция перед сортировкой");
        MyCollection.initCollectionMafia(collecMafia);
        MyCollection.showCollection(collecMafia);

        System.out.println();

        System.out.println("Коллекция после сортировки через Comparable");
        Collections.sort(collecMafia);
        //collecMafia.sort(Experiment.Criminal::compareTo);
        MyCollection.showCollection(collecMafia);

        System.out.println();

        System.out.println("Коллекция после сортировки через Comparator (по имени)");
        CriminalComparator crimCom = new CriminalComparator();
        collecMafia.sort(crimCom);
        MyCollection.showCollection(collecMafia);

        System.out.println();

        System.out.println("Коллекция после сортировки через Comparator (по преступлениям)");
        CriminalComparatorCrime crimComCr = new CriminalComparatorCrime();
        collecMafia.sort(crimComCr);
        MyCollection.showCollection(collecMafia);





    }
}
