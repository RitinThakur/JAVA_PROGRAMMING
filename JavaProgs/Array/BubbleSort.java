// Package declaration – groups related classes under the 'Array' package
package Array;

import java.util.Scanner; // Import Scanner class for user input

// Class declaration
public class BubbleSort {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Take array size input from user
		Scanner p = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = p.nextInt(); // store user input for array size

		// Step 2: Declare and create an integer array of size 'n'
		int[] a = new int[n];

		// Step 3: Accept array elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt(); // store each element in the array
		}

		// Step 4: Display array before sorting
		System.out.println();
		System.out.println("BEFORE SORTING: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// Step 5: Apply Bubble Sort algorithm
		// Outer loop: runs for (n-1) passes
		for (int i = 0; i < a.length - 1; i++) {

			// Inner loop: compares adjacent elements
			// It decreases with each pass (since last elements are already sorted)
			for (int j = 0; j < a.length - 1 - i; j++) {

				// If current element is greater than next, swap them
				if (a[j] > a[j + 1]) {
					int temp = a[j];     // store a[j] temporarily
					a[j] = a[j + 1];     // move smaller element left
					a[j + 1] = temp;     // move larger element right
				}
			}
		}

		// Step 6: Display array after sorting
		System.out.println();
		System.out.println("AFTER SORTING: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
