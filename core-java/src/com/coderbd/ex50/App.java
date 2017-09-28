package com.coderbd.ex50;


public class App {

    public static void main(String[] args) {
        ACMEBicycle abycle = new ACMEBicycle();
        abycle.changeCadence(50);
        abycle.changeGear(3);
        abycle.speedUp(50);
        abycle.applyBrakes(2);
        abycle.printStates();
        
        abycle.changeCadence(150);
        abycle.changeGear(6);
        abycle.speedUp(120);
        abycle.applyBrakes(3);
        abycle.printStates();
    }

}
