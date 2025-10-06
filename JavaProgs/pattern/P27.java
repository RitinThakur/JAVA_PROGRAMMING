package pattern;

/**
 * Program Name: P27
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints an **inverted right-angled triangle aligned to the left**
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
 *      - `i + j <= n - 1` → ensures stars are printed for columns where
 *        the sum of row and column indices is less than or equal to n-1
 * 4️⃣ Else → print space " " to shift stars properly
 * 5️⃣ After inner loop → move to the next row with `System.out.println()`
 *
 * 🖥️ Sample Output (n = 4):
 *
 * ****
 * ***
 * **
 * *
 */

public class P27 {
	public static void main(String[] args) {
		int n = 4; // Number of rows and columns

		// Outer loop → rows
		for (int i = 0; i < n; i++) {

			// Inner loop → columns
			for (int j = 0; j < n; j++) {

				// Print '*' if sum of row and column indices <= n-1
				if (i + j <= n - 1) {
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
