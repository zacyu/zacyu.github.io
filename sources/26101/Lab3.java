/**
 * CS/COE 0401 Lab 3: Calculation Program
 * @author Zac Yu <me@zacyu.com>
 */

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        final String MENU_MESSAGE = "Welcome to the Calculation Program!\n\n" +
            "1. Area of a circle\n" +
            "2. Volume of a sphere\n" +
            "3. Volume of a cylindrical solid\n" +
            "4. Fahrenheit to Celsius conversion\n\n" +
            "Select a calculation: ";
        final String PROMPT_MESSAGE = "Enter the %s: ";
        final String[] ANSWER_MESSAGES = {
          "The area of a circle with radius %.2f units is %.2f units^2.\n",
          "The volume of a sphere with radius %.2f units is %.2f units^3.\n",
          "The volume of a cylindrical solid with radius %.2f units and " +
              "height %.2f units is %.2f units^3.\n",
          "%.2f degrees Fahrenheit is equivalent to %.2f degrees Celsius.\n"
        };

        // Create a Scanner object for standard input.
        Scanner stdinScanner = new Scanner(System.in);

        double radius, height, area, volume, temperatureInF, temperatureInC;

        // Prompt the user to select a calculation.
        System.out.print(MENU_MESSAGE);
        switch(stdinScanner.nextInt()) {
          case 1:
            // Prompt the user to enter the radius.
            System.out.printf(PROMPT_MESSAGE, "radius");
            // Read in the radius.
            radius = stdinScanner.nextDouble();
            // Print line break.
            System.out.println();
            // Calculate the area of the circle.
            area = Math.PI * Math.pow(radius, 2);
            // Print result.
            System.out.printf(ANSWER_MESSAGES[0], radius, area);
            break;
          case 2:
            // Prompt the user to enter the radius.
            System.out.printf(PROMPT_MESSAGE, "radius");
            // Read in the radius.
            radius = stdinScanner.nextDouble();
            // Print line break.
            System.out.println();
            // Calculate the volume of the sphere.
            volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            // Print result.
            System.out.printf(ANSWER_MESSAGES[1], radius, volume);
            break;
          case 3:
            // Prompt the user to enter the radius.
            System.out.printf(PROMPT_MESSAGE, "radius");
            // Read in the radius.
            radius = stdinScanner.nextDouble();
            // Prompt the user to enter the height.
            System.out.printf(PROMPT_MESSAGE, "height");
            // Read in the height.
            height = stdinScanner.nextDouble();
            // Print line break.
            System.out.println();
            // Calculate the volume of the cylinder.
            volume = Math.PI * Math.pow(radius, 2) * height;
            // Print result.
            System.out.printf(ANSWER_MESSAGES[2], radius, height, volume);
            break;
          case 4:
            // Prompt the user to enter the temperature in Fahrenheit.
            System.out.printf(PROMPT_MESSAGE, "Fahrenheit temp");
            // Read in the temperature.
            temperatureInF = stdinScanner.nextDouble();
            // Print line break.
            System.out.println();
            // Calculate temperature in Celsius.
            temperatureInC = (5.0 / 9.0) * (temperatureInF - 32);
            // Print result.
            System.out.printf(ANSWER_MESSAGES[3], temperatureInF, temperatureInC);
            break;
          default:
            System.err.println("Invalid selection!");
            break;
        }

        // Exit without error.
        System.exit(0);
    }
}
