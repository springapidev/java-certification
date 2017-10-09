package com.coderbd.ex68.io;

import java.util.Properties;

/**
 *
 * @author J2EE-33
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties pros=System.getProperties();
        pros.list(System.out);
        
        
        //
        //String pro=System.getProperty("java.vendor");
        //System.out.println(""+pro);
        
        String p=System.getProperty("ddd", "IDB");
        System.out.println(""+p);
    }
 
}
