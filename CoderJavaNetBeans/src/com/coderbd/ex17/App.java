package com.coderbd.ex17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static Iterator reverse(List list) {
       Collections.reverse(list);
       return list.iterator();
      }
public static void main(String[] args) {
      List list = new ArrayList();
      list.add("1"); list.add("2"); list.add("3");
      // Remove bellow Comments before checking
       /* for (Object obj: reverse(list))
          System.out.print(obj + ", ");*/
       }
/**
 * Above code will produce result compilation fail
 */

    /**
     * Okay Code
     *     public static Iterator reverse(List list) {
     Collections.reverse(list);
     return list.iterator();
     }
     public static void main(String[] args) {
     List list = new ArrayList();
     list.add("1"); list.add("2"); list.add("3");
     for (Iterator it = reverse(list); it.hasNext(); ) {
     Object obj = it.next();
     System.out.print(obj + ", ");
     }
     }
     */
}
