package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeekif(7);
    }

    public static void printDayOfTheWeek(int day) {
        switch(day){
            case 0:
                System.out.println("Poniedziałek");
                break;
            case 1:
                System.out.println("Wtorek");
                break;
            case 2:
                System.out.println("Środa");
                break;
            case 3:
                System.out.println("Czwartek");
                break;
            case 4:
                System.out.println("Piątek");
                break;
            case 5:
                System.out.println("Sobota");
                break;
            case 6:
                System.out.println("Niedziela");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeekif(int day) {

        if(day == 0) System.out.println("Poniedziałek");
        else if(day == 1) System.out.println("Wtorek");
        else if(day == 2) System.out.println("Środa");
        else if(day == 3) System.out.println("Czwartek");
        else if(day == 4) System.out.println("Piątek");
        else if(day == 5) System.out.println("Sobota");
        else if(day == 6) System.out.println("Niedziela");
        else System.out.println("Nie wiem");
    }
}
