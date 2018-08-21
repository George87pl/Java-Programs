package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //System.out.println(isEvenNumber(3));

        int number = 4;
        int finishnumber = 20;
        int totalNumber = 0;
        int totalNumberFound = 0;

        while (number<= finishnumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            if(totalNumberFound == 5) break;
            totalNumberFound++;
            totalNumber += number;
            System.out.println("Even number " + number);
        }

        System.out.println(totalNumberFound);

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) return true;
        else return false;
    }
}
