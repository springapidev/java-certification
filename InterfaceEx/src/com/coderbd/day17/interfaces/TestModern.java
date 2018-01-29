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
public class TestModern {

    public static void main(String[] args) {

        SalesCalcs[] itemList = new SalesCalcs[5];
        itemList[0] = new CrushedRock(12, 10, 50);
        itemList[1] = new CrushedRock(8, 6, 10);
        itemList[2] = new RedPaint(10, 8, 25);
        itemList[3] = new Widget(6, 5, 10);
        itemList[4] = new Widget(14, 12, 20);

        System.out.println("==Sales Report==");
        SalesCalcs.printItemArray(itemList);

    }
}
