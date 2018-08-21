package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
       //int hightScore = calculateScore(true, 800, 5, 100);
       // System.out.println("you final score was " + hightScore);
       // calculateScore(false, 1000, 8, 200);

        displayHighScorePosition("Grzegorz", calculateHighScorePosition(1500));
        displayHighScorePosition("Kasia", calculateHighScorePosition(900));
        displayHighScorePosition("Janusz", calculateHighScorePosition(400));
        displayHighScorePosition("Paweł", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score > 1000) return 1;
//        if(score > 500 && score < 1000) return 2;
//        if(score > 100 && score < 500) return 3;
//        return 4;
    }
}
