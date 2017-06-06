package com.adolfo.model;

/**
 * Created by Adolfo on 03/06/2017.
 */
public class Gun {

    String name;
    String originplace;
    //    String typeofgun;
    int ammunitionClip;
    double gauge;

//  Full constructor

    public Gun(String name, String originplace, int ammunitionClip, double cartridge) {
        this.name = name;
        this.originplace = originplace;
//        this.typeofgun = typeofgun;
        this.ammunitionClip = ammunitionClip;
        this.gauge = cartridge;

    }

//        Empty constructor
    public Gun() {
    }

//        Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginplace() {
        return originplace;
    }

    public void setOriginplace(String originplace) {
        this.originplace = originplace;
    }

//        public String getTypeofgun() {
//        return typeofgun;
//    }
//    public void setTypeofgun(String typeofgun) {
//        this.typeofgun = typeofgun;
//    }

    public int getAmmunitionClip() {
        return ammunitionClip;
    }

    public void setAmmunitionClip(int ammunitionClip) {
        this.ammunitionClip = ammunitionClip;
    }

    public double getCartridge() {
        return gauge;
    }

    public void setCartridge(double cartridge) {
        this.gauge = cartridge;
    }


//   Method ToString to show info´s gun

    @Override
    public String toString() {
        return "Name: '" + name + '\'' +", Origin place: '" + originplace + '\'' +
                ", Ammunition clip: " + ammunitionClip +", Gauge: " + gauge;
    }
}