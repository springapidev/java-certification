package com.coderbd.ex40;

/**
 * Created by Mohammad Rajaul Islam.
 */
//Step-1
public class Manager extends Employee {
    //Step-2
    private String departmentName;

    //Step-3 Constructor and super constrctor is added

    public Manager(String name, double salary, String departmentName) {
        //super constrctor is added
        super(name, salary);
        this.departmentName = departmentName;
    }


//Override getDetails

    public String getDetails() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", departmentName=" + departmentName +
                '}';
    }
}
