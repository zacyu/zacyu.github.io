/**
 * CS/COE 0401 Lab 4: Slot Machine Simulation
 * @author Zac Yu <me@zacyu.com>
 */

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        final String WELCOME_MESSAGE = "Welcome to the Slot Machine Program!";
        final String PROMPT_MESSAGE = "\nHow much money ($) would you like to enter? ";
        final String RESULT_MESSAGE = "%-10s %-10s %s\nYou win: $%,d\n\n";
        final String CONTINUE_MESSAGE = "Enter a 1 to play again or a 0 to exit: ";
        final String EXIT_MESSAGE = "\nYou entered $%,d and won $%,d. Thanks for playing!\n";
        final String[] ITEMS = {"Cherries", "Oranges", "Plums", "Bells",
                                "Melons", "Bars"};

        // Indicates the game state.
        boolean isPlaying = true;

        // Total money entered.
        int totalMoneyEnetered = 0, totalMoneyWon = 0;

        // Create a Scanner object for standard input.
        Scanner stdinScanner = new Scanner(System.in);

        // Create a Random object for generating random numbers.
        Random random = new Random();

        // Display welcome message.
        System.out.println(WELCOME_MESSAGE);

        while (isPlaying) {
            // Prompt the player to enter an amount.
            System.out.print(PROMPT_MESSAGE);
            int moneyEntered = stdinScanner.nextInt();
            totalMoneyEnetered += moneyEntered;

            // Generate random numbers.
            int item1 = random.nextInt(ITEMS.length),
                item2 = random.nextInt(ITEMS.length),
                item3 = random.nextInt(ITEMS.length);

            // Calculate the amount won by the player.
            int moneyWon = 0;

            if (item1 == item2 && item1 == item3) {
              moneyWon = 3 * moneyEntered;
            } else if (item1 == item2 || item1 == item3 || item2 == item3) {
              moneyWon = 2 * moneyEntered;
            }

            totalMoneyWon += moneyWon;

            // Display the result.
            System.out.printf(RESULT_MESSAGE, ITEMS[item1], ITEMS[item2],
                ITEMS[item3], moneyWon);

            // Ask if the player wants to play again.
            System.out.print(CONTINUE_MESSAGE);
            isPlaying = stdinScanner.nextInt() == 1;
        }

        // Display final result.
        System.out.printf(EXIT_MESSAGE, totalMoneyEnetered, totalMoneyWon);

        // Exit without error.
        System.exit(0);
    }
}
