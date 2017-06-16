package com.adolfo.model;

import java.util.Comparator;
import java.util.regex.Pattern;

/**
 * Created by Adolfo on 03/06/2017.
 */
public class Gun {

    String name;
    String originplace;
    int ammunitionClip;
    double gauge;

//  Full constructor

    public Gun(String name, String originplace, int ammunitionClip, double cartridge) {
        this.name = name;
        this.originplace = originplace;
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

    public int getAmmunitionClip() {
        return ammunitionClip;
    }

    public void setAmmunitionClip(int ammunitionClip) {
        this.ammunitionClip = ammunitionClip;
    }

    public double getGauge() {
        return gauge;
    }

    public void setGauge(double gauge) {
        this.gauge = gauge;
    }


//   Method ToString to show info´s gun

    @Override
    public String toString() {
        return "Name: '" + name + '\'' + ", Origin place: '" + originplace + '\'' +
                ", Ammunition clip: " + ammunitionClip + ", Gauge: " + gauge;
    }


//  Trying to compare weapons by caliber

    public static Comparator<Gun> comparingbygauge = new Comparator<Gun>() {
        @Override
        public int compare(Gun a1, Gun a2) {
            return Double.compare(a1.getGauge(), a2.getGauge());
        }
    };

    public static Comparator<Gun> comparingByName = new Comparator<Gun>() {
        @Override
        public int compare(Gun a1, Gun a2) {
            return a1.getName().compareToIgnoreCase(a2.getName());
        }
    };

    public static Comparator<Gun> comparingByCountry = new Comparator<Gun>() {
        @Override
        public int compare(Gun a1, Gun a2) {
            return a1.getOriginplace().compareToIgnoreCase(a2.getOriginplace());
        }
    };

    public static Comparator<Gun> comparingByAmmoclip = new Comparator<Gun>() {
        @Override
        public int compare(Gun a1, Gun a2) {
            return a1.getAmmunitionClip() - a2.getAmmunitionClip();
        }
    };
}