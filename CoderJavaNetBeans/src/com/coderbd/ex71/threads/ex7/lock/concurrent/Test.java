package com.coderbd.ex71.threads.ex7.lock.concurrent;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        CustomLock lock = new CustomLock();
        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(lock);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].join();
        }
    }
    static class MyThread extends Thread {

        private final CustomLock lock;
        public MyThread(CustomLock lock) {
            this.lock = lock;
        }
        @Override
        public void run() {
            boolean lockAcquired = lock.lock(2000);
            if (lockAcquired) {
                System.out
                        .println("Thread " + this.getId() + ": Lock acquired");
                try {
                    System.out.println("Thread " + this.getId() + ": Working");
                } finally {
                    lock.releaseLock();
                    System.out.println("Thread " + this.getId()
                            + ": Lock released");
                }
            } else {
                throw new RuntimeException("Could not acquire lock!");
            }
        }
    }
}
