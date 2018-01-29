package com.coderbd.ex20;

import java.io.IOException;

public class App extends A {

    public void process() {//throws IOException {
        super.process();
        System.out.print("B,");
     //  throw new IOException();
    }
    public static void main(String[] args) {
        try { new App().process(); }
        catch (Exception e) { System.out.println("Exception"); }
    }
}


