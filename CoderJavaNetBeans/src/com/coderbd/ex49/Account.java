package com.coderbd.ex49;

/**
 *
 * @author J2EE-33
 */
public class Account implements Balance {
    private double balance=500000.0;

    @Override
    public void deposit(double amount) {
       balance += amount;
    }

    @Override
    public void withdrew(double amount) {
       balance -= amount;
    }

    @Override
    public double checkBalance() {
     return balance;
    }


}
