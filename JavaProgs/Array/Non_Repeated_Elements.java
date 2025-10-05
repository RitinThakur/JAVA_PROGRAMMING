// WAJP (Write A Java Program) to print non-repeated (unique) elements
// from an integer array entered by the user.

package Array;

import java.util.Scanner;

public class Non_Repeated_Elements {

	public static void main(String[] args) {

		// Step 1: Create Scanner object for taking input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask user for the size of the array
		System.out.print("Enter size of array: ");
		int n = p.nextInt();

		// Step 3: Create integer array 'a' and boolean array 'b'
		int[] a = new int[n];
		boolean[] b = new boolean[a.length];
		// 'b' will help to mark elements that are already checked

		// Step 4: Accept user inputs for array elements
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Value: ");
			a[i] = p.nextInt();
		}

		System.out.println();
		System.out.println("Non-Repeated elements:");

		// Step 5: Traverse through array to find non-repeated elements
		for (int i = 0; i < a.length; i++) {

			// Skip elements already marked as duplicate
			if (b[i] == false) {
				int c = 1; // counter to count frequency of a[i]

				// Step 6: Compare current element with all next elements
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == a[i]) { // if duplicate found
						c++;            // increment count
						b[j] = true;    // mark duplicate as visited
					}
				}

				// Step 7: If element occurs only once, print it
				if (c == 1)
					System.out.println(a[i]);
			}
		}
	}
}
