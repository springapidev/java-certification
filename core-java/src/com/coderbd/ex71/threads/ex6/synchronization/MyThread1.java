package com.coderbd.ex71.threads.ex6.synchronization;

public class MyThread1 extends Thread{

    SynchronizationEx1 t;

    MyThread1(SynchronizationEx1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}
