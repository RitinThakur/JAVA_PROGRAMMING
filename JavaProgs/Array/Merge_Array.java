// Package declaration – keeps related classes organized under 'Array'
package Array;

import java.util.Scanner;  // Import Scanner class for taking user input

// Class to demonstrate merging two arrays
public class Merge_Array {

	// Main method – program execution begins here
	public static void main(String[] args) {

		// Step 1: Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Step 2: Take input for first array size
		System.out.print("Enter Size of 1st Array: ");
		int s1 = p.nextInt();  // store the size of first array
		int[] a1 = new int[s1]; // declare first array
		System.out.println();

		// Step 3: Take input elements for the first array
		for (int i = 0; i < a1.length; i++) {
			System.out.print("Enter Value in 1st array: ");
			a1[i] = p.nextInt();
		}
		System.out.println();

		// Step 4: Take input for second array size
		System.out.print("Enter Size of 2nd Array: ");
		int s2 = p.nextInt();  // store the size of second array
		int[] a2 = new int[s2]; // declare second array
		System.out.println();

		// Step 5: Take input elements for the second array
		for (int i = 0; i < a2.length; i++) {
			System.out.print("Enter Value in 2nd array: ");
			a2[i] = p.nextInt();
		}
		System.out.println();

		// Step 6: Create a new array to hold merged elements
		int[] mer = new int[s1 + s2];  // total length = sum of both arrays

		// Step 7: Copy elements of the first array into merged array
		for (int i = 0; i < a1.length; i++) {
			mer[i] = a1[i];
		}

		// Step 8: Copy elements of the second array after first array elements
		for (int i = 0; i < a2.length; i++) {
			mer[a1.length + i] = a2[i];  // start filling from end of a1
		}

		// Step 9: Display merged array
		System.out.println();
		System.out.println("Elements of Merged Array: ");
		for (int i = 0; i < mer.length; i++) {
			System.out.println(mer[i]);
		}
	}
}
