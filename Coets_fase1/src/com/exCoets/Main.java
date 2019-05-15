package com.exCoets;

public class Main {

    public static void main(String[] args) throws Exception {
        Rocket rocket1 = new Rocket("32WESSDS", 3 );
        Rocket rocket2 = new Rocket("LDSFJA32", 6 );

        System.out.println("Id " + rocket1.getRocketId() + " - " + "propellers " + rocket1.getPropellers());
        System.out.println("Id " + rocket2.getRocketId() + " - " + "propellers " + rocket2.getPropellers());
    }
}
