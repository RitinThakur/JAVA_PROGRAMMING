package Array;

import java.util.Scanner;

public class Prime_Num_In_arr {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of array
		System.out.print("Enter size of arr: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Array to store numbers
		int c = 0; // Counter to check divisibility

		// Step 2: Accept array elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Num Value: ");
			a[i] = p.nextInt();
		}

		System.out.println("\nPrime numbers in the array are:");

		// Step 3: Check each number for primality
		for (int j = 0; j < a.length; j++) {

			c = 0; // Reset counter for each number

			// A prime number is divisible only by 1 and itself
			// Loop from 2 to half of the number
			for (int i = 2; i <= a[j] / 2; i++) {
				// System.out.println(i); // Optional debug print
				if (a[j] % i == 0) {
					c++; // Increment counter if divisible
					break; // Not prime, exit loop
				}
			}

			// Step 4: If counter is 0, number is prime (excluding 1)
			if (c == 0 && a[j] > 1) {
				System.out.println(a[j]);
			}
		}

		// Step 5: Close scanner
		p.close();
	}
}
