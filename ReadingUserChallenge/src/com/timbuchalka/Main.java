package com.timbuchalka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int licznik = 1;

        while(licznik <= 10) {

            System.out.println("Enter number #" + licznik);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                licznik++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }

        System.out.println("Suma liczb jest równa: "+sum);
        scanner.close();
    }


}
