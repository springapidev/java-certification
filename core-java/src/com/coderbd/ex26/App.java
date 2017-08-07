package com.coderbd.ex26;

import com.coderbd.ex20.A;

public class App implements DeclareStuff {
 public static void main(String [] args) {
             int x = 5;
             new App().doStuff(++x);

             }
             // access can not less privilize
    // if we remove public, then complie fails
public void doStuff(int s) {
             s += EASY + ++s;
             System.out.println("s " + s);
             }

}
