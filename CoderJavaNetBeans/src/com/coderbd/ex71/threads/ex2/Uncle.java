package com.coderbd.ex71.threads.ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Uncle implements Runnable {

    int i;

    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Uncle: " + i++);
            if (i == 50) {
                break;
            }
            try {
            
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Uncle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
