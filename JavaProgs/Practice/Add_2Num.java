package Practice;

import java.util.Scanner;

public class Add_2Num {
	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
		Scanner S = new Scanner(System.in);

		// Ask user for the first number
		System.out.print("Enter 1st num: ");
		int a = S.nextInt();   // Read first number

		// Ask user for the second number
		System.out.print("Enter 2nd num: ");
		int b = S.nextInt();   // Read second number

		// Display the sum of the two numbers
		System.out.println("Addition: " + (a + b));
	}
}
