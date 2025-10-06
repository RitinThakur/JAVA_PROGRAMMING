package pattern;

/**
 * Program Name: P19
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 pattern where only the **first row** contains asterisks (*)
 * and the remaining rows are spaces. Essentially, it prints a horizontal line of asterisks
 * at the top.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional logic
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (4 rows)
 * 2️⃣ Inner loop (`j`) → controls columns (4 columns per row)
 * 3️⃣ Use condition `if (i == 0)`:
 *    - True → print "*"
 *    - False → print a space " "
 * 4️⃣ After printing each row, move to the next line using `System.out.println()`
 *
 * 🖥️ Sample Output:
 * ****
 *
 *
 *
 */

public class P19 {
	public static void main(String[] args) {

		// Outer loop → rows
		for(int i = 0; i < 4; i++) {

			// Inner loop → columns
			for(int j = 0; j < 4; j++) {

				if(i == 0) {
					// Print asterisk in first row
					System.out.print("*");
				} else {
					// Print space for other rows
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

****




*/
