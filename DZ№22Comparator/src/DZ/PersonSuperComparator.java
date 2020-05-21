package DZ;

import DZ.Person;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        int result ;

        result = str1.compareTo(str2);

        if(result == 0){
            if(o1.getAge()>o2.getAge()){
                return 1;
            }else if(o1.getAge()<o2.getAge()){
                return -1;
            }else {
                return 0;
            }
        }

        return result;
    }
}
