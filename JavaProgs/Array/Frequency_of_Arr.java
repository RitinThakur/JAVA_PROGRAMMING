// Package declaration – organizes related classes under 'Array'
package Array;

import java.util.Scanner; // Import Scanner class for user input

// Class to calculate the frequency of elements in an array
public class Frequency_of_Arr {

	// Main method – entry point of the program
	public static void main(String[] args) {

		// Step 1: Create Scanner object to take input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask the user for the size of the array
		System.out.print("Enter size of array: ");
		int n = p.nextInt();

		// Step 3: Declare the array to store elements
		int[] a = new int[n];

		// Step 4: Declare a boolean array to track counted elements
		boolean[] b = new boolean[a.length]; // default value is false

		// Step 5: Input elements from the user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Value: ");
			a[i] = p.nextInt();
		}

		System.out.println();
		System.out.println("Occurrence for each element:");

		// Step 6: Calculate frequency of each element
		for (int i = 0; i < a.length; i++) {

			// Skip element if it has already been counted
			if (b[i] == false) {

				int count = 1; // Initialize count for current element

				// Check remaining elements for duplicates
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == a[i]) {
						count++;      // Increment count if duplicate found
						b[j] = true;  // Mark duplicate as counted
					}
				}

				// Print the element and its frequency
				System.out.println(a[i] + " => " + count);
			}
		}
	}
}
