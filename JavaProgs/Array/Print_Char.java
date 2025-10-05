package Array;

import java.util.Scanner;

public class Print_Char {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of character array
		System.out.print("Enter size of arr: ");
		int n = p.nextInt();

		char[] a = new char[n]; // Array to store characters

		// Step 2: Accept characters from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter char: ");
			a[i] = p.next().charAt(0); // Take first character of user input
		}

		System.out.println();

		// Step 3: Display all entered characters
		System.out.println("Values entered: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Step 4: Close scanner
		p.close();
	}
}
