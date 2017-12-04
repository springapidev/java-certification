package com.coderbd.day6.productEx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Instructor
 */
public class ProductService {

    public Product displaySingleProduct(int productID) {
        Product product = null;
        for (Product p : getProducts()) {
            if (p.getId() == productID) {
                product = new Product(p.getId(), p.getProductName(), p.getQty(), p.getUnitePrice(), p.getTotalPrice(), p.getBrandName());
            }
        }
        return product;
    }

//Third Method
    public void displayProductsByBrandName(String brandName) {
        for (Product p : getProducts()) {
            if (brandName.equals(p.getBrandName())) {
                System.out.println("ID:         " + p.getId()
                        + " Product Name: " + p.getProductName()
                        + " Qty:          " + p.getQty()
                        + " Unit Price:   " + p.getUnitePrice()
                        + " Total price:  " + p.getTotalPrice()
                        + " Brand          " + p.getBrandName());
            }
        }
    }

    //Second Method
    public List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Nokia 1100", 5, 1500.0, calculateTotal(5, 1500.0), "Nokia"));
        list.add(new Product(2, "Nokia 1200", 2, 1800.0, calculateTotal(2, 1800.0), "Nokia"));
        list.add(new Product(3, "Samsung J7", 3, 15000.0, calculateTotal(3, 15000.0), "Samsung"));
        list.add(new Product(4, "Nokia N70", 5, 15000.0, calculateTotal(5, 15000.0), "Nokia"));
        list.add(new Product(5, "Samsung J2", 4, 25000.0, calculateTotal(4, 25000.0), "Samsung"));

        return list;
    }
//First Method

    public double calculateTotal(int qty, double unitPrice) {
        double total = unitPrice * qty;
        return total;
    }
}
