package Array;

import java.util.Scanner;

public class Sum_of_Arr {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of array
		System.out.print("Enter Size of Array: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Array to store elements
		int sum = 0;          // Variable to store sum of elements

		// Step 2: Accept array elements and calculate sum simultaneously
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the value: ");
			a[i] = p.nextInt();
			sum = sum + a[i]; // Add current element to sum
		}

		// Step 3: Display the sum
		System.out.println("Sum of Values in array: " + sum);

		// Step 4: Close scanner
		p.close();
	}
}
