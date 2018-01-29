package com.coderbd.ex29;

public class MoneyJar {

    // fields

    private String purpose;
    private double amount=100.0;
    private double target=10.0;
    private double surplus=20.0;

    public void abcTest( Object o){
        System.out.println("Result-> "+o);
    }
    
    public Object displayAbc( Object o){
    return o;
    }
    
    
         
    public void add(double sum) {
        amount = amount + sum;
        surplus = amount - target;
        System.out.print(amount+" : "+surplus);
    }

    int a = 10;//sweet

// String b="10";//sugar
    public int getIntValue(String b) {
        // Here c is local
        int c;
        c = Integer.parseInt(b);

        return c;
    }

    public int getIntValue2(String b) {
        // Here c is local
        int c = Integer.parseInt(b);
        return c;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        this.surplus = surplus;
    }

}
