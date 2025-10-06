package pattern;

/**
 * Program Name: P16
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 grid pattern where the content alternates
 * between **alphabets** and **numbers** for each row.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional logic based on row index
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize integer `p = 1` and character `c = 'A'`.
 * 2️⃣ The **outer loop (`j`)** controls the number of rows (4 total).
 * 3️⃣ The **inner loop (`i`)** controls the number of columns (4 per row).
 * 4️⃣ Use an `if` condition based on the **row index (`j`)**:
 *    - If `j` is even → print the character `c`.
 *    - If `j` is odd → print the number `p`.
 * 5️⃣ After each row, move to a new line.
 *
 * 🧮 Pattern Behavior:
 * - Even rows (0, 2, ...) display letters ('A').
 * - Odd rows (1, 3, ...) display numbers (1).
 *
 * 🖥️ Sample Output:
 * A A A A
 * 1 1 1 1
 * A A A A
 * 1 1 1 1
 */

public class P16 {
	public static void main(String[] args) {
		int p = 1;     // Number to print in odd rows
		char c = 'A';  // Character to print in even rows

		// Outer loop → controls the number of rows
		for (int j = 0; j < 4; j++) {

			// Inner loop → controls the number of columns
			for (int i = 0; i < 4; i++) {
				if (j % 2 == 0) {
					// Even rows → print alphabet
					System.out.print(c + " ");
				} else {
					// Odd rows → print number
					System.out.print(p + " ");
				}
			}

			// Move to next line after each row
			System.out.println();
		}
	}
}

/*
📘 OUTPUT:

A A A A
1 1 1 1
A A A A
1 1 1 1
*/
