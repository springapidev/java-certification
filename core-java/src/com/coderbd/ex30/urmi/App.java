package com.coderbd.ex30.urmi;

public class App {

    public static void main(String[] args) {
        Stock stock = new Stock("urmi", 800000.0);
        System.out.println("Symbol-> " + stock.getSymbol()
                + " Price-> " + stock.getPrice()
                + " Date-> " + stock.getDate());
    }

}
