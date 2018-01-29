package com.coderbd.ex64.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenrics {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("A");
         list.add("B");
     //    list.add(32);
        String s=list.get(0);
        
        System.out.println("s: "+s);
         for(String sp : list){
             System.out.println("nnn"+sp);
    }
    }
}                                                    
