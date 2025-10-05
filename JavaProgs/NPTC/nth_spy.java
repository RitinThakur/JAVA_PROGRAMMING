package NPTC;

import java.util.Scanner;

public class nth_spy {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = p.nextInt(); // The upper limit to check spy numbers

		// Loop through all numbers from 1 to n
		for (int i = 1; i <= n; i++) {
			int sum = 0, product = 1;
			int a = i; // Copy of the number for digit processing

			// Process each digit of the number
			while (a > 0) {
				int r = a % 10;    // Extract the last digit
				sum = sum + r;     // Add digit to sum
				product = product * r; // Multiply digit to product
				a /= 10;           // Remove last digit
			}

			// Check if the number is a spy number
			// A spy number is a number where sum of digits == product of digits
			if (sum == product)
				System.out.println(i); // Print the spy number
		}
	}
}
