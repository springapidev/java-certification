package com.coderbd.day4.classOrObject.ex3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100, "Mr A", "a@gmail.com", 25000.0, new Department(1, "Software")));
        employees.add(new Employee(101, "Mr B", "b@gmail.com", 28000.0, new Department(2, "Admin")));
        employees.add(new Employee(102, "Mr C", "c@gmail.com", 35000.0, new Department(1, "Software")));
    for(Employee employee : employees){
        if(employee.getDepartment().getDepartmentName().equals("Software")){
        System.out.println("ID: "+employee.getId()
        +" Name: "+employee.getName()
        +" Email: "+employee.getEmail()
        +" Salary: "+employee.getSalary()
        +" Dep ID: "+employee.getDepartment().getId()
        +" Dep Name: "+employee.getDepartment().getDepartmentName());
    }
    }
    
    }
}
