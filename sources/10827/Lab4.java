/**
 * CS/COE 0401 Lab 4: Slot Machine Simulation
 * @author Zac Yu <me@zacyu.com>
 */

import java.util.Scanner;
import java.util.Random;

public class Lab4 {
    public static void RollDice(int times, Random random) {
        final String BEGIN_ROLL_MESSAGE = "Now rolling the dice for %d times:\n";
        final String RESULT_MESSAGE = "Value %-4d: %f\n";

        int[] occurance = new int[11];

        System.out.printf(BEGIN_ROLL_MESSAGE, times);
        for (int i = 0; i < times; i++) {
            int result = 2 + random.nextInt(6) + random.nextInt(6);
            occurance[result - 2]++;
        }

        for (int i = 0; i < 11; i++) {
            System.out.printf(RESULT_MESSAGE, i + 2, occurance[i] / (double) times);
        }
    }

    public static void main(String[] args) {
        final String PROMPT_MESSAGE = "Enter the times you want to roll: ";
        final String CONFIRM_EXIT_MESSAGE = "Try again [Y/n]: ";

        Scanner stdinScanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int times = 1;

            do {
                if (times < 1) System.out.println("Please enter a natural number!");
                System.out.print(PROMPT_MESSAGE);
                times = stdinScanner.nextInt();
            } while (times < 1);

            stdinScanner.nextLine();

            RollDice(times, random);

            System.out.print(CONFIRM_EXIT_MESSAGE);

            String response = stdinScanner.nextLine();
            if (response.length() > 0 && response.toLowerCase().charAt(0) == 'n') break;
        }
        // Exit without error.
        System.exit(0);
    }
}
