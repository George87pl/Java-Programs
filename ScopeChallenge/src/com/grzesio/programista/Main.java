package com.grzesio.programista;

import java.util.Scanner;

public class Main {

    private static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj x: ");
        X x = new X(Main.x.nextInt());
        x.x();
    }

    private static class X {

        private int x;

         private X(int x) {
             this.x = x;
         }

         private void x() {

            for (int x = 1; x <= 12; x++) {
                System.out.println(this.x * x);
            }
        }

    }
}
