package com.coderbd.day22.ioch13.Listing132;
import java.io.Console;

// simple implementation of Echo command 
class Echo {
    public static void main(String []args) {
        // get the System console object 
	Console console = System.console();
	if(console == null) {
            System.err.println("Cannot retrieve console object - are you running your application from an IDE? 					Exiting the application ... ");
	    System.exit(-1); // terminate the application 
	}
	// read a line and print it through printf  
	console.printf(console.readLine());
    }
}
