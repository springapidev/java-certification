package com.coderbd.ex15;
import java.util.concurrent.ForkJoinPool;
/**
 * 
 * @author Rajaul Islam
 */
public class Parallelism {
    public static void main(String []args) {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
        System.out.println(ForkJoinPool.commonPool().getParallelism());
    }
}


