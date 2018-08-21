package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone grzesTel;
        grzesTel = new DeskPhone(123456);
        grzesTel.powerOn();
        grzesTel.callPhone(123456);
        grzesTel.answer();

        System.out.println("********************");

        grzesTel = new MobilePhone(654321);
        grzesTel.powerOn();
        grzesTel.callPhone(65432);
        grzesTel.answer();
    }
}
