/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.ex30.datatype;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */

public class SystemInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for A: ");
        int a = sc.nextInt();
        System.out.println("Enter value for B: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Result-> " + c);
    }
}
