package com.exercici;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String rocketId;
    private List<Propeller> propellers;
    private float speed;


    //contructors
    public Rocket(String rocketId, List propellers) throws Exception {
        this.rocketId = rocketId;
        this.propellers = propellers;

        checkRocketId(rocketId);
        checkPropellers(propellers);
    }

    public Rocket(String rocketId, List propellers, float speed) {
        this.rocketId = rocketId;
        this.propellers = propellers;
        this.speed = speed;
    }


    public void checkRocketId(String rocketId) throws Exception {
        if(this.rocketId.length()!= 8){
            throw new Exception("l'Id del coet ha d'ésser de 8 caràcters");
        }
    }

    public void checkPropellers(List propellers) throws Exception {
        if(propellers.size() <= 0){
            throw new Exception("El nombre de propulsors ha d'ésser més gran que 0");
        }
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public List<Propeller> getPropellers() {
        return propellers;
    }

    public void setPropellers(List<Propeller> propellers) {
        this.propellers = propellers;
    }

    public static List<Propeller> enterPropellerToList(Propeller propeller){
        List<Propeller> propellers = new ArrayList<>();
        propellers.add(propeller);
        return propellers;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void  accRocket(){

            for (int i =0; i < propellers.size(); i++){
            if(propellers.get(i).getCurrentPower() < propellers.get(i).getMaxPower()){
                propellers.get(i).setCurrentPower(propellers.get(i).getCurrentPower() + 10);
            } else {
                propellers.get(i).setCurrentPower(propellers.get(i).getMaxPower());
            }
        }
            calculateSpeed();
    }

    public void brakeRocket(){

        for (int i =0; i < propellers.size(); i++) {
            if (propellers.get(i).getCurrentPower() > 0) {
                propellers.get(i).setCurrentPower(propellers.get(i).getCurrentPower() - 10);
            } else {
                propellers.get(i).setCurrentPower(0);
            }
        }
        calculateSpeed();
    }


    public void  calculateSpeed(){
        int acumulatedPower = 0;
        for (int i = 0; i < propellers.size(); i++){
            acumulatedPower = acumulatedPower + propellers.get(i).getCurrentPower();
        }
        speed = (float) (speed + 100 * Math.sqrt(acumulatedPower));
        setSpeed(speed);
    }

    @Override
    public String toString() {
        return rocketId  +  ": " +
                propellers.toString().replace("[", "").replace("]", "") +
                " speed: " + getSpeed();
    }

    public static void printRocketEasy(Rocket rocket){
        System.out.println(rocket.toString().replaceAll("(^\\[|\\]$)", ""));
    }

}
