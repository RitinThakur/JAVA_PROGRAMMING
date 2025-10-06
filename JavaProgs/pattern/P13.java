package pattern;

/**
 * Program Name: P13
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a pattern where **characters (A, B, C, …)** and **numbers (1, 2, 3, …)**
 * alternate column-wise in a 4×4 grid format.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Character and integer manipulation
 * - Conditional logic to alternate characters and numbers
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Two variables are initialized:
 *      - `char c = 'A'` → to print letters.
 *      - `int p = 1` → to print numbers.
 * 2️⃣ Outer loop (`j = 0; j < 4; j++`) → controls rows.
 * 3️⃣ Inner loop (`i = 0; i < 4; i++`) → controls columns.
 * 4️⃣ Inside the inner loop:
 *      - If column index `i` is even (`i % 2 == 0`), print a letter.
 *      - If column index `i` is odd, print a number.
 * 5️⃣ After each inner loop, `System.out.println()` is called to move to a new row.
 *
 * 🧮 Pattern Behavior:
 *  - Characters and numbers increase sequentially across the grid.
 *  - The pattern alternates between letters and numbers in each column.
 *
 * 🖥️ Sample Output:
 * A 1 B 2
 * C 3 D 4
 * E 5 F 6
 * G 7 H 8
 */

public class P13 {
	public static void main(String[] args) {
		int p = 1;      // Initialize number counter
		char c = 'A';   // Initialize character counter

		// Outer loop controls number of rows
		for (int j = 0; j < 4; j++) {

			// Inner loop controls number of columns
			for (int i = 0; i < 4; i++) {
				if (i % 2 == 0) {
					// Print character for even column index
					System.out.print(c + " ");
					c++;
				} else {
					// Print number for odd column index
					System.out.print(p + " ");
					p++;
				}
			}
			System.out.println(); // Move to next line after each row
		}
	}
}

/*
📘 OUTPUT:

A 1 B 2
C 3 D 4
E 5 F 6
G 7 H 8
*/
