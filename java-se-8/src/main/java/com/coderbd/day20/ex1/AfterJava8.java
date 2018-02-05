/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex1;

/**
 *
 * @author Rajail Islam
 */
public class AfterJava8 {

    public static void main(String[] args) {
        int width = 10;

        //with lambda  
        Drawable d2 = ()-> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
