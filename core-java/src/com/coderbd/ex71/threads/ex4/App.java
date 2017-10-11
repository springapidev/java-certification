package com.coderbd.ex71.threads.ex4;
/**
 *
 * @author J2EE-33
 */
public class App {
     public static void main(String[] args) {
      new TestThreadYield("Thread 1");
      new TestThreadYield("Thread 2");
      new TestThreadYield("Thread 3");
   }
}
