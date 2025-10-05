// Package declaration – used to group related classes together
package Array;

// Import Scanner class to take user input
import java.util.Scanner;

// Class declaration
public class Avg_of_Prod {

	// Main method – the entry point of the program
	public static void main(String[] args) {

		// Create a Scanner object to read user input from keyboard
		Scanner p = new Scanner(System.in);

		// Step 1: Ask user for number of items
		System.out.print("Enter number of items: ");
		int n = p.nextInt(); // Store the number of items

		// Step 2: Declare an array to store prices of items
		double[] a = new double[n];

		// Step 3: Initialize a variable to store sum of prices
		double sum = 0.0;

		// Step 4: Take price input for each product and calculate total sum
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Price: ");
			a[i] = p.nextDouble(); // Store the entered price in array
			sum = sum + a[i];      // Add each price to the total sum
		}

		// Step 5: Calculate average price
		double avg = sum / n;

		// Step 6: Display the average
		System.out.println("Average Price: " + avg);

		// Step 7: Close the Scanner to free system resources
		p.close();
	}
}
