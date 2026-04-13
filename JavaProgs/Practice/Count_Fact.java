package Practice;

import java.util.Scanner;

public class Count_Fact {
	public static void main(String[] args) {

		// Create Scanner object for taking input from the user
		Scanner p = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.print("Enter a number: ");
		int n = p.nextInt();

		int c = 0; // Counter to count number of factors

		// Loop from 1 to n to check all possible divisors
		for (int a = 1; a <= n; a++) {

			// If 'a' divides 'n' completely, it is a factor
			if (n % a == 0)
				c++;
		}

		// Display total number of factors
		System.out.println("Factor count: " + c);
	}
}
