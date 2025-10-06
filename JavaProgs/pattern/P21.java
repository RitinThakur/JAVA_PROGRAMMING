package pattern;

/**
 * Program Name: P21
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 pattern where only the **last column** contains asterisks (*)
 * and the remaining columns are spaces. Essentially, it prints a **vertical line** of asterisks
 * on the right side.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (4 rows)
 * 2️⃣ Inner loop (`j`) → controls columns (4 columns per row)
 * 3️⃣ Use condition `if (j == 3)`:
 *    - True → print "*"
 *    - False → print a space " "
 * 4️⃣ After printing each row, move to the next line using `System.out.println()`
 *
 * 🖥️ Sample Output:
 *
 *    *
 *    *
 *    *
 *    *
 */

public class P21 {
	public static void main(String[] args) {

		// Outer loop → rows
		for(int i = 0; i < 4; i++) {

			// Inner loop → columns
			for(int j = 0; j < 4; j++) {

				if(j == 3) {
					// Print asterisk in last column
					System.out.print("*");
				} else {
					// Print space for other columns
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

   *
   *
   *
   *
*/
