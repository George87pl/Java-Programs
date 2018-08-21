package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        if(isCatPlaying(false, 35)) System.out.println("Kot się bawi");
        else System.out.println("Kot się nie bawi");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(!summer && (temperature >= 25 && temperature <= 35)) return true;
        else if (summer && (temperature >= 35 && temperature <= 45)) return true;
        else return false;
    }
}
