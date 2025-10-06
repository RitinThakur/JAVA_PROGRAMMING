package pattern;

/**
 * Program Name: P15
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 grid pattern where each row contains
 * the **same number** repeated four times.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Incremental counting per row
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize an integer `p = 1`.
 * 2️⃣ The outer loop (`j`) controls the number of rows (4 total).
 * 3️⃣ The inner loop (`i`) controls the number of columns (4 per row).
 * 4️⃣ Inside the inner loop, print the current value of `p` (same for that row).
 * 5️⃣ After finishing one row, increment `p` by 1 for the next row.
 * 6️⃣ Print a new line after each row using `System.out.println()`.
 *
 * 🧮 Pattern Behavior:
 * - Each row prints the same number 4 times.
 * - The number increases by 1 in each subsequent row.
 *
 * 🖥️ Sample Output:
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4
 */

public class P15 {
	public static void main(String[] args) {
		int p = 1; // starting number

		// Outer loop → controls the number of rows
		for (int j = 0; j < 4; j++) {

			// Inner loop → controls the number of columns
			for (int i = 0; i < 4; i++) {
				System.out.print(p + " ");
			}

			// Move to next line after each row
			System.out.println();

			// Increment the number for the next row
			p++;
		}
	}
}

/*
📘 OUTPUT:

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
*/
