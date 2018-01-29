package com.coderbd.ex49;

/**
 *
 * @author Mohamamd Rajaul
 */
public class App {

    public static void main(String[] args) {
        Account ac = new Account();
        ac.deposit(300000);
        ac.withdrew(600000);
        double presentbalance = ac.checkBalance();
        System.out.println("banace: " + presentbalance);
    }

}
