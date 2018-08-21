package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int prevResult = result;
        result = result - 1;
        System.out.println(prevResult + " - 1 = " +result);

        prevResult = result;
        result = result * 10;
        System.out.println(prevResult + " * 10 = " + result);

        prevResult = result;

        result = result / 5;
        System.out.println(prevResult + " / 5 = " + result);

        prevResult = result;
        result = result % 3;
        System.out.println(prevResult + " % 3 = " + result);

        prevResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;

        System.out.println("Result is now " + result);

        result *= 10;

        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");
        else
            System.out.println("It is an alien!");

        int topScore = 59;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Więcej niż topScore i mniej niż 100");

        double firstVariable = 20;
        double secondVariable = 80;

        double wynik = (firstVariable + secondVariable) * 25;

        System.out.println(wynik);

        double zostalo = wynik % (wynik / 40);


        System.out.println(wynik % (wynik / 40));

        if( zostalo <= 20)
            System.out.println("Total was over limit " + zostalo);

    }
}
