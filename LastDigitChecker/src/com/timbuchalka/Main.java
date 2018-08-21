package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int first, int secont, int three){
        if(first < 10 || first > 1000 || secont < 10 || secont > 1000 || three < 10 || three > 1000) return false;
        else if (first % 10 == secont % 10 || first % 10 == three % 10 || secont % 10 == three % 10) return true;
        else return false;
    }
}
