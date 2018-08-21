package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner skaner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printIntegers(array);
        array = sortIntegers(array);
        printIntegers(array);

    }

    public static int[] getIntegers(int number){

        System.out.println("Proszę podać " + number + " liczb: ");
        int[] values = new int [number];
        for(int i=0; i<values.length; i++) {
            values[i] = skaner.nextInt();
        }
        return values;
    }

    public static void printIntegers(int[] tablica) {

        for(int i=0; i<tablica.length; i++){
            System.out.println("Pozycja " + i + " w tablicy to " + tablica[i]);
        }
    }

    public static int[] sortIntegers(int[] tablica) {

        int[] nowaTablica = new int[tablica.length];
        nowaTablica = Arrays.copyOf(tablica, tablica.length);
        int pomocnicza = 0;

        for (int i=0; i<tablica.length; i++) {
            for (int j = i; j < tablica.length; j++) {

                if (nowaTablica[i] < tablica[j]) {
                    pomocnicza = tablica[j];
                    tablica[j] = nowaTablica[i];
                    nowaTablica[i] = pomocnicza;
                }
            }
        }
        System.out.println("POSORTOWAŁEM!");
        return nowaTablica;
    }
}
