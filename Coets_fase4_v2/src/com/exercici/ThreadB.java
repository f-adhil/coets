package com.exercici;

import java.util.ArrayList;
import java.util.List;

import static com.exercici.Rocket.printRocketEasy;

public class ThreadB implements Runnable{

    @Override
    public void run() {

        try {
            List<Propeller> propellers2 = new ArrayList<>();
            propellers2.add(new Propeller(30, 0));
            propellers2.add(new Propeller(40, 0));
            propellers2.add(new Propeller(50, 0));
            propellers2.add(new Propeller(50, 0));
            propellers2.add(new Propeller(30, 0));
            propellers2.add(new Propeller(10, 0));

            Rocket rocket2 = new Rocket("LDSFJA32", propellers2 );

            synchronized (this){
                System.out.println("Hello from "
                        + Thread.currentThread().getName() );
                printRocketEasy(rocket2);

                //Accelerar tres cops rocket 2
                for (int i = 1; i < 4 ; i++) {
                    rocket2.accRocket();
                    System.out.println("Accelerating rocket " + rocket2.getRocketId() + " " +  i + " times");
                }
                printRocketEasy(rocket2);

                //Accelerar 7 cops rocket 2
                for (int i = 1; i < 8 ; i++) {
                    rocket2.accRocket();
                    System.out.println("Accelerating rocket " + rocket2.getRocketId() + " " +  i + " times");
                }
                printRocketEasy(rocket2);

                //Accelerar 15 cops rocket 2
                for (int i = 1; i < 16 ; i++) {
                    rocket2.accRocket();
                    System.out.println("Accelerating rocket " + rocket2.getRocketId() + " " +  i + " times");
                }
                printRocketEasy(rocket2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
