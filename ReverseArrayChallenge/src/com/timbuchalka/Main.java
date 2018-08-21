package com.timbuchalka;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[]{8,3,-5,77,3,7,9,100,6,4};

        System.out.println(Arrays.toString(tablica));
        reverse(tablica);
        System.out.println(Arrays.toString(tablica));
    }

    public static void reverse(int tab[]) {

        int temp = 0;
        for(int i=0; i<(tab.length)/2; i++) {
            temp = tab[i];
            tab[i] = tab[tab.length-1-i];
            tab[tab.length-1-i] = temp;
        }
    }
}
