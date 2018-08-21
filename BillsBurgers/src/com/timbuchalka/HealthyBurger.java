package com.timbuchalka;

public class HealthyBurger extends BaseBurger{

    private int ananas;
    private int fasola;

    public HealthyBurger(String breadRoll, String meat) {
        super("Healthy Burger", breadRoll, meat);
        this.ananas = 0;
        this.fasola = 0;
    }

    @Override
    public void addAdditions(String dodatek) {
        if(dodatek == "Ananas") putAnanas();
        if(dodatek == "Fasola") putFasola();
        super.addAdditions(dodatek);

    }

    public void putAnanas(){
        setAdditions();
        this.ananas += 1;
        setPrice(5);
    }

    public void putFasola(){
        setAdditions();
        this.fasola += 1;
        setPrice(4.5);
    }

    @Override
    public void getPrice() {
        System.out.println(getName());
        System.out.println("Wybrano składniki:" );
        if(ananas > 0) System.out.println("Ananas " + ananas + "x ");
        if(fasola > 0) System.out.println("Fasola " + fasola + "x ");
        super.getPrice();
    }

    public int getAnanas() {
        return ananas;
    }

    public int getFasola() {
        return fasola;
    }
}
