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
public class RedPaint {
     private String name;
    private double salesPrice = 0;
    private double cost = 0;
    private double gallons = 0; // In pounds
    
    public RedPaint(double salesPrice, double cost,
            double gallons) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.gallons = gallons;
    }
}
