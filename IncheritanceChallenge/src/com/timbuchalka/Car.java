package com.timbuchalka;

public class Car extends Vehicle {

    private String name;
    private String type;
    private String wight;

    public Car(){
        this (0, "Unknow", "No idea", "Noname");
    }

    public Car(int speed, String type, String wight, String name) {
        super(1, 1, speed);
        this.type = type;
        this.wight = wight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWight() {
        return wight;
    }

    public void setWight(String wight) {
        this.wight = wight;
    }

    public void setName(String name){
        this.name = name;
    }
}
