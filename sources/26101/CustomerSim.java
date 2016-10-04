/**
 * CS/COE 0401 Lab 5: Customer Simulation
 * @author Zac Yu <me@zacyu.com>
 */

import java.util.Random;
import java.util.Scanner;

public class CustomerSim
{
    public static void printInvalidInputNotice(String input) {
        System.out.print("'" + input + "' is not a valid Input. " +
                "Please enter an non-negative integer.");
    }

    public static int getNumCustomers()
    {
		Scanner keyboard = new Scanner(System.in);
        int numCustomers = 0;
        do
        {
            // prompt the user for number of customers
            System.out.print("\nEnter the number of customers: ");
            try
            {
                numCustomers = keyboard.nextInt();
            }
            catch (Exception e)
            {
                printInvalidInputNotice(keyboard.nextLine());
                numCustomers = -1;
                continue;
            }
            if (numCustomers < 0)
            {
                printInvalidInputNotice(Integer.toString(numCustomers));
            }
        } while (numCustomers < 0);
        return numCustomers;
    }

    public static void printTableHeading()
    {
        // print the table header
        System.out.printf("\n%-15s%-15s%12s%18s\n", "Customer", "Selection",
                          "Quantity", "Total Cost($)");
        System.out.printf("%-15s%-15s%12s%18s\n", "--------", "---------",
                          "--------", "-------------");
    }

    public static void printCustomerResults(int customerNumber, String itemName,
            int quantity, double totalCost)
    {
        System.out.printf("%-15s%-15s%12d%18.2f\n", "Customer " + customerNumber,
                itemName, quantity, totalCost);

    }

    public static void simulateCustomer(int customerNumber)
    {
		final double COFFEE_PRICE = 1.5;
		final double LATTE_PRICE = 3.5;
		final double CAPPUCCINO_PRICE = 3.25;
		final double ESPRESSO_PRICE = 2.0;
		
		final String COFFEE_NAME = "Coffee";
		final String LATTE_NAME = "Latte";
		final String CAPPUCCINO_NAME = "Cappuccino";
		final String ESPRESSO_NAME = "Espresso";
		
		int selection, quantity;
		double totalCost = 0.0;
		String selectionName = "";
		
        Random randomNumbers = new Random();

        // generate the customer selection and quantity
        // 0 - Coffee
        // 1 - Latte
        // 2 - Cappuccino
        // 3 - Espresso
        // assumption: quantity is in the range 1 - 5
        selection = randomNumbers.nextInt(4);
        quantity = randomNumbers.nextInt(5) + 1;
        
        // based on the selection, set the name and compute the total cost
        switch(selection)
        {
            case 0:		// Coffee
                selectionName = COFFEE_NAME;
                totalCost = quantity * COFFEE_PRICE;
                break;
            case 1:		// Latte
                selectionName = LATTE_NAME;
                totalCost = quantity * LATTE_PRICE;
                break;
            case 2:		// Cappuccino
                selectionName = CAPPUCCINO_NAME;
                totalCost = quantity * CAPPUCCINO_PRICE;
                break;
            case 3:		// Espresso
                selectionName = ESPRESSO_NAME;
                totalCost = quantity * ESPRESSO_PRICE;
                break;
        }
        printCustomerResults(customerNumber, selectionName, quantity, totalCost); 
    }

	public static void main(String[] args)
	{
		int numCustomers, runAnotherSimulation = 0;
		Scanner keyboard = new Scanner(System.in);
		
		// use a do-while loop to allow for multiple simulations
		do
		{
			// prompt the user for number of customers
			numCustomers = getNumCustomers();
			
            // print table heading
            printTableHeading();
			
			// simulate n customers
			for (int i = 1; i <= numCustomers; i++)
			{
                simulateCustomer(i);
			} // end of for loop
			
			// prompt the user about running another simulation
			System.out.print("\nEnter a 1 to run another simulation or 0 to exit: ");
			runAnotherSimulation = keyboard.nextInt();
		
		} while(runAnotherSimulation == 1);
        
        System.exit(0);
	}
}
