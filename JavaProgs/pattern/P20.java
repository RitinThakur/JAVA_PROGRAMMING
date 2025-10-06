package pattern;

/**
 * Program Name: P20
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 5x5 pattern where only the **last row** contains asterisks (*)
 * and the remaining rows are spaces. Essentially, it prints a horizontal line of asterisks
 * at the bottom.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (5 rows)
 * 2️⃣ Inner loop (`j`) → controls columns (5 columns per row)
 * 3️⃣ Use condition `if (i == 4)`:
 *    - True → print "*"
 *    - False → print a space " "
 * 4️⃣ After printing each row, move to the next line using `System.out.println()`
 *
 * 🖥️ Sample Output:
 *
 *
 *
 *
 * *****
 */

public class P20 {
	public static void main(String[] args) {

		// Outer loop → rows
		for(int i = 0; i < 5; i++) {

			// Inner loop → columns
			for(int j = 0; j < 5; j++) {

				if(i == 4) {
					// Print asterisk in last row
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





*****
*/
