// Package declaration – organizes related classes under 'Array'
package Array;

import java.util.Scanner; // Import Scanner class for user input

// Class declaration
public class Count_of_Even_Odd {

	// Main method – entry point of the program
	public static void main(String[] args) {

		// Step 1: Create Scanner object to read user input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask the user for array size
		System.out.print("Enter Size of array: ");
		int n = p.nextInt();

		// Step 3: Declare an integer array of given size
		int[] a = new int[n];

		// Step 4: Take array elements input from the user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Call the 'count' method to count even & odd numbers
		int[] res = count(a);

		// Step 6: Display the results
		System.out.println("Count of Even Numbers: " + res[0]);
		System.out.println("Count of Odd Numbers: " + res[1]);
	}

	// --------------------------------------------------------
	// Method: count
	// Purpose: To count how many even and odd numbers exist in the array
	// Parameters: integer array 'a'
	// Returns: integer array 'r' → [evenCount, oddCount]
	// --------------------------------------------------------
	public static int[] count(int[] a) {

		// Step 1: Create a result array 'r' of size 2
		// r[0] → stores count of even numbers
		// r[1] → stores count of odd numbers
		int[] r = new int[2];

		// Step 2: Traverse through each element in the array
		for (int i = 0; i < a.length; i++) {

			// If number is divisible by 2 → even
			if (a[i] % 2 == 0)
				r[0]++; // Increment even count
			else
				r[1]++; // Increment odd count
		}

		// Step 3: Return the result array
		return r;
	}
}
