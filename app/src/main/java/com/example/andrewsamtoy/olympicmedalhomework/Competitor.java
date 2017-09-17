package com.example.andrewsamtoy.olympicmedalhomework;

/**
 * Created by andrewsamtoy on 9/17/17.
 */

public abstract class Competitor {
    private String country;
    public double metric;
    public String name;



    public String getName(){
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getMetric() {
        return metric;
    }
}
