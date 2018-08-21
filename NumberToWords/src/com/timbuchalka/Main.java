package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //System.out.println(getDigitCount(-6));
        System.out.println(reverse(1234));
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");

        else {

            int reverseNumber = reverse(number);
            int count = getDigitCount(reverseNumber);

            int lastNumber = 0;
            while (reverseNumber > 0) {

                lastNumber = reverseNumber % 10;
                reverseNumber /= 10;

                switch (lastNumber) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

            }

            if (count != getDigitCount(number)) {
                while (count <= getDigitCount(number) - 1) {
                    System.out.println("Zero");
                    count++;
                }
            }
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        int neg =0;

        if(number < 0) neg = 1;

        while (number > 0 || number < 0) {
            rev = rev + number % 10;
            rev *= 10;
            number /= 10;
        }

        rev /= 10;

        return rev;


    }

    public static int getDigitCount(int number) {

        if (number < 0) return -1;
        if (number == 0) return 1;
        int licznik = 0;
        while (number > 0 ) {
            number /= 10;
            licznik++;
        }
        return licznik;

    }
}
