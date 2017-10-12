package com.coderbd.ex71.threads.ex6.synchronization;

public class SynchronizationEx1 {
    synchronized void printTable(int n) {//synchronized method  
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
/**
 * Synchronization in java is the capability to control the access 
 * of multiple threads to any shared resource.
Java Synchronization is better option where we
* want to allow only one thread to access the shared resource.
 If you declare any method as synchronized, it is known as synchronized method.

Synchronized method is used to lock an object for any shared resource.

When a thread invokes a synchronized method, it automatically 
* acquires the lock for that object and releases it when the thread completes its task.
*/
