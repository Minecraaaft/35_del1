package game;

import spil.Player;

public class Game {

    public static void main(String[] args) {

        Player player1 = new Player("John");
        Player player2 = new Player("Bob");

        do {

            player1.rollDice();
            if (player1.getPoints() >= 40)
                break;

            player2.rollDice();
        } while (player1.getPoints() < 40 && player2.getPoints() < 40);

    }
}