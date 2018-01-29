package com.coderbd.ex31;

/**
 * Created by J2EE-33 on 9/16/2017.
 */
public class Statement {
    private double balance=0.0;
    private double income=0.0;
    private double expense=0.0;

    public double addBalance(double income){
        balance += income;
        return balance;
    }
    public double doExpense(double expense){
        balance -= expense;
        return balance;
    }
}
