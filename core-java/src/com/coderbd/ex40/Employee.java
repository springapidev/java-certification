package com.coderbd.ex40;

/**
 * Created by Mohammad Rajaul Islam
 */
//Step-1
public class Employee {
    //Step-2
    public String name;
    public double salary;

    //Step-3 Constructor

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //Step-4 Getters

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
