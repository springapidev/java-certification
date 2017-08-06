package com.coderbd.ex18;

public class App {
    public static void main(String[] args) {
       try {
           args = null;
          args[0] = "test";
          System.out.println(args[0]);
        } catch (Exception ex) {
        System.out.println("Exception");
        //If we use exception before NullPointerException, it will make errors........
     //   } catch (NullPointerException npe) {
    System.out.println("NullPointerException");
         }
    }
    }
