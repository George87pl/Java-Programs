package com.company;

import java.util.ArrayList;

public class Players implements ISaveable {

    private String name;
    private int lvl;
    private double damage;
    ArrayList<Players> listaGraczy = new ArrayList<Players>();

    public Players(String name, int lvl, double damage) {
        this.name = name;
        this.lvl = lvl;
        this.damage = damage;
    }

    @Override
    public ArrayList wczytaj() {
        return listaGraczy;
    }

    @Override
    public void zapisz() {
        listaGraczy.add(this);
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", damage=" + damage +
                '}';
    }
}
