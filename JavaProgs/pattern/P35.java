package pattern;

/**
 * Program Name: P35
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **double left-aligned triangle pattern** with a gap in between.
 * - Each row contains two triangles of asterisks (*) separated by spaces.
 * - The triangles grow in size row by row.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Left-aligned triangle pattern
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → number of rows
 * 2️⃣ Outer loop (`i`) → iterates through rows (0 to n-1)
 * 3️⃣ First inner loop (`j`) → prints the first left-aligned triangle:
 *      - `if(i >= j)` → print "*"
 *      - `else` → print space `" "`
 * 4️⃣ Second inner loop (`j`) → prints the second triangle next to the first:
 *      - Same logic as the first loop
 * 5️⃣ `System.out.println()` → moves to the next row
 *
 * 🖥️ Sample Output (n = 4):
 *
 * *   *
 * **  **
 * *** ***
 * ********
 */
public class P35 {
	public static void main(String[] args) {
		int n = 4;  // Number of rows

		for (int i = 0; i < n; i++) {
			// First triangle
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			// Second triangle
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println(); // Move to next row
		}
	}
}
