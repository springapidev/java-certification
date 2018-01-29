package com.coderbd.ex71.threads.ex6.synchronization.annonymousclass;

public class SynchronizationTest2 {

    public static void main(String args[]) {
        final Datas obj = new Datas();//only one object  

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
