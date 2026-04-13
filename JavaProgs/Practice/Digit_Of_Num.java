package Practice;

import java.util.Scanner;

public class Digit_Of_Num {
	public static void main(String[] args) {

		// Create Scanner object for user input
		Scanner p = new Scanner(System.in);

		// Ask user to enter a number
		System.out.println("Enter A Number:");
		int n = p.nextInt();

		int count = 0; // Variable to store digit count

		// Loop runs until all digits are removed
		while (n > 0) {
			count++;    // Increase count for each digit
			n = n / 10; // Remove the last digit
		}

		// Print the total number of digits
		System.out.println("Number of digits: " + count);
	}
}
