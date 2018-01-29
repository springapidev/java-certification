package com.coderbd.ex42;

/**
 * Created by Mohammad Rajaul Islam
 */
public class InstanceOfOperator {
    public static void main(String[] args) {
        System.out.println("Ref is Animal and Constructor is Animal ");
        Employee em=new Employee();
        doSomething(em);


    /*

        System.out.println("Ref is Animal and Constructor is Manager");
        Animal e2=new Manager();
        doSomething(e2);

        System.out.println("Ref is Animal and Constructor is Engineer");
        Animal e3=new Engineer();
        doSomething(e3);

        System.out.println("Ref is Manager and Constructor is Manager");
        Manager m=new Manager();
        doSomething(m);

        System.out.println("Ref is Engineer and Constructor is Engineer");
        Engineer eng=new Engineer();
        doSomething(eng);
        */
    }

    public static void doSomething(Employee e){
        if(e instanceof Manager){
            System.out.println("Manager");
        }else if(e instanceof Engineer){
            System.out.println("Engineer");
        }else {
            System.out.println("Animal");
        }
    }
}
