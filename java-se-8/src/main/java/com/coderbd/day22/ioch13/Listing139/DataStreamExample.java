package com.coderbd.day22.ioch13.Listing139;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// A simple class to illustrate data streams; write constants 0 and 1 in different 
// data type values into a file and read the results back and print them 
class DataStreamExample {
    public static void main(String []args) {
        // write some data into a data file with hard-coded name "temp.data"
	try (DataOutputStream dos = 
            new DataOutputStream(new FileOutputStream("temp.data"))) {
	    // write values 1 to 10 as byte, short, int, long, float and double
	    // omitting boolean type because an int value cannot 
            // be converted to boolean 
	    for(int i = 0; i < 10; i++) {
	        dos.writeByte(i); 
		dos.writeShort(i);									dos.writeInt(i);
		dos.writeLong(i);
		dos.writeFloat(i); 
		dos.writeDouble(i); 
	    } 
	} catch(FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given file name ");
	    System.exit(-1); // don�t proceed � exit the program  
	} catch(IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
	    System.exit(-1); // don�t proceed � exit the program
	} 
        // the DataOutputStream will auto-close, so don't have to worry about it 
	// now, read the written data and print it to console 
        try (DataInputStream dis = new DataInputStream(new FileInputStream("temp.data"))) {
	    // the order of values to read is byte, short, int, long, float and 
	    // double since we've written from 0 to 10, 
            // the for loop has to run 10 times
	    for(int i = 0; i < 10; i++) {
	        // %d is for printing byte, short, int or long 
		// %f, %g, or %e is for printing float or double 
		// %n is for printing newline 
		System.out.printf("%d %d %d %d %g %g %n", 
						dis.readByte(), 
						dis.readShort(), 
						dis.readInt(), 
						dis.readLong(), 
						dis.readFloat(), 
						dis.readDouble()); 
	     } 
        } catch(FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given file name ");
	} catch(IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
	} // the DataOutputStream will auto-close, so don't have to worry about it 
    }
}
