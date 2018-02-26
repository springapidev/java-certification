package com.coderbd.ex10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
/**
 * 
 * @author Rajaul Islam
 */
// Factorial implements Callable so that it can be passed to a ExecutorService 
// and get executed as a task. 
class Factorial implements Callable<Long> {
    long n;
    public Factorial(long n) {
        this.n = n;
    }
    public Long call() throws Exception {
        if(n <= 0) {
            throw new Exception("for finding factorial, N should be > 0");
        }
        long fact = 1;
        for(long longVal = 1; longVal <= n; longVal++) {
            fact *= longVal;
        }
        return fact;
    }
}

// Illustrates how Callable, Executors, ExecutorService, and Future are related; 
// also shows how they work together to execute a task 
class CallableTest {
    public static void main(String []args) throws Exception {
        // the value for which we want to find the factorial 
        long N = 5;
        // get a callable task to be submitted to the executor service 
        Callable<Long> task = new Factorial(N);
        // create an ExecutorService with a fixed thread pool having one thread
        ExecutorService es = Executors.newSingleThreadExecutor();
        // submit the task to the executor service and store the Future object 
        Future<Long> future = es.submit(task);
        // wait for the get() method that blocks until the computation is complete. 
        System.out.printf("factorial of %d is %d", N, future.get());
        // done. shutdown the executor service since we don't need it anymore 
        es.shutdown();
    }
}
