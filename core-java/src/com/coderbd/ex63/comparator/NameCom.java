package com.coderbd.ex63.comparator;

import java.util.Comparator;

public class NameCom implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       return (((Student)o1).getFirstName().compareTo(((Student)o2).getFirstName()));
    }
    
}
