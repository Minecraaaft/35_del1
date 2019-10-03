package game;

import spil.Player;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1, write name please: ");
        String name1 = scanner.nextLine();
        System.out.print("Player 2, write name please: ");
        String name2 = scanner.nextLine();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        System.out.print("\nPress enter to roll dice, first to roll a pair after 40 points win.");
        System.out.println("Rolling a pair gives an extra turn, a pair 1s loses all points ");
        System.out.println("and a pair 6s two times in a row automatically wins.");

        do {
            String unusedString1 = scanner.nextLine();
            player1.rollDice();

            if (player1.getHasWon())
                break;
            String unusedString2 = scanner.nextLine();
            player2.rollDice();

        } while (!player1.getHasWon() && !player2.getHasWon());

    }
}
