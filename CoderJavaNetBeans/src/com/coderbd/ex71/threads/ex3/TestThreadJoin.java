package com.coderbd.ex71.threads.ex3;

/**
 *
 * @author J2EE-33
 */
public class TestThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        t1.start();
       

        //start second thread after waiting for 2 seconds or if it's dead
        try {
            t1.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        //start third thread only when first thread is dead
       

       t3.start();

        //let all threads finish execution before finishing main thread
       t1.join();
       t2.join();
       t3.join();

        System.out.println("All threads are dead, exiting main thread");
    }

}
