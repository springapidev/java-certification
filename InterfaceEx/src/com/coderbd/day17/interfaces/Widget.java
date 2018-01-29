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
public class Widget implements SalesCalcs{

    private String name="Widget";
    private double salesPrice = 0;
    private double cost = 0;
    private double quantity = 0; // In pounds

    public Widget(double salesPrice, double cost,
            double quantity) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
     @Override
    public double calcSalesPrice() {
       return this.salesPrice *  this.quantity;
    }

    @Override
    public double calcCost() {
        return this.cost * this.quantity;
    }

    @Override
    public double calcProfit() {
        return this.calcSalesPrice() - this.calcCost();
    }
 public static void main(String[] args) {
        Widget rock1 = new Widget(12, 10, 50);
        SalesCalcs rock2 = new Widget(12, 10, 50);
        System.out.println("Sales Price: "
                + rock1.calcSalesPrice());
        System.out.println("Sales Price: "
                + rock2.calcSalesPrice());
    }
}
