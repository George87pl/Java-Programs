package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(3));
    }
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;
        if (number == 2) return 2;
        else {
            if (number % 2 == 0) return number / 2;
            else {
                int prime = number;

                while(prime > 1) {

                    if(number % prime == 0){

                        int isprime = 1;

                        for(int i = prime; i>0; i--){

                            if(prime % i == 0 && prime != i && i != 1) isprime = 0;
                        }
                        if(isprime == 1) return prime;
                    }
                    prime--;
                }
                return number;
            }
        }
    }
}
