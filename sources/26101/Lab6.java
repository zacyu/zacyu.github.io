/**
 * CS/COE 0401 Lab 6: Arrays
 * @author Zac Yu <me@zacyu.com>
 */

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {
    public static void larger_than_n(int[] arr, int min) {
        final String RESULT_MESSAGE = "\nThe numbers in the input file that are greater than %d are:\n";
        final String NO_RESULT_MESSAGE = "[none]";

        System.out.printf(RESULT_MESSAGE, min);
        boolean hasResult = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                  System.out.println(arr[i]);
                  hasResult = true;
            }
        }
        if (!hasResult) {
            System.out.println(NO_RESULT_MESSAGE);
        }
    }

    public static void main(String[] args) {
        final String USAGE_MESSAGE = "Usage: java Lab6 input_file";
        final String INPUT_IGNORE_INVALID_MESSAGE = "Ignoring invalid input line: '%s' is not an integer.\n";
        final String INPUT_IGNORE_EXTRA_MESSAGE = "Ignoring extra input line(s).\n";
        final String INPUT_IGNORE_INSUFFICIENT_MESSAGE = "Insufficient elements (%d < %d). Removing empty space.\n";
        final String FILE_ERROR_MESSAGE = "Invalid input file: %s\n";
        final String PROMPT_MESSAGE = "Enter an integer: ";
        final String INVALID_INPUT_MESSAGE = "Invalid input: '%s' is not an integer.\n";

        if (args.length != 1) {
            System.err.println(USAGE_MESSAGE);
            System.exit(-1);
        }

        // Create file instance for given input file path.
        File inputFile = new File(args[0]);

        // Create scanner instance for keyboard input.
        Scanner stdinScanner = new Scanner(System.in);

        // Create scanner instance for file input. Catch errors.
        Scanner fileScanner = null;

        // Create array to save the numbers.
        int[] numbers = null;

        // Counting the current index to insert into the array.
        int count = 0;

        try {
            fileScanner = new Scanner(inputFile);
        } catch (Exception e) {
            System.err.printf(FILE_ERROR_MESSAGE, e.getMessage());
            System.exit(-1);
        }

        while (fileScanner.hasNext()) {
            try {
                int num = fileScanner.nextInt();

                if (numbers == null) {
                    // Initalize the numbers array with given size.
                    numbers = new int[num];
                } else if (count < numbers.length) {
                    // Add element into array.
                    numbers[count++] = num;
                } else {
                    // Extra element.
                    System.err.print(INPUT_IGNORE_EXTRA_MESSAGE);
                    break;
                }
            } catch (Exception e) {
                String line = fileScanner.nextLine();
                if (!line.equals("")) {
                    System.err.printf(INPUT_IGNORE_INVALID_MESSAGE, line);
                }
            }
        }

        if (count < numbers.length) {
            System.err.printf(INPUT_IGNORE_INSUFFICIENT_MESSAGE, count, numbers.length);
            numbers = Arrays.copyOf(numbers, count);
        }

        int min = 0;
        boolean hasError = false;

        do {
            hasError = false;
            System.out.print(PROMPT_MESSAGE);
            try {
                min = stdinScanner.nextInt();
            } catch (Exception e) {
                stdinScanner.nextLine();
                String line = fileScanner.nextLine();
                if (!line.equals("")) {
                    System.err.printf(INVALID_INPUT_MESSAGE, line);
                }
                hasError = true;
            }
        } while (hasError);

        // Call to method.
        larger_than_n(numbers, min);

        // Exit without error.
        System.exit(0);
    }
}
