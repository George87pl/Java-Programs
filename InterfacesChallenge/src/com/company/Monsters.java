package com.company;

import java.util.ArrayList;

public class Monsters implements ISaveable {

    private String name;
    private int lvl;
    private double damage;
    boolean macki;

    ArrayList<Monsters> listaPotworow = new ArrayList<Monsters>();

    public Monsters(String name, int lvl, double damage, boolean macki) {
        this.name = name;
        this.lvl = lvl;
        this.damage = damage;
        this.macki = macki;
    }

    @Override
    public ArrayList wczytaj() {
        return listaPotworow;
    }

    @Override
    public void zapisz() {
        listaPotworow.add(this);
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", damage=" + damage +
                ", macki=" + macki +
                '}';
    }
}
