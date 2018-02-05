/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex5.forEachLoop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public class LambdaEx {
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Munna");  
        list.add("Zunaid");  
        list.add("Emon");  
        list.add("Rashedul");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
        
        
    }  
}
