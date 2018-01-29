package com.coderbd.ex52.interfaceUsagesforinheritance;
/**
 *
 * @author Mohamamd Rajaul Islam
 */
public class App {
    public static void main(String[] args) {
        Child child=new Child("Joy");      
        child.setAge(45);
        child.buy(20000000);
        child.earn(10000000);
        child.printStates();
        
        Father f=new Father("Dr.....");
        f.printStates();
      
    }
}
