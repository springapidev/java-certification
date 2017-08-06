package com.coderbd.ex13;

public class App {


    public static void main(String[] args){
        new App().testIfA();
    }




    public void testIfA() {
      if (testIfB("True")) {
       System.out.println("True");
           } else {
       System.out.println("Not true");
     }
  }
 public Boolean testIfB(String str) {
       return Boolean.valueOf(str);
      }
}
