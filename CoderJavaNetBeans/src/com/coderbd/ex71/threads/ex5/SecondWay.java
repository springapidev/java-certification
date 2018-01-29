package com.coderbd.ex71.threads.ex5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class SecondWay extends Thread {

    int i = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SecondWay.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("thread started running..");
        while (true) {
            System.out.println("Result of i: " + i++);
            if (i == 10) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Thread t = new SecondWay();
        t.start();
    }
}
