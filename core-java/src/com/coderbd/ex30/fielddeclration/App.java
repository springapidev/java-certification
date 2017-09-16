package com.coderbd.ex30.fielddeclration;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Stock stock1 = new Stock("abc", 500.0);
        Stock stock2 = new Stock("abc", 500.0);
        Stock stock3 = new Stock("abc", 500.0);
        System.out.println("Sysmbol-> " + stock1.getSymbol()
                + " Price-> " + stock1.getPrice()
                + " Date-> " + stock1.getDate());
    }

}
