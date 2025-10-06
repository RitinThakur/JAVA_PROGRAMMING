package pattern;

/**
 * Program Name: P14
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **4x4 pattern** where each row alternates between
 * a **character (A, B, C, …)** and a **number (1, 2, 3, …)** in alternating columns.
 *
 * Unlike P13, the same character and number repeat across each row.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Character and integer manipulation
 * - Conditional logic for alternating pattern
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize two counters:
 *     - `char c = 'A'` → starts with letter A.
 *     - `int p = 1` → starts with number 1.
 * 2️⃣ Outer loop (`j`) → handles rows (4 total).
 * 3️⃣ Inner loop (`i`) → handles columns (4 per row).
 * 4️⃣ Inside the inner loop:
 *     - If column index is even (`i % 2 == 0`), print the character.
 *     - If column index is odd, print the number.
 * 5️⃣ After completing a row:
 *     - Increment both `c` and `p` to update for next row.
 *     - Move to the next line using `System.out.println()`.
 *
 * 🧮 Pattern Behavior:
 *  - Characters and numbers remain the same for all 4 columns of each row.
 *  - Both increase by 1 for the next row.
 *
 * 🖥️ Sample Output:
 * A 1 A 1
 * B 2 B 2
 * C 3 C 3
 * D 4 D 4
 */

public class P14 {
	public static void main(String[] args) {
		int p = 1;     // Number counter
		char c = 'A';  // Character counter

		// Outer loop → controls the number of rows
		for (int j = 0; j < 4; j++) {

			// Inner loop → controls the number of columns
			for (int i = 0; i < 4; i++) {
				if (i % 2 == 0) {
					// Even index → print character
					System.out.print(c + " ");
				} else {
					// Odd index → print number
					System.out.print(p + " ");
				}
			}

			// Move to next row
			System.out.println();

			// Increment both after each row
			c++; // next character (A → B → C → D)
			p++; // next number (1 → 2 → 3 → 4)
		}
	}
}

/*
📘 OUTPUT:

A 1 A 1 
B 2 B 2 
C 3 C 3 
D 4 D 4 
*/
