package NPTC;

import java.util.Scanner;

public class kk {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Ask user for the number of values
		System.out.println("Enter number of values : ");
		int n = p.nextInt();

		int a[] = new int[n];  // Create an array of size n
		int sum = 0;

		// Loop to take input and calculate sum
		for (int i = 0; i <= a.length - 1; i++) {
			// Warning: (++i) here increases i, so it skips an index
			System.out.println("Enter " + (++i) + " value: ");
			a[i] = p.nextInt();  // Read value into array
			sum = sum + a[i];    // Add value to sum
		}

		// Print the sum of all entered values
		System.out.println("Sum:" + sum);
	}
}
