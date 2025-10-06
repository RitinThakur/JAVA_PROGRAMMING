package pattern;

/**
 * Program Name: P28
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **right-angled triangle aligned to the right**
 * using asterisks (*).
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (0 to n-1)
 * 2️⃣ Inner loop (`j`) → controls columns (0 to n-1)
 * 3️⃣ Condition for printing '*':
 *      - `i + j >= n - 1` → ensures stars start from the right side,
 *        producing a right-aligned triangle
 * 4️⃣ Else → print space " " to create proper alignment
 * 5️⃣ After inner loop → move to the next row with `System.out.println()`
 *
 * 🖥️ Sample Output (n = 4):
 *
 *    *
 *   **
 *  ***
 * ****
 */

public class P28 {
	public static void main(String[] args) {
		int n = 4; // Number of rows and columns

		// Outer loop → rows
		for (int i = 0; i < n; i++) {

			// Inner loop → columns
			for (int j = 0; j < n; j++) {

				// Print '*' if sum of row and column indices >= n-1
				if (i + j >= n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// Move to next row
			System.out.println();
		}
	}
}
