package com.coderbd.ex61.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mohamamad Rajaul Islam
 */
public class SimpleMapExample {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one", "1st");
        map.put("second", new Integer(2));
        map.put("third", "3rd");
        map.put("third", "iii");
        Set set1 = map.keySet();
        Collection collection = map.values();
        Set set2 = map.entrySet();
        System.out.println("keys-> "+set1+"\n"+" values-> "+collection+"\n"+" key Value "+set2);
    }

}
