package com.coderbd.ex11;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

// This class illustrates how we can compute sum of 1..N numbers using fork/join framework.
// The range of numbers are divided into half until the range can be handled by a thread.
// Once the range summation completes, the result gets summed up together.  
/**
 *
 * @author Rajaul Islam
 */
class SumOfNUsingForkJoin {

    private static long N = 10000000000L; // one million - we want to compute sum 
    // from 1 .. one million    

    private static final int NUM_THREADS = 10;
    // number of threads to create for 
    // distributing the effort  

    // This is the recursive implementation of the algorithm; inherit from RecursiveTask 
    // instead of RecursiveAction since we're returning values. 
    static class RecursiveSumOfN extends RecursiveTask<Long> {

        long from, to;
        // from and to are range of values to sum-up 

        public RecursiveSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        // the method performs fork and join to compute the sum if the range 
        // of values can be summed by a threadremember that we want to divide 
        // the summation task equally among NUM_THREADS) then, sum the range 
        // of numbers from..to  using a simple for loop; 
        // otherwise, fork the range and join the results 
        public Long compute() {

            if ((to - from) <= N / NUM_THREADS) {
                // the range is something that can be handled 
                // by a thread, so do summation 

                long localSum = 0;
                // add in range 'from' .. 'to' inclusive of the value 'to' 
                for (long i = from; i <= to; i++) {
                    localSum += i;
                }

                System.out.printf("\tSum of value range %d to %d is %d %n",
                        from, to, localSum);
                return localSum;
            } else {
                // no, the range is too big for a thread to handle, 
                // so fork the computation
                // we find the mid-point value in the range from..to 
                long mid = (from + to) / 2;
                System.out.printf("Forking computation into two ranges: "
                        + "%d to %d and %d to %d %n", from, mid, mid, to);

                // determine the computation for first half 
                // with the range from..mid  
                RecursiveSumOfN firstHalf = new RecursiveSumOfN(from, mid);

                // now, fork off that task 
                firstHalf.fork();
                // determine the computation for second half 
                // with the range mid+1..to 
                RecursiveSumOfN secondHalf
                        = new RecursiveSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();

                // now, wait for the first half of computing sum to 
                // complete, once done, add it to the remaining part 
                return firstHalf.join() + resultSecond;
            }
        }
    }

    public static void main(String[] args) {
        // Create a fork-join pool that consists of NUM_THREADS 
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);

        // submit the computation task to the fork-join pool 
        long computedSum = pool.invoke(new RecursiveSumOfN(0, N));

        // this is the formula sum for the range 1..N 
        long formulaSum = (N * (N + 1)) / 2;

        // Compare the computed sum and the formula sum 
        System.out.printf("Sum for range 1..%d; computed sum = %d, "
                + "formula sum = %d %n", N, computedSum, formulaSum);
    }
}
