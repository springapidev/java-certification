package com.coderbd.ex4;
/**
 * 
 * @author Rajaul Islam
 */
// Balls class has a globally accessible data member to hold the number of balls thrown 
class Balls {
    public static long balls = 0;
}

// Runs class has a globally accessible data member to hold the number of runs scored 
class Runs {
    public static long runs = 0;
}

// Counter class has two methods � IncrementBallAfterRun and IncrementRunAfterBall. 
// For demonstrating deadlock, we call these two methods in the run method, so that 
// locking can be requested in opposite order in these two methods 
class Counter implements Runnable {
    // this method increments runs variable first and then increments the balls variable
    // since these variables are accessible from other threads, 
    // we need to acquire a lock before processing them 
    public void IncrementBallAfterRun() {
	// since we�re updating runs variable first, first lock the Runs.class 
	synchronized(Runs.class) {
	    // lock on Balls.class before updating balls variable 
            synchronized(Balls.class) {
                Runs.runs++;
                Balls.balls++;
	    }
	}
    }

    public void IncrementRunAfterBall() {
	// since we�re updating balls variable first; so first lock Balls.class 
	synchronized(Balls.class) {
     // acquire lock on Runs.class before updating runs variable 
     synchronized(Runs.class) {
                 Balls.balls++;
                 Runs.runs++;
	    }
	}
    }

    @Override
    public void run() {
	// call these two methods which acquire locks in different order
	// depending on thread scheduling and the order of lock acquision, 
	// a deadlock may or may not arise 
	IncrementBallAfterRun();
	IncrementRunAfterBall();
    }
}

public class DeadLock {
    public static void main(String args[]) throws InterruptedException {
	Counter c = new Counter();
	// create two threads and start them at the same time 	
	Thread t1 = new Thread(c);
	Thread t2 = new Thread(c);
	t1.start();
	t2.start();
	System.out.println("Waiting for threads to complete execution�"); 
	t1.join(); 
	t2.join(); 
	System.out.println("Done."); 
    }
}


