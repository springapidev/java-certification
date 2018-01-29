package com.coderbd.ex71.threads.ex7.lock.concurrent;

import java.util.concurrent.TimeUnit;

public class CustomLock {

    private final Object lockObject = new Object();
    private Thread lockingThread;
    private int lockCount = 0;

    public boolean lock(int timeout) {
        synchronized (lockObject) {
            if (lockingThread != null
                    && lockingThread != Thread.currentThread()) {
                try {
                    long elapsedTime = 0L;
                    long startWaitingTime;
                    while (lockingThread != null) {
                        startWaitingTime = TimeUnit.NANOSECONDS.toMillis(System
                                .nanoTime());
                        lockObject.wait(timeout);
                        elapsedTime += TimeUnit.NANOSECONDS.toMillis(System
                                .nanoTime()) - startWaitingTime;

                        if (timeout > 0 && elapsedTime > timeout) {
                            return false;
                        }
                    }
                } catch (InterruptedException e) {
                    return false;
                }
            }
            lockCount++;
            if (lockingThread == null) {
                lockingThread = Thread.currentThread();
            }
            return true;
        }
    }

    public void releaseLock() {
        synchronized (lockObject) {
            if (lockingThread != Thread.currentThread()) {
                throw new IllegalStateException(
                        "Only lock holding thread may release the lock!");
            }
            lockCount--;
            if (lockCount == 0) {
                lockingThread = null;
                lockObject.notify();
            }
        }
    }
}
