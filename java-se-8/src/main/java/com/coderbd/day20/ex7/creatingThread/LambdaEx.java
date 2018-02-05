/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex7.creatingThread;

/**
 *
 * @author Rajail Islam
 */
public class LambdaEx {

    public static void main(String[] args) {

        //Thread Example without lambda  
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        //Thread Example with lambda  
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
