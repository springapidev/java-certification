package com.coderbd.ex71.threads.ex6;

/**
 *
 * @author J2EE-33
 */
public class SimpleThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        t.sleep(20000);
        System.out.println("Thread Name: "+t.getName());
    }
}
