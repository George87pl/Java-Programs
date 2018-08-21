package com.company;

import java.util.ArrayList;

public class TablicaRekordow<T extends Sport> {

    private ArrayList<Druzyna<T>> tabelaRekordow;

    public TablicaRekordow() {
        tabelaRekordow = new ArrayList<>();
    }

    public void dodajDoTablicy(Druzyna<T> druzyna) {
        tabelaRekordow.add(druzyna);
    }

    public void wyswietlTablice() {
        for(Druzyna<T> druzyna : tabelaRekordow) {
            System.out.println(druzyna.getNazwaDruzyny()+ ": " +druzyna.getPunkty());
        }
    }

    public void sortuj() {
        Druzyna<T> pomocnicza;
        for(int i=0; i< this.tabelaRekordow.size(); i++){
            for(int j=0; j< this.tabelaRekordow.size(); j++) {
                if(this.tabelaRekordow.get(j).getPunkty() < this.tabelaRekordow.get(i).getPunkty()){
                    pomocnicza = this.tabelaRekordow.get(j);
                    this.tabelaRekordow.set(j, this.tabelaRekordow.get(i));
                    this.tabelaRekordow.set(i, pomocnicza);
                }
            }
        }
    }
}