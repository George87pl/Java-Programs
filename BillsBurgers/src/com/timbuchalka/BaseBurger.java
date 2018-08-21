package com.timbuchalka;

public class BaseBurger {

    private String breadRoll;
    private String meat;
    private int cheese;
    private int onion;
    private int bacon;
    private int tomato;
    private int cucumber;
    private int pepper;
    private double price;
    private String name;
    private int additions;

    public BaseBurger(String name, String breadRoll, String meat) {

        this.name = name;
        if(breadRoll != "Pszenna" && name == "Standardowy") {
            System.out.println("Standardowy zestaw ma tylko bułkę przenną");
            this.breadRoll = "Pszenna";
        }

        this.meat = meat;
        this.price = 7;
        this.cheese = 0;
        this.onion = 0;
        this.bacon = 0;
        this.tomato = 0;
        this.cucumber = 0;
        this.additions = 0;
    }

    public void setBreadRoll(String bula){
        if(breadRoll != "Pszenna") System.out.println("Standardowy zestaw ma tylko bułkę przenną");
    }

    public void setAdditions() {
        this.additions += 1;
    }

    public void setPrice(double price) {
        this.price += price;
    }

    public void putCheese() {
        this.cheese += 1 ;
        this.price += 3;
        this.additions += 1;
    }

    public void putOnin() {
        this.onion += 1;
        this.price += 1.5;
        this.additions += 1;
    }

    public void putBacon() {
        this.bacon += 1;
        this.price += 4;
        this.additions += 1;
    }

    public void putTomato() {
        this.tomato += 1;
        this.price += 2.5;
        this.additions += 1;
    }

    public void putCucumber() {
        this.cucumber += 1;
        this.price += 1.7;
        this.additions += 1;
    }

    public void putPepper(){
        this.pepper += 1;
        this.price += 3;
        this.additions += 1;
    }

    public void addAdditions(String dodatek) {
        if(additions > 4) System.out.println("Nie można dodać więcej składników");
        else{
            if(dodatek == "Ser") putCheese();
            if(dodatek == "Cebula") putOnin();
            if(dodatek == "Bekon") putBacon();
            if(dodatek == "Ogórek") putCucumber();
            if(dodatek == "Pomidor") putTomato();
            if(dodatek == "Papryka") putPepper();
        }


    }

    public String getName() {
        return name;
    }

    public void getPrice(){
        if(name == "Standardowy") System.out.println("Nazwa burgerka: " + name);
        if(additions > 0 && additions < 4) System.out.println("Wybrano składniki:" );
        if(cheese > 0) System.out.println("Ser " + cheese + "x ");
        if(onion > 0) System.out.println("Cebula " + onion + "x ");
        if(bacon > 0) System.out.println("Bekon " + bacon + "x ");
        if(tomato > 0) System.out.println("Pomidor " + tomato + "x ");
        if(cucumber > 0) System.out.println("Ogórek " + cucumber + "x ");
        if(pepper > 0) System.out.println("Papryka " + pepper + "x ");
        System.out.println("CENA: " + price);
    }

    public int getCheese() {
        return cheese;
    }

    public int getOnion() {
        return onion;
    }

    public int getBacon() {
        return bacon;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCucumber() {
        return cucumber;
    }

    public int getPepper() {
        return pepper;
    }
}