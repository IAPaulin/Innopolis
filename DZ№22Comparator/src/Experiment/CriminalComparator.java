package Experiment;

import Experiment.Criminal;

import java.util.Comparator;

public class CriminalComparator implements Comparator<Criminal> {


    @Override
    public int compare(Criminal o1, Criminal o2) {

        int result = o1.getName().compareTo(o2.getName());
        return result;
    }
}

 class CriminalComparatorCrime implements Comparator<Criminal>{


    public int compare(Criminal o1, Criminal o2){

        if(o1.getNumberCrime()>o2.getNumberCrime())
            return 1;
        else if(o1.getNumberCrime()<o2.getNumberCrime())
            return -1;
        else
            return 0;
    }

}