package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean koniec = true;
        int wynik = 10000;
        int trudnosc = 8;
        int bonus = 200;

        if(koniec){
            int maxwynik = wynik + (trudnosc * bonus);
            System.out.println("Twój wynik to " + maxwynik);
        }
    }
}
