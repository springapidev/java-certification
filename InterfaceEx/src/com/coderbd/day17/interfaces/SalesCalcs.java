/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day17.interfaces;

/**
 *
 * @author INSTRUCTOR
 */
public interface SalesCalcs {

    public String getName();

    public double calcSalesPrice();

    public double calcCost();

    public double calcProfit();
    String ABC = "ABC";
    String reportTitle="Sales Report";

    public default void printItemReport() {
        System.out.println("--" + this.getName() + " Report--" + ABC);
        System.out.println("Sales Price: " + this.calcSalesPrice());
        System.out.println("Cost: " + this.calcCost());
        System.out.println("Profit: " + this.calcProfit());

    }

    public default void printItemReportcc() {
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("Sales Price: " + this.calcSalesPrice());
        System.out.println("Cost: " + this.calcCost());
        System.out.println("Profit: " + this.calcProfit());
    }

    public static void printItemArray(SalesCalcs[] items) {
        System.out.println(reportTitle);
        for (SalesCalcs item : items) {
            System.out.println("--" + item.getName() + " Report--");
            System.out.println("Sales Price: "
                    + item.calcSalesPrice());
            System.out.println("Cost: " + item.calcCost());
            System.out.println("Profit: " + item.calcProfit());
        }
    }
}
