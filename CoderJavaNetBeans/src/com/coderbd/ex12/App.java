package com.coderbd.ex12;

public class App extends Zoo {
    public int one=8;
    public void addFive(){
        one+=5;
        System.out.print("b ");
    }


    public static void main(String[] args){
        Zoo zoo=new App();
        zoo.addFive();
        System.out.println(zoo.one);

    }
}
