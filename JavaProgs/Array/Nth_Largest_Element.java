// WAJP (Write A Java Program) to find the Nth largest element in an integer array.

package Array;

import java.util.Arrays;   // For built-in sorting function
import java.util.Scanner;  // For user input

public class Nth_Largest_Element {

	public static void main(String[] args) {

		// Step 1: Create Scanner object to read user input
		Scanner p = new Scanner(System.in);

		// Step 2: Ask user for the size of the array
		System.out.print("Enter Size Of Array: ");
		int s = p.nextInt();

		// Step 3: Declare an integer array of given size
		int[] a = new int[s];

		// Step 4: Accept elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 5: Ask user which 'Nth' largest element they want
		System.out.println("Enter the Largest Element Required from 1 to " + a.length + ": ");
		int n = p.nextInt();

		// Step 6: Sort the array in ascending order using built-in Arrays.sort()
		Arrays.sort(a);

		// Step 7: The Nth largest element = element at position (length - n)
		System.out.println(n + " Largest Element: " + a[a.length - n]);
	}
}
