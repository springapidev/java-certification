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
public class TestBackDated {

    public static void main(String[] args) {
        SalesCalcs[] itemList = new SalesCalcs[5];
        ItemReport report = new ItemReport();
        itemList[0] = new CrushedRock(12.0, 10.0, 50.0);
        itemList[1] = new CrushedRock(8.0, 6.0, 10.0);
        itemList[2] = new RedPaint(10.0, 8.0, 25.0);
        itemList[3] = new Widget(6.0, 5.0, 10);
        itemList[4] = new Widget(14.0, 12.0, 20);
        System.out.println("==Sales Report==");
        for (SalesCalcs item : itemList) {
            report.printItemData(item);
        }
    }
}
