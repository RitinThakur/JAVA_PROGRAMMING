package pattern;

/**
 * Program Name: P9
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 number pattern where each row contains
 * numbers from 1 to 4.
 *
 * 🧩 Concept Used:
 * - Nested loops
 * - Simple number sequence printing
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i = 1; i <= 4; i++`) → controls the number of rows.
 * 2️⃣ Inner loop (`j = 1; j <= 4; j++`) → prints numbers from 1 to 4 for each row.
 * 3️⃣ After completing one row, the program prints a newline to move to the next row.
 *
 * 💡 Note:
 * The inner loop restarts from `1` each time the outer loop runs,
 * resulting in the same sequence (1 2 3 4) repeated for each row.
 *
 * 🖥️ Output Example:
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 */

public class P9 {
	public static void main(String[] args) {
		// Outer loop → controls number of rows
		for (int i = 1; i <= 4; i++) {
			// Inner loop → prints numbers in each row
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}

/*
📘 SAMPLE OUTPUT:

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
*/
