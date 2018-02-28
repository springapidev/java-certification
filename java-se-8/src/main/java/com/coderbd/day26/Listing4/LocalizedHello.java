package com.coderbd.day26.Listing4;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {
    public static void main(String args[]) {
	Locale currentLocale = Locale.getDefault(); 
	ResourceBundle resBundle = 
ResourceBundle.getBundle("ResourceBundle", currentLocale);
	System.out.printf(resBundle.getString("Greeting")); 
    }
}

