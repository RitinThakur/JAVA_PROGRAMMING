package pattern;

/**
 * Program Name: P26
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints an **inverted right-angled triangle** aligned to the right
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
 *      - `i <= j` → means print '*' when column index >= row index
 * 4️⃣ Else → print space " " to shift the stars to the right
 * 5️⃣ After inner loop → move to the next row with `System.out.println()`
 *
 * 🖥️ Sample Output:
 *
 * ****
 *  ***
 *   **
 *    *
 */

public class P26 {
	public static void main(String[] args) {
		int n = 4; // Number of rows and columns

		// Outer loop → rows
		for (int i = 0; i < n; i++) {

			// Inner loop → columns
			for (int j = 0; j < n; j++) {

				// Print '*' if column index >= row index
				if (i <= j) {
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
