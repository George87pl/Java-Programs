package com.timbuchalka;

public class Contacts {

    private String name;
    private int foneNumber;

    public Contacts(String name, int foneNumber){
        this.name = name;
        this.foneNumber = foneNumber;
    }
    private String getName(){
        return name;
    }
    private int getFoneNumer(){
        return foneNumber;
    }

    public String getContact(){
        return getName() + " - " +getFoneNumer();
    }
}
