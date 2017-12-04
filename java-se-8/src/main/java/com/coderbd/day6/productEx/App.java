/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day6.productEx;

/**
 *
 * @author Instructor
 */
public class App {
    public static void main(String[] args) {
        //new ProductService().displayProductsByBrandName("Samsung");
        ProductService ps=new ProductService();
        
        Product p=ps.displaySingleProduct(4);
        if(p != null){
         System.out.println("ID:         " + p.getId()
                        + " Product Name: " + p.getProductName()
                        + " Qty:          " + p.getQty()
                        + " Unit Price:   " + p.getUnitePrice()
                        + " Total price:  " + p.getTotalPrice()
                        + " Brand          " + p.getBrandName());
    }else{
            System.out.println("Invalid"); 
       }
    }
    
}
