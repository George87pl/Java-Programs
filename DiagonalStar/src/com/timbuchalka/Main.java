package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        printSquareStar(30);

    }

    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {

            for(int i = 1; i < number+1; i++){
                for(int j = 1; j < number+1; j++){
                    if(i == 1 || j == 1 || i == j || i == number || j == number || i + j == number+1) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }

        }
    }
}
