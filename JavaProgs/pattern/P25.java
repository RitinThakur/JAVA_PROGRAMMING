package pattern;

/**
 * Program Name: P25
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **right-angled triangle pattern** with asterisks (*)
 * aligned to the left.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (0 to 3)
 * 2️⃣ Inner loop (`j`) → controls columns (0 to 3)
 * 3️⃣ Condition for printing '*':
 *      - `i >= j` → means print '*' for positions where row index >= column index
 * 4️⃣ Else → print space " " to maintain triangle shape
 * 5️⃣ After inner loop → move to the next row with `System.out.println()`
 *
 * 🖥️ Sample Output:
 *
 * *
 * **
 * ***
 * ****
 */

public class P25 {
	public static void main(String[] args) {

		// Outer loop → rows
		for (int i = 0; i < 4; i++) {

			// Inner loop → columns
			for (int j = 0; j < 4; j++) {

				// Print '*' if column index <= row index
				if (i >= j) {
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
