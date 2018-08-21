package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number<0) return -1;
        else{
            int lastDigit = number % 10;

            while(number>=10){
                number = number / 10;
            }

            return lastDigit+number;

        }
    }
}
