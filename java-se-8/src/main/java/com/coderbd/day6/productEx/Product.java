package com.coderbd.day6.productEx;

public class Product {

    private int id;
    private String productName;
    private int qty;
    private double unitePrice;
    private double totalPrice;
    private String brandName;

    public Product() {
    }

    public Product(int id, String productName, int qty, double unitePrice, double totalPrice, String brandName) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.unitePrice = unitePrice;
        this.totalPrice = totalPrice;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(double unitePrice) {
        this.unitePrice = unitePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

}
