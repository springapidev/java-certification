package com.coderbd.day5.domain.employeedetails;

/**
 *
 * @author rupok
 */
public class BloodGroup {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BloodGroup(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BloodGroup() {
    }

}
