package com.coderbd.ex52;

/**
 *
 * @author Mohamamd Rajaul Islam
 */
public class Father {

    private String name;
    private double amountOfProperty = 50000000;

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountOfProperty() {
        return amountOfProperty;
    }

    public void setAmountOfProperty(double amountOfProperty) {
        this.amountOfProperty = amountOfProperty;
    }

    double payToChild(double amount) {
        amountOfProperty -= amount;
        return amountOfProperty;

    }

    void printStates() {
        payToChild(50000000);
        System.out.println("Name:"
                + name
                + "Amount Of Property:" + amountOfProperty);
    }

}
