package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalidrome(101));
    }

    public static boolean isPalidrome(int number) {
        if(number < 10 && number > -10) return true;
        else {
            int reverse = 0;
            int lastDigit = number;
            while(lastDigit >= 10 || lastDigit <= -10){
                reverse = reverse + (lastDigit % 10);
                lastDigit /= 10;
                reverse = reverse * 10;
            }
            reverse = reverse + (lastDigit % 10);
            if(reverse==number) return true;
            else return false;
        }
    }
}
