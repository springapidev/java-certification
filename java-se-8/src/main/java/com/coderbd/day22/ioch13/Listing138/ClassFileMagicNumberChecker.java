package com.coderbd.day22.ioch13.Listing138;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

// check if the passed file is a valid .class file or not. 
// note that this is an elementary version of a checker that checks if the given file 
// is a valid file that is written according to the JVM specification
// it checks only the magic number 
class ClassFileMagicNumberChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Pass a valid file name as argument");
            System.exit(-1);
        }

        String fileName = args[0];
        // create a magicNumber byte array with values for four bytes in 0xCAFEBABE 
        // you need to have an explicit down cast to byte since 
        // the hex values like 0xCA are of type int 
        byte[] magicNumber = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
        try (FileInputStream fis = new FileInputStream(fileName)) {
            // magic number is of 4 bytes � 
            // use a temporary buffer to read first four bytes 
            byte[] u4buffer = new byte[4];
            // read a buffer full (4 bytes here) of data from the file 
            if (fis.read(u4buffer) != -1) { // if read was successful  
                // the overloaded method equals for two byte arrays 
                // checks for equality of contents  
                if (Arrays.equals(magicNumber, u4buffer)) {
                    System.out.printf("The magic number for passed file %s matches that of a .class file", fileName);
                } else {
                    System.out.printf("The magic number for passed file %s does not match that of a .class file", fileName);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("file does not exist with the given file name ");
        } catch (IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        }
    }
}
