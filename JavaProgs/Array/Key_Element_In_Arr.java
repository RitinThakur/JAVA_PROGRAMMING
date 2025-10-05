// Package declaration – groups related classes under 'Array'
package Array;

import java.util.Scanner; // Import Scanner class for user input

// Class to find if a key element is present in an array
public class Key_Element_In_Arr {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Create Scanner object to take input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask user for the size of the array
		System.out.print("Enter size of array: ");
		int ar = p.nextInt();

		// Step 3: Declare an integer array of size 'ar'
		int[] a = new int[ar];

		// Step 4: Input array elements from the user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Display the array elements
		System.out.println("Array Elements: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		// Step 6: Ask user for the key element to search
		System.out.print("Enter the element to be found: ");
		int n = p.nextInt();

		// Step 7: Initialize a flag variable to check presence
		int c = 0;

		// Step 8: Traverse the array to check if element is present
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				c++;   // Element found → increment flag
				break; // Stop searching once element is found
			}
		}

		// Step 9: Display result
		if (c > 0)
			System.out.println(n + " is in array");
		else
			System.out.println(n + " is not in array");
	}
}
