package com.coderbd.ex71.threads.ex1;

public class ThreadTest {

    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        
        Thread t1 = new Thread(r);
        t1.setPriority(10);
        t1.start(); 
        Thread t2 = new Thread(r);
        t2.start(); 
        
        
        System.out.println("t1 Pririty "+t1.getPriority());
         System.out.println("t2 Pririty "+t2.getPriority());
          System.out.println("t1 Name "+t1.getName());
         System.out.println("t2 Name "+t2.getName());
        
    }   
    
}
