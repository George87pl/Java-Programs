package com.timbuchalka;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ) System.out.println("Invalid Value");
        else {
            int howMenyYears = (int) minutes / 525600;
            int howMenyDays = (int) minutes % 525600;
            howMenyDays = howMenyDays / 24 / 60;
            System.out.println(minutes + " min = " + howMenyYears + " y and " + howMenyDays + " d");
        }
    }
}
