package com.company;

public abstract class Sport {

    private String nazwa;

    public Sport(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
