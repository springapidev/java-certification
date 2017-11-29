package com.coderbd.day5.domain;

import com.coderbd.day5.domain.edu.EducationQualifications;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String mobile;
    private List<EducationQualifications> educationQualifications;
    // add others here when you are at home
    public Employee() {
    }

    public Employee(int id, String name, String mobile, List<EducationQualifications> educationQualifications) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.educationQualifications = educationQualifications;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public List<EducationQualifications> getEducationQualifications() {
        return educationQualifications;
    }

  
    
}
