package com.timbuchalka;

public class Room {

    private Tv telewizor;
    private Pc komputer;
    private Wardrobe szafa;

    public Room(Tv telewizor, Pc komputer, Wardrobe szafa){

        this.telewizor = telewizor;
        this.komputer = komputer;
        this.szafa = szafa;
    }
    public void modelTelewizora() {
        System.out.println(telewizor.getModel());
    }
}


