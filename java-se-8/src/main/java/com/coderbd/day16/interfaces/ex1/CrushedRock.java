/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day16.interfaces.ex1;

/**
 *
 * @author INSTRUCTOR
 */
public class CrushedRock implements SalesCalcs {

    private String name;
    private double salesPrice = 0;
    private double cost = 0;
    private double weight = 0; // In pounds

    public CrushedRock(double salesPrice, double cost,
            double weight) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calcSalesPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcCost() {
        return this.cost * this.weight;
    }

    @Override
    public double calcProfit() {
        return this.calcSalesPrice() - this.calcCost();
    }

    public static void main(String[] args) {
        CrushedRock rock1 = new CrushedRock(12, 10, 50);
        SalesCalcs rock2 = new CrushedRock(12, 10, 50);
        System.out.println("Sales Price: "
                + rock1.calcSalesPrice());
        System.out.println("Sales Price: "
                + rock2.calcSalesPrice());
    }

}
