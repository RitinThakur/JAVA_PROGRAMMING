package Array;

import java.util.Scanner;

public class Repeated_Elements {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of the array
		System.out.print("Enter size of array: ");
		int n = p.nextInt();

		int[] a = new int[n];           // Array to store user input
		boolean[] b = new boolean[a.length]; // Boolean array to track processed elements

		// Step 2: Accept array elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 3: Find and print repeated elements
		System.out.println("Repeated elements are:");

		for (int i = 0; i < a.length; i++) {

			if (b[i] == false) { // Check if element has already been counted
				int c = 1;       // Counter for occurrences

				// Compare with remaining elements
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == a[i]) {
						c++;
						b[j] = true; // Mark duplicate as processed
					}
				}

				if (c > 1) { // If element occurred more than once
					System.out.println(a[i]);
				}
			}
		}

		// Step 4: Close scanner
		p.close();
	}
}
