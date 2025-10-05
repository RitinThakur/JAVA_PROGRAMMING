// Package declaration – organizes related classes under 'Array'
package Array;

import java.util.Scanner; // Import Scanner class for user input

// Class to perform Linear Search on an integer array
public class Linear_Search {

	// Main method – program execution starts here
	public static void main(String args[]) {

		// Step 1: Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask user for number of elements in the array
		System.out.print("Enter number of elements: ");
		int n = p.nextInt(); // size of array

		// Step 3: Declare integer array with size 'n'
		int[] arr = new int[n];

		// Step 4: Take array elements from user
		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + i + " Element: ");
			arr[i] = p.nextInt();
		}

		// Step 5: Ask user for the value to search
		System.out.print("Enter value to find: ");
		int s = p.nextInt(); // element to search

		// Step 6: Initialize counter variable to track if found
		int c = 0;

		// Step 7: Perform linear search
		for (int i = 0; i < n; i++) {
			if (arr[i] == s) {  // check if current element matches
				c++;            // mark as found
				break;          // exit loop once found
			}
		}

		// Step 8: Display search result
		if (c >= 1)
			System.out.println(s + " is found in array.");
		else
			System.out.println(s + " is not found in array");
	}
}
