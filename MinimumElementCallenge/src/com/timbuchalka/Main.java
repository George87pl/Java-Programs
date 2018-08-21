package com.timbuchalka;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ile cyfr chcesz wprowadzić?");
        int count = scanner.nextInt();

        int[] tab = readIntegers(count);
        System.out.println(Arrays.toString(tab));
        System.out.println("Minimalna wartość w tablicy to: " +findMin(tab));

    }

    public static int[] readIntegers(int numer) {
        int[] tablica = new int[numer];

        System.out.println("Wprowadź " + numer + " cyfr");

        for(int i=0; i<numer; i++){
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    public static int findMin(int[] tablica) {
        int min = tablica[0];

        for(int i = 1; i < tablica.length; i++) {
            if(tablica[i] < min) min = tablica[i];
        }
        return min;
    }
}
