package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) return -1;
        else{
            int dzielnik1 = first;
            int dzielnik2 = second;
            if(dzielnik1 < dzielnik2){
                while(dzielnik1 > 0) {
                    if (dzielnik1 % 2 == 0) {
                        while (dzielnik2 > 0){
                            if(dzielnik1 % dzielnik2 == 0){
                                System.out.println(dzielnik2);
                                return dzielnik1;
                            }
                            else dzielnik2--;
                        }
                    }
                    else dzielnik1--;
                }
            }
        }
        return -1;
    }
}
