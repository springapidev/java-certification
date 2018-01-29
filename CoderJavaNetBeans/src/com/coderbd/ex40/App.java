package com.coderbd.ex40;

/**
 * Created by J2EE-33 on 9/25/2017.
 */
public class App {
    public static void main(String[] args) {
        Manager manager=new Manager("Urmi", 20000.0, "Software");
        System.out.println(manager.getDetails());

        Employee m=new Manager("Romi", 20000.0, "Software");
        System.out.println(m.getDetails());

        Employee employee=new Employee("Fahmida", 20000.0);
        System.out.println(employee.getDetails());
    }
}
