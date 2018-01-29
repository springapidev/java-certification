package com.coderbd.ex71.threads.ex2;

import java.lang.Thread.State;

public class App {

    public static void main(String[] args) {
        Uncle uncle = new Uncle();
        Thread uncleThread = new Thread(uncle);
        uncleThread.setName("Mr. Jamil");
        uncleThread.setPriority(1);
        uncleThread.start();
        Urmi u = new Urmi();
        Thread urmiThread = new Thread(u);
        urmiThread.setName("Urmi");
        urmiThread.setPriority(10);
        urmiThread.start();
        System.out.println("uncleThread Name " + uncleThread.getName());
        System.out.println("urmiThread name " + urmiThread.getName());
        System.out.println("uncleThread Priority " + uncleThread.getPriority());
        System.out.println("urmiThread Priority " + urmiThread.getPriority());
    }

}
