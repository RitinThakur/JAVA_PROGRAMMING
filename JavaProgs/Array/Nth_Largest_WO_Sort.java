// WAJP (Write A Java Program) to find the Nth largest element in an integer array
// without using sorting or any in-built methods.

package Array;

import java.util.Scanner;

public class Nth_Largest_WO_Sort {

	public static void main(String[] args) {

		// Step 1: Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Step 2: Accept the size of the array
		System.out.print("Enter Size Of Array: ");
		int s = p.nextInt();

		// Step 3: Declare integer array of given size
		int[] a = new int[s];

		// Step 4: Take input values into the array
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Ask user which 'Nth' largest element they want
		System.out.println("Enter which largest element you want from 1 to " + a.length + ": ");
		int n = p.nextInt();

		// Step 6: Main logic — find Nth largest without sorting
		// Outer loop picks each element one by one
		for (int i = 0; i < a.length; i++) {

			int c = 0; // Counter to count how many elements are smaller than a[i]

			// Inner loop compares a[i] with every other element
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					c++; // Increase count when a[i] is greater than a[j]
				}
			}

			// Step 7: If exactly (n-1) elements are smaller than a[i],
			// then a[i] is the Nth largest element.
			if (c == n - 1) {
				System.out.println(n + " Largest Element: " + a[i]);
				break; // Stop once found
			}
		}

		// Step 8: Close the scanner
		p.close();
	}
}
