/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day5.domain.employeedetails;

/**
 *
 * @author rupok
 */
public class EmployeeDetails {
    
    //id, hobby, bloodGroup, nationality, religion
    private int id;
    private String hobby;
    private BloodGroup bloodgroup;
    private Nationality nationality;
    private Religion religion;

    public int getId() {
        return id;
    }

    public String getHobby() {
        return hobby;
    }

    public BloodGroup getBloodgroup() {
        return bloodgroup;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Religion getReligion() {
        return religion;
    }

    public EmployeeDetails(int id, String hobby, BloodGroup bloodgroup, Nationality nationality, Religion religion) {
        this.id = id;
        this.hobby = hobby;
        this.bloodgroup = bloodgroup;
        this.nationality = nationality;
        this.religion = religion;
    }

    public EmployeeDetails() {
    }
    
}
