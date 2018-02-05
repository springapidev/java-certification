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
public class BeforeJava8 {

    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class  
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
