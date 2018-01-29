package com.coderbd.ex71.threads.ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloRunner implements Runnable{
int i;
    @Override
    public void run() {
       i=0;
        while (true) {            
            System.out.println("Hello: "+i++);  
            if(i==50){
                break;
            }
            try {
                    Thread.sleep(3000);
                    // break;
                } catch (InterruptedException ex) {
                    Logger.getLogger(HelloRunner.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
}
