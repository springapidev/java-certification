package com.coderbd.day5.domain;

import com.coderbd.day5.domain.address.Address;
import com.coderbd.day5.domain.bank.BankDetails;
import com.coderbd.day5.domain.edu.EducationQualifications;
import com.coderbd.day5.domain.employeedetails.EmployeeDetails;
import com.coderbd.day5.domain.jobhistory.JobHistory;
import com.coderbd.day5.domain.projects.Projects;
import com.coderbd.day5.domain.trainings.ProfessionalTrainings;
import java.util.List;

// add Department, Address , JobHistory, ProfessionalTrainings, ProjectsTillNow, BankDetails, EmployeeDetails
public class Employee {
    private int id;
    private String name;
    private String mobile;
    private List<EducationQualifications> educationQualifications;
    private Department department;
    private Address address;
    private List<JobHistory> jobHistory;
    private List<ProfessionalTrainings> professionalTrainings;
    private List<Projects> projects;
    private List<BankDetails> bankDetails;
    private EmployeeDetails employeeDetails;

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

    public Department getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    public List<JobHistory> getJobHistory() {
        return jobHistory;
    }

    public List<ProfessionalTrainings> getProfessionalTrainings() {
        return professionalTrainings;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public List<BankDetails> getBankDetails() {
        return bankDetails;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public Employee(int id, String name, String mobile, List<EducationQualifications> educationQualifications, Department department, Address address, List<JobHistory> jobHistory, List<ProfessionalTrainings> professionalTrainings, List<Projects> projects, List<BankDetails> bankDetails, EmployeeDetails employeeDetails) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.educationQualifications = educationQualifications;
        this.department = department;
        this.address = address;
        this.jobHistory = jobHistory;
        this.professionalTrainings = professionalTrainings;
        this.projects = projects;
        this.bankDetails = bankDetails;
        this.employeeDetails = employeeDetails;
    }

    public Employee() {
    }
    
}
