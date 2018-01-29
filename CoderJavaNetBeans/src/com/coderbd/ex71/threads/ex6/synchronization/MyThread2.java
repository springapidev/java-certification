package com.coderbd.ex71.threads.ex6.synchronization;

public class MyThread2 extends Thread{

    SynchronizationEx1 t;

    MyThread2(SynchronizationEx1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
