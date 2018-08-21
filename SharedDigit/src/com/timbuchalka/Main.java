package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 34));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99 || second < 10 || second >99) return false;
        else{
            while(first > 0){
                while(second > 0){
                    if(first % 10 == second % 10) return true;
                    else second = second / 10;
                }
                first = first / 10;
            }
            return false;
        }
    }
}
