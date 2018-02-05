/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public class LambdaEx {
// Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, filter and fetch data. Following are some lambda and collection examples provided.
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        //Adding Products  
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression  
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}
