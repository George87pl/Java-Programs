package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        byte myByte=10;
        short myShort=100;
        int myInt=1000;
        long myLong=50000 + 10*(myByte+myShort+myInt);
        System.out.println("Liczba to:"+myLong);

    }
}