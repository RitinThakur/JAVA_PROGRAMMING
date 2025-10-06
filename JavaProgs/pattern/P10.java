package pattern;

/**
 * Program Name: P10
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 pattern of alphabets where each row contains
 * the same sequence of characters: A B C D.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Character data type manipulation
 * - Pattern generation using ASCII sequence
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`j = 1; j < 5; j++`) → controls the number of rows (4 rows total).
 * 2️⃣ For each row, we initialize `char ch = 'A'` to start from 'A' again.
 * 3️⃣ Inner loop (`i = 1; i < 5; i++`) → prints characters from 'A' to 'D'.
 * 4️⃣ After each inner loop, a newline (`System.out.println()`) moves to the next row.
 *
 * 💡 Key Idea:
 * Resetting `ch = 'A'` inside the outer loop ensures that each row starts from 'A' again.
 *
 * 🖥️ Output Example:
 * A B C D
 * A B C D
 * A B C D
 * A B C D
 */

public class P10 {
	public static void main(String[] args) {
		// Outer loop - controls the number of rows
		for (int j = 1; j < 5; j++) {
			char ch = 'A';  // Reset character to 'A' for each new row

			// Inner loop - prints alphabets from A to D
			for (int i = 1; i < 5; i++) {
				System.out.print(ch + " ");
				ch++; // Move to the next character
			}

			// Move to the next line after printing one row
			System.out.println();
		}
	}
}

/*
📘 SAMPLE OUTPUT:

A B C D
A B C D
A B C D
A B C D
*/
