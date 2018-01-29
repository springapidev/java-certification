package com.coderbd.ex50;
/**
 *
 * @author Mohammad Rajaul Islam
 */
public interface Bicycle {
  //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);  
}
