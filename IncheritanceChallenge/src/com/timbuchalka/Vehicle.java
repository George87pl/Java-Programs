package com.timbuchalka;

public class Vehicle {

    private int handSteering;
    private int changingGear;
    private int speed;

    public Vehicle(){
        this (0,0,0);
    }

    public Vehicle(int handSteering, int changingGear, int speed){
        this.handSteering = handSteering;
        this.changingGear = changingGear;
        this.speed = speed;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public int getChangingGear() {
        return changingGear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHandSteering(int handSteering) {
        this.handSteering = handSteering;
    }

    public void setChangingGear(int changingGear) {
        this.changingGear = changingGear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
