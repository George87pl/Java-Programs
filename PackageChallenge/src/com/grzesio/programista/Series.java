package com.grzesio.programista;

public class Series {

    static int nSum(int n) {
        int suma=0;

        if(n < 0) {
            System.out.println("Złe dane");
        } else {
            for(int i=0; i<=n; i++) {
                suma += i;
            }
        }
        return suma;
    }

    static int factorial(int n) {
        int suma=0;

        if(n >= 1) {
            suma=1;
            for(int i=1; i<n; i++) {
                suma = (suma * i) + suma;
            }
        }
        return suma;
    }

    static int fibonacci(int n) {

        int[] tab = new int[12];

        tab[0] = 0;
        tab[1] = 1;

        for(int i=2; i<=n; i++) {
            tab[i] = tab[i-2] + tab[i-1];
        }

        return tab[n];
    }
}
