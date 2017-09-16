/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.ex30.amm;

/**
 *
 * @author J2EE-33
 */
public class Department {
   private String name;
   private Location location;

    public Department(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
   
   
}
