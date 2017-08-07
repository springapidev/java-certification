package com.coderbd.ex21;

public class SalesPerson extends Person {
    public double commission;
    public SalesPerson(String name, double salary,double commission) {
        super(name, salary);
        this.commission=commission;
    }

    public static void main(String[] args){
        SalesPerson salesPerson=new SalesPerson("Reza",5000, 200);
        System.out.println("Name-> "+salesPerson.name+" Salary-> "+salesPerson.salary+" Commission-> "+salesPerson.commission);
    }
}
