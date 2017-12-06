/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day7.finalKeyword;

/**
 *
 * @author Instructor
 */
public class App extends FinalAsMethodEx {

    @Override
    public void display() {
        System.out.println("Akhhh......");
    }

    public static void main(String[] args) {
        App app = new App();
        app.display();
        System.out.println("=============");
        FinalAsMethodEx app2 = new App();
        app2.display();

        System.out.println("=============");
        FinalAsMethodEx app3 = new FinalAsMethodEx();
        app3.display();
        
        
    }
    
  /* 
    we can not override this final method of FinalAsMethodEx
    @Override
     public void display2(){
        System.out.println("Boota........");
}
    */
}
