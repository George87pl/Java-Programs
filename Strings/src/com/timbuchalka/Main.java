package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String myString = "To mój tekst";
        System.out.println(myString);
        myString = myString + ", a tu jest więcej.";
        System.out.println(myString);
        myString = myString + " \u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Wynik: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Tekst wygląda następująco: " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("String to: " + lastString);
    }
}
