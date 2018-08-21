package com.timbuchalka;

public class Tv {

    private String model;
    private double dimension;
    private boolean color;

    public Tv(String model, double dimension, boolean color){

        this.model = model;
        this.dimension = dimension;
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    public double getDimension(){
        return dimension;
    }

    public boolean isColor() {
        return color;
    }
}
