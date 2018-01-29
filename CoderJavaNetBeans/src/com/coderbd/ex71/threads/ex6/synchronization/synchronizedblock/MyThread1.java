package com.coderbd.ex71.threads.ex6.synchronization.synchronizedblock;


public class MyThread1 extends Thread{

    Datas t;

    MyThread1(Datas t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
