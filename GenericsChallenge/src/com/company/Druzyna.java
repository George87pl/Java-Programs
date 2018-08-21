package com.company;

public class Druzyna<T extends Sport> {

    private String nazwaDruzyny;
    private int punkty;

    public Druzyna(String nazwaDruzyny, int punkty) {
        this.nazwaDruzyny = nazwaDruzyny;
        this.punkty = punkty;
    }

    public String getNazwaDruzyny() {
        return nazwaDruzyny;
    }

    public int getPunkty() {
        return punkty;
    }
}
