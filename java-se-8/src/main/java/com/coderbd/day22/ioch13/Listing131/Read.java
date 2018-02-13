package com.coderbd.day22.ioch13.Listing131;
import java.io.IOException; 

class Read {
    public static void main(String []args) {
        System.out.print("Type a character: ");
	int val = 0; 
	try {
	    // the return type of read is int, but it returns a byte value! 
	    val = System.in.read(); 
	} catch(IOException ioe) {
	    System.err.println("Cannot read input " + ioe);
	    System.exit(-1); 
	}
	System.out.println("You typed: " + val); 
    }
}
