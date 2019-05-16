package com.exercici;

public class Propellers {

    private  int maxPower;
    private int currentPower;



    //constructor
    public Propellers(int maxPower, int currentPower) throws Exception {
        this.maxPower = maxPower;
        this.currentPower = currentPower;
    }


    public void checkPower(int currentPower, int maxPower) {
        if ((0 > currentPower) ) {
            System.out.println("NEGATIVE POWER!! ");
        }
        if ( (currentPower >= maxPower)){
            System.out.println("(maximum power reached: " + currentPower + "/" + maxPower + ")");
        }
    }

    public  int getMaxPower() {
        return maxPower;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
  //     checkPower(currentPower, maxPower);
    }

    @Override
    public String toString() {
        return  currentPower + "/" + maxPower ;
    }
}

