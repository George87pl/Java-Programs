package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-1));
    }

    public static int getEvenDigitSum(int number) {
        if(number<0) return -1;
        else {
            int sume = 0;
            while(number > 1) {
                if(number % 2 == 0) sume = sume + (number % 10);
                number = number / 10;
            }
            return sume;

        }
    }

}
