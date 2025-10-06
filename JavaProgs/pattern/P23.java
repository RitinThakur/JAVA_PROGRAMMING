package pattern;

/**
 * Program Name: P23
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 diagonal pattern of asterisks (*),
 * where the asterisks appear from the **top-right to the bottom-left**.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → controls rows (0 to 3)
 * 2️⃣ Inner loop (`j`) → controls columns (0 to 3)
 * 3️⃣ Use condition `if (i + j == 3)`:
 *    - True → print "*"
 *    - False → print a space " "
 * 4️⃣ After printing each row, move to the next line using `System.out.println()`
 *
 * 🖥️ Sample Output:
 *
 *    *
 *   *
 *  *
 * *
 */

public class P23 {
	public static void main(String[] args) {

		// Outer loop → rows
		for (int i = 0; i < 4; i++) {

			// Inner loop → columns
			for (int j = 0; j < 4; j++) {

				if (i + j == 3) {
					// Print asterisk on the reverse diagonal
					System.out.print("*");
				} else {
					// Print space for other positions
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
