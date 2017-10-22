package com.coderbd.ex52.interfaceUsagesforinheritance;

/**
 *
 * @author Mohamamd Rajaul Islam
 */
public class Child extends Father implements FatherInterface{
    
    private int age;
    private double amountOfProperty = getAmountOfProperty();

    public Child(String name) {
        super(name);
    }

    public Child(int age, String name) {
        super(name);
        this.age = age;
    }

    
    @Override
    public void buy(double amount) {
        amountOfProperty -= amount;
    }

    @Override
    public void earn(double amount) {
        amountOfProperty += amount;
    }

    @Override
    void printStates() {
        System.out.println("Name:"
                + getName() + " Age:"
                + age
                + " Amount Of Property:" + amountOfProperty);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
