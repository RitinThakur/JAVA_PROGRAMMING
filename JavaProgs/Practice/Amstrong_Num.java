package Practice;

import java.util.Scanner;

public class Amstrong_Num {
	public static void main(String[] args) {

		// Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Ask user to enter a number
		System.out.print("Enter a number: ");
		int n = p.nextInt();

		// Variables for processing
		int pr = 0;     // To store number of digits
		int t = n;      // Temporary variable for counting digits
		int t2 = n;     // Temporary variable for calculating Armstrong sum
		int sum = 0;    // To store the sum of digits raised to power 'pr'
		int d = 0;      // To hold each digit

		// Count the number of digits
		while (t > 0) {
			pr++;       // Increase digit count
			t = t / 10; // Remove last digit
		}

		// Calculate Armstrong sum
		while (t2 > 0) {
			int prd = 1;    // Will store digit^pr
			d = t2 % 10;    // Extract last digit

			// Raise digit d to the power pr
			for (int i = 1; i <= pr; i++) {
				prd = prd * d;
			}

			sum = sum + prd;    // Add result to sum
			t2 = t2 / 10;       // Remove last digit
		}

		// Check Armstrong condition
		if (n == sum)
			System.out.println(n + " is an Armstrong number");
		else
			System.out.println(n + " is not an Armstrong number");
	}
}
