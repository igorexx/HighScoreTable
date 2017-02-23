package com.igordudek;

public class Main {

    public static void main(String[] args) {
	displayHighScorePosition("Igor", calculateHighScorePosition(1500));
	displayHighScorePosition("Tim", calculateHighScorePosition(900));
	displayHighScorePosition("Bob", calculateHighScorePosition(400));
	displayHighScorePosition("Percy", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition (String playerName, int highScoreTablePosition) {
        System.out.println(playerName + " maneged to get into position " + highScoreTablePosition
        + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore>=1000) {
            return 1;
        }
        else if (playerScore>=500 && playerScore<1000) {
             return 2;
        }
        else if (playerScore>=100 && playerScore<500) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
