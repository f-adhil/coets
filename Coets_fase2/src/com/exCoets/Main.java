package com.exCoets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Propellers> propellers1 = new ArrayList<>();
        propellers1.add(new Propellers(10));
        propellers1.add(new Propellers(30));
        propellers1.add(new Propellers(80));

        List<Propellers> propellers2 = new ArrayList<>();
        propellers2.add(new Propellers(30));
        propellers2.add(new Propellers(40));
        propellers2.add(new Propellers(50));
        propellers2.add(new Propellers(50));
        propellers2.add(new Propellers(30));
        propellers2.add(new Propellers(10));


        Rocket rocket1 = new Rocket("32WESSDS", propellers1 );
        Rocket rocket2 = new Rocket("LDSFJA32", propellers2 );

        System.out.println("Id " + rocket1.getRocketId() +
                " - " + "num. of propellers " +
                propellers1.size() +
                "maximum power of every propeller:  " + propellers1);
        System.out.println("Id " + rocket2.getRocketId() + " - " + "num. of propellers " + propellers2.size());
    }
}
