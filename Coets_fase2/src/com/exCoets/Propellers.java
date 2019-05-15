package com.exCoets;

import java.util.List;

public class Propellers {
    private int power;

    //constructor
    public Propellers(int power) throws Exception {
        this.power = power;
        checkPower(power);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void checkPower(int power) throws Exception {
        if (power < 0) {
            throw new Exception("La potència màxima no pot ser negativa.");
        }
    }


}
