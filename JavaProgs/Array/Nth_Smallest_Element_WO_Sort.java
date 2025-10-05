// WAJP to find the Nth smallest element in an integer array
// WITHOUT using any sorting algorithm (manual comparison method)

package Array;

import java.util.Scanner;

public class Nth_Smallest_Element_WO_Sort {

	public static void main(String[] args) {

		// Step 1: Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Step 2: Take the array size from the user
		System.out.print("Enter Size Of Array: ");
		int s = p.nextInt();

		// Step 3: Declare an integer array
		int[] a = new int[s];

		// Step 4: Accept array elements from the user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Ask the user which smallest element they want
		System.out.print("Enter which smallest element you want from 1 to " + a.length + ": ");
		int n = p.nextInt();

		// Step 6: Logic to find the Nth smallest element (without sorting)
		for (int i = 0; i < a.length; i++) {
			int count = 0;

			// Compare a[i] with all other elements
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					count++; // count how many elements are smaller than a[i]
				}
			}

			// If exactly (n-1) elements are smaller, a[i] is the Nth smallest
			if (count == n - 1) {
				System.out.println(n + " Smallest Element: " + a[i]);
				break;
			}
		}

		// Step 7: Close Scanner
		p.close();
	}
}
