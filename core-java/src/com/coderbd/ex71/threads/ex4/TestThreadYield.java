/**
 *
 *
 * sleep() causes the thread to definitely stop executing for a given amount of
 * time; if no other thread or process needs to be run, the CPU will be idle
 * (and probably enter a power saving mode).
 *
 * yield() basically means that the thread is not doing anything particularly
 * important and if any other threads or processes need to be run, they should.
 * Otherwise, the current thread will continue to run.
 *
 */
package com.coderbd.ex71.threads.ex4;

/**
 *
 * @author J2EE-33
 */
public class TestThreadYield implements Runnable {
    Thread t;
    TestThreadYield(String str) {
        t = new Thread(this, str);
        // this will call run() function
        t.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            // yields control to another thread every 5 iterations
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread().getName()
                        + " yielding control...");
            /* causes the currently executing thread object to temporarily 
            pause and allow other threads to execute */
            Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }
}
