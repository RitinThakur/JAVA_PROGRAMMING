package pattern;

/**
 * Program Name: P11
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 pattern where each row contains
 * the same alphabet repeated across the columns.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Character data type increment
 * - Pattern printing using ASCII characters
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize a character variable `ch` with 'A'.
 * 2️⃣ Outer loop (`j = 1; j < 5; j++`) → controls the number of rows (4 rows total).
 * 3️⃣ Inner loop (`i = 1; i < 5; i++`) → prints the same character `ch` in each column.
 * 4️⃣ After completing one row, increment `ch` to the next alphabet (B, C, D...).
 * 5️⃣ Use `System.out.println()` to move to the next row.
 *
 * 💡 Key Idea:
 * The outer loop controls which letter is printed, while the inner loop controls
 * how many times it is repeated in each row.
 *
 * 🖥️ Output Example:
 * A A A A
 * B B B B
 * C C C C
 * D D D D
 */

public class P11 {
	public static void main(String[] args) {
		char ch = 'A'; // Initialize character to 'A'

		// Outer loop - controls the number of rows
		for (int j = 1; j < 5; j++) {

			// Inner loop - prints the same character across the row
			for (int i = 1; i < 5; i++) {
				System.out.print(ch + " "); // Print the current character
			}

			ch++; // Move to the next character (A → B → C → D)
			System.out.println(); // Move to the next line
		}
	}
}

/*
📘 SAMPLE OUTPUT:

A A A A
B B B B
C C C C
D D D D
*/
