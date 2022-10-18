package it.unibo.collections.comparators;

import java.util.Comparator;

public class NumbersComparator implements Comparator<String>{

    public int compare(String o1, String o2) {
        if (Double.valueOf(o1) > Double.valueOf(o2)) {
            return 1;
        } else  if (Double.valueOf(o1) < Double.valueOf(o2)) {
            return -1;
        }
        return 0;
    }
}