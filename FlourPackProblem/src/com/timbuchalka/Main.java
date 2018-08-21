package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,6));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
        else{
            if ((bigCount*5) > goal) return false;
            else{
                if(bigCount*5 + smallCount >= goal) return true;
                else return false;
            }
        }
    }

}
