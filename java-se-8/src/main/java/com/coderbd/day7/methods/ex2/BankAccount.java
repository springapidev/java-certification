package com.coderbd.day7.methods.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Instructor
 */
public class BankAccount {

    private int id;
    private String acTitle;
    private double balance;
    private double despositAmount;
    private double withdrewAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcTitle() {
        return acTitle;
    }

    public void setAcTitle(String acTitle) {
        this.acTitle = acTitle;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDespositAmount() {
        return despositAmount;
    }

    public void setDespositAmount(double despositAmount) {
        this.despositAmount = despositAmount;
    }

    public double getWithdrewAmount() {
        return withdrewAmount;
    }

    public void setWithdrewAmount(double withdrewAmount) {
        this.withdrewAmount = withdrewAmount;
    }

//after depositing, balance will increase
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    //after withdrewing, balance will increase
    public double withdrew(double amount) {
        balance -= amount;
        return balance;
    }

    //after withdrewing, balance will increase
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setId(150000001);
        ba.setAcTitle("Mr. A");
        ba.deposit(25000);//25000
        ba.withdrew(15000);//10000
        ba.displayBalance();//10000
        ba.deposit(20000);//30000
        ba.deposit(15000);//45000
        ba.withdrew(5000);//40000
        ba.displayBalance();//40000
        displayAccountHolderDetails(ba);

        BankAccount ba2 = new BankAccount();
        ba2.setId(150000002);
        ba2.setAcTitle("Mr. B");
        ba2.deposit(50000);//50000
        ba2.withdrew(25000);//25000
        ba2.deposit(25000);//50000
        ba2.deposit(35000);//85000
        ba2.withdrew(50000);//35000
        ba2.displayBalance();//35000
        displayAccountHolderDetails(ba2);
        System.out.println("============================");

        List<BankAccount> list = new ArrayList<>();
        list.add(ba);
        list.add(ba2);
        displayAccountHoldersDetails(list);

    }

    public static void displayAccountHolderDetails(BankAccount ba) {

        System.out.println("ID: " + ba.getId()
                + " Account Title " + ba.getAcTitle()
                + " Balance: " + ba.getBalance());
    }

    public static void displayAccountHoldersDetails(List<BankAccount> bankAcoAccounts) {
        for (BankAccount b : bankAcoAccounts) {
            System.out.println("ID: " + b.getId()
                    + " Account Title " + b.getAcTitle()
                    + " Balance: " + b.getBalance());
        }
    }
}
