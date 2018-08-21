package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        int switchValue = 4;

//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("3 albo 4 albo 5");
//                System.out.println("właściwie " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

        char litera = 'F';

        switch (litera) {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
                System.out.println("Value was C");
                break;

            case 'D':
                System.out.println("Value was D");
                break;

            case 'E':
                System.out.println("Value was E");
                break;

            default:
                System.out.println("not found");
                break;
        }

    }
}


