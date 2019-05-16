package com.exCoets;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String rocketId;
    private List<Propellers> propellers;

    //contructors
    public Rocket(String rocketId, List propellers) throws Exception {
        this.rocketId = rocketId;
        this.propellers = propellers;

        checkRocketId(rocketId);
        checkPropellers(propellers);
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

    public List<Propellers> getPropellers() {
        return propellers;
    }

    public void setPropellers(List<Propellers> propellers) {
        this.propellers = propellers;
    }

//method to obtain a list that contains all the power values for a rocket.
    public List<Integer> listPropPower(){
        List<Integer> propPowers = new ArrayList<>();
        for (int i=0; i < propellers.size(); i++)
            propPowers.add(propellers.get(i).getPower());
        return propPowers;
    }
}
