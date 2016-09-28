/**
 * CS/COE 0401 Lab 3: Logarithm Calculator
 * @author Zac Yu <me@zacyu.com>
 */

import java.util.Scanner;

public class LogarithmCalc {
    public static void main(String[] args) {
        final String WELCOME_MESSAGE = "Welcome to Zac's Logarithm Calculator!\n";
        final String PROMPT_B_MESSAGE = "Please enter an integer base b " +
            "(b > 1): ";
        final String PROMPT_X_MESSAGE = "Please enter a natural number X: ";
        final String NOTICE_INVALID_X_MESSAGE = "X should be a natural number. " +
            "Please try again!";
        final String RESULT_MESSAGE = "\tlog_{%d}^{%d} = %d\n\n";
        final String EXIT_MESSAGE = "Thanks for using Zac's Logarithm Calculator.";

        int b, x, divisionCounter;

        // Create a Scanner object for standard input.
        Scanner stdinScanner = new Scanner(System.in);

        // Display welcome message.
        System.out.println(WELCOME_MESSAGE);

        while (true) {
            // Prompt the player to enter B.
            System.out.print(PROMPT_B_MESSAGE);
            b = stdinScanner.nextInt();

            if (b <= 1) {
                // Exit main loop.
                break;
            }

            x = 1;

            do {
                if (x <= 0) {
                    System.out.println(NOTICE_INVALID_X_MESSAGE);
                }
                // Prompt the player to enter X.
                System.out.print(PROMPT_X_MESSAGE);
                x = stdinScanner.nextInt();
            } while (x <= 0);

            // Calculate Logarithm.
            divisionCounter = 0;

            int tmp = x;

            while (tmp >= b) {
                tmp /= b;
                divisionCounter++;
            }

            // Display the result.
            System.out.printf(RESULT_MESSAGE, b, x, divisionCounter);
        }

        // Display exit message.
        System.out.println(EXIT_MESSAGE);

        // Exit without error.
        System.exit(0);
    }
}
