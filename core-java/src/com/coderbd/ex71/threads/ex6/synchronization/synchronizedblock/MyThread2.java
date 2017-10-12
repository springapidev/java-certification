package com.coderbd.ex71.threads.ex6.synchronization.synchronizedblock;
public class MyThread2 extends Thread{

    Datas t;

    MyThread2(Datas t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
