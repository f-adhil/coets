package com.exCoets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        //create propeller list 1
        List<Propellers> propellers1 = new ArrayList<>();
        propellers1.add(new Propellers(10, 0));
        propellers1.add(new Propellers(30, 0));
        propellers1.add(new Propellers(80, 0));
        //create propeller list 2
        List<Propellers> propellers2 = new ArrayList<>();
        propellers2.add(new Propellers(30, 0));
        propellers2.add(new Propellers(40, 0));
        propellers2.add(new Propellers(50, 0));
        propellers2.add(new Propellers(50, 0));
        propellers2.add(new Propellers(30, 0));
        propellers2.add(new Propellers(10, 0));

        //create rockets with rocketId and propellers list.
        Rocket rocket1 = new Rocket("32WESSDS", propellers1 );
        Rocket rocket2 = new Rocket("LDSFJA32", propellers2 );

        //print rockets
        printRocketEasy(rocket1);


        rocket1.accRocket();
        printRocketEasy(rocket1);

        rocket1.accRocket();
        printRocketEasy(rocket1);

        rocket1.accRocket();
        printRocketEasy(rocket1);

        rocket1.brakeRocket();
        printRocketEasy(rocket1);

        rocket1.brakeRocket();
        printRocketEasy(rocket1);

        printRocketEasy(rocket2);

        rocket2.accRocket();
        printRocketEasy(rocket2);

        rocket2.accRocket();
        printRocketEasy(rocket2);

        rocket2.accRocket();
        printRocketEasy(rocket2);

        rocket2.accRocket();
        printRocketEasy(rocket2);

        rocket2.brakeRocket();
        printRocketEasy(rocket2);

        rocket2.brakeRocket();
        printRocketEasy(rocket2);





    }


    public static void printRocketEasy(Rocket rocket){
        System.out.println(rocket.toString().replaceAll("(^\\[|\\]$)", ""));
    }
}
