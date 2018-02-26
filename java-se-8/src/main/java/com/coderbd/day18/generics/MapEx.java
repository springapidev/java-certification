/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day18.generics;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author INSTRUCTOR
 */
public class MapEx {

    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H001", "Duke Hat");
        partList.put("A000", "BD Short");
        partList.put("S002", "Black T-Shirt"); // Overwrite value
        Set<String> keys = partList.keySet();

        System.out.println("=== Part List ===");
        for (String key : keys) {
            System.out.println("Rasidul Part#: " + key + " "
                    + partList.get(key));
        }
       
    Set<String> keysets=partList.keySet();
    System.out.println("=== Part List 2 ===");
        for (String keyset : keysets) {
            System.out.println("Part#: " + keyset + " "
                    + partList.get(keyset));
        }
        
        //only values......
        Collection vals= partList.values();
        for (Object val : vals) {
            System.out.println("Values#: " + val + " ");
                   
        }
    }
}
