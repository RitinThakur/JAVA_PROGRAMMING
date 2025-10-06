package pattern;

/**
 * Program Name: P4
 * Package: pattern
 *
 * Description:
 * This program prints uppercase alphabets sequentially from 'A' to 'D'
 * on a single line, separated by spaces.
 *
 * Concept Used:
 * - Character data type and ASCII manipulation
 * - Incrementing character values using 'ch++'
 * - for loop and System.out.print() for inline output
 *
 * Explanation:
 * 1️⃣ Initialize a character variable `ch` with 'A'.
 * 2️⃣ Use a for loop that iterates from 1 to 4 (i.e., four times).
 * 3️⃣ In each iteration:
 *     - Print the current character.
 *     - Increment the character (`ch++`) to get the next alphabet.
 * 4️⃣ Since System.out.print() is used, all alphabets appear on the same line.
 *
 * Output:
 * A B C D
 */

public class P4 {
	public static void main(String[] args) {
		char ch = 'A'; // Starting character
		for (int i = 1; i < 5; i++) { // Loop runs 4 times
			System.out.print(ch + " "); // Print character followed by space
			ch++; // Move to next character in ASCII sequence
		}
	}
}

/*
📘 OUTPUT:
A B C D
*/
