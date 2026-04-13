package Practice;

import java.util.Scanner;

public class Amstr_Num_method {
	public static void main(String[] args) {

		// Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Ask user to enter a number
		System.out.print("Enter a number: ");
		int n = p.nextInt();

		// Call the amStr() method and print the result
		System.out.println(amStr(n));
	}

	// Method to check if a number is an Armstrong number
	public static String amStr(int n) {

		int pr = 0;  // To count number of digits
		int t = n;   // Temporary variable for digit count
		int t2 = n;  // Temporary variable for calculation
		int sum = 0; // Sum of digits raised to power 'pr'
		int d = 0;   // To store each digit

		// Count number of digits
		while (t > 0) {
			pr++;
			t = t / 10;
		}

		// Calculate sum of each digit raised to the power 'pr'
		while (t2 > 0) {
			int prd = 1;     // To store digit raised to power 'pr'
			d = t2 % 10;     // Extract last digit

			// Raise digit 'd' to the power 'pr'
			for (int i = 1; i <= pr; i++) {
				prd = prd * d;
			}

			sum = sum + prd; // Add to total sum
			t2 = t2 / 10;    // Remove last digit from number
		}

		// Check if sum matches original number
		if (n == sum)
			return n + " is an Armstrong number";
		else
			return n + " is not an Armstrong number";
	}
}
