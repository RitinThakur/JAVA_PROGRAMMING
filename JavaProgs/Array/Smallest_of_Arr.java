package Array;

import java.util.Scanner;

public class Smallest_of_Arr {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of the array
		System.out.print("Enter the size of array: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Array to store elements

		// Step 2: Accept array elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the value: ");
			a[i] = p.nextInt();
		}

		// Step 3: Initialize the first element as smallest
		int small = a[0];

		// Step 4: Compare each element to find the smallest
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}

		// Step 5: Display the smallest element
		System.out.println(small + " is Smallest");

		// Step 6: Close scanner
		p.close();
	}
}
