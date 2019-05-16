package com.exCoets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        //create propeller list 1
        List<Propellers> propellers1 = new ArrayList<>();
        propellers1.add(new Propellers(10));
        propellers1.add(new Propellers(30));
        propellers1.add(new Propellers(80));
        //create propeller list 2
        List<Propellers> propellers2 = new ArrayList<>();
        propellers2.add(new Propellers(30));
        propellers2.add(new Propellers(40));
        propellers2.add(new Propellers(50));
        propellers2.add(new Propellers(50));
        propellers2.add(new Propellers(30));
        propellers2.add(new Propellers(10));

        //create rockets with rocketId and propellers list.
        Rocket rocket1 = new Rocket("32WESSDS", propellers1 );
        Rocket rocket2 = new Rocket("LDSFJA32", propellers2 );

        //print rockets 
        printRocketInfo(rocket1);
        printRocketInfo(rocket2);
    }


    public static void printRocketInfo(Rocket rocket){
        String listPropPowerString = rocket.listPropPower().toString().replaceAll("(^\\[|\\]$)", "");
        System.out.println(rocket.getRocketId() + ": " + listPropPowerString);
    }
}
