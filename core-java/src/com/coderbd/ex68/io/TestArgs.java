package com.coderbd.ex68.io;

public class TestArgs {

    public static void main(String[] args) {
     /*   args = new String[5];
        args[0] = "zakir";
        args[1] = "Shabib";
        args[2] = "Ok";
        args[3] = "Bk";
        args[4] = "pk";
        */
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[ " + i + "] is '" + args[i] + "'");
        }
        System.getProperties();
    }

}
//Command From java TestArgs A B C "10"
