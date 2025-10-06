package pattern;

/**
 * Program Name: P18
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 pattern where only the **first column** contains
 * an asterisk (*) and the remaining columns are spaces. Essentially, it prints
 * a vertical line of asterisks on the left side.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional logic
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (4 rows)
 * 2️⃣ Inner loop (`j`) → controls columns (4 columns per row)
 * 3️⃣ Use condition `if (j == 0)`:
 *    - True → print "*"
 *    - False → print a space " "
 * 4️⃣ After printing each row, move to the next line using `System.out.println()`
 *
 * 🖥️ Sample Output:
 * *
 * *
 * *
 * *
 */

public class P18 {
	public static void main(String[] args) {

		// Outer loop → rows
		for(int i = 0; i < 4; i++) {

			// Inner loop → columns
			for(int j = 0; j < 4; j++) {

				if(j == 0) {
					// Print asterisk in first column
					System.out.print("*");
				} else {
					// Print space for other columns
					System.out.print(" ");
				}
			}

			// Move to next line after each row
			System.out.println();
		}
	}
}

/*
📘 OUTPUT:

*
*
*
*
*/
