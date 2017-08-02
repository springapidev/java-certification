package com.coderbd.ex1;

public class App {
    public static void main(String[] args){
System.out.print("Ok");
    }

//Wrong
 /*   public void abc1()  Exception {

            Exception();
    }*/
    //Correct
    public void abc2() throws Exception {

        new Exception();
    }
    //Correct
    public void abc3() throws Exception {

        throw new Exception();
    }

}
