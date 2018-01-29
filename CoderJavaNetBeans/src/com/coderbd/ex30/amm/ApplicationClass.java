package com.coderbd.ex30.amm;

public class ApplicationClass {

    public static void main(String[] args) {
        Location location=new Location("B1");
        Department d=new Department("Software",location);
        
        
        Person person = new Person("urmi", 22, 25000.0, d);
        System.out.println("Name-> " + person.getName()
                + " Age-> " + person.getAge()
                + " Salary-> " + person.getSalary()
                + " Department Name-> " + person.getDepartment().getName()
        + " Location of Department-> "+person.getDepartment().getLocation().getBuildingName());
    }

}
