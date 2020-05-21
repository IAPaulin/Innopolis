package DZ;

import org.apache.log4j.Logger;
import Experiment.Criminal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;


public class MyCollection {

    private static final Logger LOG = Logger.getLogger(MyCollection.class.getName());


    public static void initCollectionPolice(ArrayList col){

        LOG.info("Город в безопсности, детективы трудоустроены");

        Person ps1 = new Person("Holms", (short) 52);
        Person ps2 = new Person("Puaro", (short) 32);
        Person ps3 = new Person("Marpl", (short) 29);
        Person ps4 = new Person("Fandorin", (short) 27);
        col.add(ps1);
        col.add(ps2);
        col.add(ps3);
        col.add(ps4);
        col.add(new Person("Marpl", (short)32));
        col.add(new Person("Marpl", (short)32));
        col.add(new Person("Chekist", (short)82));
        col.add(new Person("Puaro", (short)35));

    }

    public static void showCollection(ArrayList col ){

        LOG.info("Штат сотрудников");

        Object ob;

        Iterator<Objects> iter = col.iterator();

        while(iter.hasNext()){
            ob = iter.next();
            System.out.println(ob);
            LOG.info(ob) ;


        }
    }


    public static void initCollectionMafia(ArrayList col){

        LOG.warn("Образование преступного синдиката, город в опасности");

        col.add(new Criminal("Moriarti",(short)45,998));
        col.add(new Criminal("Moriarti",(short)44,8));
        col.add(new Criminal("Korleone",(short)57,72));
        col.add(new Criminal("Jan-Batist",(short)26,131));

    }

}
