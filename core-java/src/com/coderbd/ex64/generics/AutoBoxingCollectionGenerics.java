package com.coderbd.ex64.generics;

import java.util.ArrayList;

public class AutoBoxingCollectionGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(0, 5);
        list.add(1, 4);
        list.add(2,10);
     
        int ip=list.get(2);
        System.out.println("IP-> "+ip);
    }
 
}
