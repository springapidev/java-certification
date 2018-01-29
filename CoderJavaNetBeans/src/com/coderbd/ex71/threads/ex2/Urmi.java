package com.coderbd.ex71.threads.ex2;

public class Urmi implements Runnable {
    int i;
    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Urmi: " + i++);
            if (i == 50) {
                break;
            }
          
        }
    }
}
