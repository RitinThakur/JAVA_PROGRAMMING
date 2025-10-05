// Package declaration – organizes related classes under 'Array'
package Array;

import java.util.Scanner; // Import Scanner for taking user input

// Class to find the largest element in an integer array
public class Largest_of_Arr {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask user for size of the array
		System.out.print("Enter the size of array: ");
		int n = p.nextInt();

		// Step 3: Declare integer array of size 'n'
		int[] a = new int[n];

		// Step 4: Take input values for the array
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Assume the first element is the largest initially
		int large = a[0];

		// Step 6: Compare each element to find the largest
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i]; // Update 'large' if current element is greater
			}
		}

		// Step 7: Display the largest element
		System.out.println(large + " is the largest element in the array");
	}
}
