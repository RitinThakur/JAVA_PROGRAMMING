package Array;

import java.util.Scanner;

public class Remove_Element {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of the array
		System.out.println("Enter Size of array: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Original array

		// Step 2: Accept elements for the array
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value: ");
			a[i] = p.nextInt();
		}

		// Step 3: Ask for the index of the element to remove
		System.out.println("Enter index from 0 to " + (a.length - 1));
		int ind = p.nextInt();

		// Step 4: Call the remove method
		int[] res = remove(a, ind);

		// Step 5: Display array after removal
		System.out.println("Array after removing element at index " + ind + ":");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	// Method to remove element at a given index
	public static int[] remove(int[] a, int ind) {

		// Check for invalid index
		if (ind < 0 || ind >= a.length) {
			System.out.println("Index out of bound");
			return a; // Return original array if index is invalid
		}

		int[] res = new int[a.length - 1]; // New array with size reduced by 1

		// Copy elements except the one at the given index
		for (int i = 0; i < res.length; i++) {
			if (i < ind) {
				res[i] = a[i]; // Elements before index
			} else {
				res[i] = a[i + 1]; // Elements after index
			}
		}

		return res; // Return new array
	}
}
