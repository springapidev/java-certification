package com.coderbd.ex8;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Rajaul Islam
 */
public class COWList {

    public static void main(String[] args) {
        List<String> aList = new CopyOnWriteArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");

        Iterator listIter = aList.iterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
            aList.add("four");
          
        }
    }
}
