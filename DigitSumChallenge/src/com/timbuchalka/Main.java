package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(123456));
    }

    public static int sumDigits(int number) {

        int suma=0;
        if(number > 10){
            while(number > 0){
                suma +=  number % 10;
                number = number / 10;
            }
            return suma;
        }
        else return -1;

    }
}
