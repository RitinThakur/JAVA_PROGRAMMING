package Array;

import java.util.Scanner;

public class Occurance_of_Each_Char {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Take input string from user
		System.out.print("Enter the string: ");
		String str = p.nextLine();

		// Convert string to lowercase to make counting case-insensitive
		String str2 = str.toLowerCase();

		// Convert string to character array
		char[] ch2 = str2.toCharArray();

		// Boolean array to keep track of already counted characters
		boolean[] b2 = new boolean[ch2.length];

		// Loop through each character of the array
		for (int i = 0; i < ch2.length; i++) {

			// Check if character is already counted
			if (b2[i] == false) {
				int c = 1; // Initialize count for current character

				// Compare current character with all remaining characters
				for (int j = i + 1; j < ch2.length; j++) {
					if (ch2[j] == ch2[i]) {
						c++;        // Increment count if same character found
						b2[j] = true; // Mark as counted
					}
				}

				// Print the character and its frequency
				System.out.println(ch2[i] + " : " + c);
			}
		}

		// Close Scanner object
		p.close();
	}
}
