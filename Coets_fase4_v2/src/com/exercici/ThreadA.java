package com.exercici;


import java.util.ArrayList;
import java.util.List;

import static com.exercici.Rocket.printRocketEasy;

public class ThreadA implements Runnable{

    @Override
    public void run() {

        try {
            List<Propeller> propellers1 = new ArrayList<>();
            propellers1.add(new Propeller(10, 0));
            propellers1.add(new Propeller(30, 0));
            propellers1.add(new Propeller(80, 0));

            Rocket rocket1 = new Rocket("32WESSDS", propellers1 );

            synchronized (this){
                System.out.println("Hello from "
                        + Thread.currentThread().getName() );
                printRocketEasy(rocket1);
                //Accelerar tres cops rocket 1
                for (int i = 1; i < 4 ; i++) {
                    rocket1.accRocket();
                    System.out.println("Accelerating rocket " + rocket1.getRocketId() + " " +  i + " times");
                }
                printRocketEasy(rocket1);

                //Frenar 5 cops amb rocket1
                for (int i = 1; i < 6 ; i++) {
                    rocket1.brakeRocket();
                    System.out.println("Decelerating rocket " + rocket1.getRocketId() + " " +  i + " times");
                }
                printRocketEasy(rocket1);

                //Accelerar 15 cops amb rocket1
                for (int i = 1; i < 16 ; i++) {
                    rocket1.accRocket();
                    System.out.println("Accelerating rocket " + rocket1.getRocketId() + " " +  i + " times");
                }
                printRocketEasy(rocket1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
