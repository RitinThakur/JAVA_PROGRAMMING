package pattern;

/**
 * Program Name: P7
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a sequential alphabet pattern in a 4×4 grid format.
 * The letters start from 'A' and continue in order (A–P).
 *
 * 🧩 Concept Used:
 * - Nested for loops (outer loop → rows, inner loop → columns)
 * - Character manipulation using ASCII sequence
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize a character variable `c = 'A'`.
 * 2️⃣ Outer loop (`for (int i=1; i<5; i++)`) → controls the number of rows (4 rows total).
 * 3️⃣ Inner loop (`for (int j=1; j<5; j++)`) → controls the number of columns (4 per row).
 * 4️⃣ Print the current character, then increment it (`c++`) to get the next alphabet.
 * 5️⃣ After completing each row, print a newline using `System.out.println()`.
 *
 * 💡 Note:
 * Characters in Java can be incremented just like numbers because they are internally represented by ASCII/Unicode values.
 *
 * 🖥️ Output Example:
 * A B C D
 * E F G H
 * I J K L
 * M N O P
 */

public class P7 {
	public static void main(String[] args) {
		char c = 'A'; // starting alphabet

		// Outer loop → controls rows
		for (int i = 1; i < 5; i++) {

			// Inner loop → controls columns
			for (int j = 1; j < 5; j++) {
				System.out.print(c + " ");
				c++; // move to next alphabet
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

/*
📘 SAMPLE OUTPUT:

A B C D
E F G H
I J K L
M N O P
*/
