/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day5.domain.jobhistory;

/**
 *
 * @author Instructor
 */
public class JobHistory {

    //id, designation, duration, companyName, jobType

    private int id;
    private String designation;
    private String duration;
    private String companyName;
    private JobType jobType;

    public JobHistory() {
    }

    public JobHistory(int id, String designation, String duration, String companyName, JobType jobType) {
        this.id = id;
        this.designation = designation;
        this.duration = duration;
        this.companyName = companyName;
        this.jobType = jobType;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDuration() {
        return duration;
    }

    public String getCompanyName() {
        return companyName;
    }

    public JobType getJobType() {
        return jobType;
    }

}
