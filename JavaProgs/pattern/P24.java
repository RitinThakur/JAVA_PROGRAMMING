package pattern;

/**
 * Program Name: P24
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **4x4 hollow square pattern** using asterisks (*).
 * The border of the square is filled with '*', while the inside is empty (spaces).
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (0 to 3)
 * 2️⃣ Inner loop (`j`) → controls columns (0 to 3)
 * 3️⃣ Condition for printing '*' (border positions):
 *      - `i == 0` → first row
 *      - `i == 3` → last row
 *      - `j == 0` → first column
 *      - `j == 3` → last column
 * 4️⃣ Else → print space " " for inner hollow area
 * 5️⃣ Move to next row after inner loop with `System.out.println()`
 *
 * 🖥️ Sample Output:
 *
 * ****
 * *  *
 * *  *
 * ****
 */

public class P24 {
	public static void main(String[] args) {

		// Outer loop → rows
		for (int i = 0; i < 4; i++) {

			// Inner loop → columns
			for (int j = 0; j < 4; j++) {

				// Print '*' on border, space inside
				if (i == 0 || j == 0 || i == 3 || j == 3) {
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

/*
📘 OUTPUT:

****
*  *
*  *
****
*/
