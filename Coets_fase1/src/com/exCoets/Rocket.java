package com.exCoets;

public class Rocket {
    private String rocketId;
    private int propellers;

    //contructors
    public Rocket(String rocketId, int propellers) throws Exception {
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

    public void checkPropellers(int propellers) throws Exception {
        if(this.propellers <= 0){
            throw new Exception("El nombre de propulsors ha d'ésser més gran que 0");
        }
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public int getPropellers() {
        return propellers;
    }

    public void setPropellers(int propellers) {
        this.propellers = propellers;
    }

/*    @Override
    public String toString() {
        return "rocketId='" + rocketId + '\'' +
                ", propellers=" + propellers;
    }*/
}
