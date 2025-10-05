// WAJP (Write A Java Program) to find the Nth smallest element in an integer array
// using Arrays.sort() method.

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Smallest_Element {

	public static void main(String[] args) {

		// Step 1: Create Scanner object for taking user input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask the user for the array size
		System.out.print("Enter Size Of Array: ");
		int s = p.nextInt();

		// Step 3: Declare an integer array of given size
		int[] a = new int[s];

		// Step 4: Accept values from the user and store them in the array
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Ask the user which smallest element they want
		System.out.println("Enter which smallest element you want from 1 to " + a.length + ": ");
		int n = p.nextInt();

		// Step 6: Sort the array in ascending order (smallest to largest)
		Arrays.sort(a);

		// Step 7: Display the Nth smallest element
		System.out.println(n + " Smallest Element: " + a[n - 1]);

		// Step 8: Close Scanner object
		p.close();
	}
}
