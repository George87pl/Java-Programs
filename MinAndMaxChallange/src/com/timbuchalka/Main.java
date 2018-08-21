package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int min = 0;
        int max = 0;
        boolean flag = true;

        boolean nextInt = scanner.hasNextInt();
        if (nextInt){

            int number = scanner.nextInt();

            if(flag){
                flag = false;
                min = number;
                max = number;
            }

            while (true) {
                System.out.print("Enter number: ");
                scanner.nextLine();
                number = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    if (number < min) min = number;
                    else if (number > max) max = number;
                } else {
                    break;
                }
            }
            scanner.close();
            System.out.println("Min = " + min + ", Max = " + max);
        }
    }
}
