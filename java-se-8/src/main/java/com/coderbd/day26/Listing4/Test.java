/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day26.Listing4;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author INSTRUCTOR
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("Current Locale: " + Locale.getDefault());
        ResourceBundle mybundle = ResourceBundle.getBundle("Test");

        System.out.println("Say how are you in US English: " + mybundle.getString("hi")
                + ", " + mybundle.getString("how_are_you"));

        Locale.setDefault(new Locale("bn", "BD"));

        System.out.println("Current Locale: " + Locale.getDefault());
        mybundle = ResourceBundle.getBundle("Test");
        System.out.println("Say how are you in BD Bengali language: " + mybundle.getString("hi") + ", " + mybundle.getString("how_are_you"));
        Locale defaultLocale = Locale.getDefault();
        System.out.printf("The default country code is %s and the name is %s %n",
                defaultLocale.getCountry(), defaultLocale.getDisplayCountry());

       
    }

}
