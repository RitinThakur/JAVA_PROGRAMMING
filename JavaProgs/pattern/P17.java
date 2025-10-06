package pattern;

/**
 * Program Name: P17
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a 4x4 grid where **even-indexed rows** contain
 * sequential alphabets and **odd-indexed rows** contain sequential numbers.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional logic using modulo operator
 * - Sequential increment of characters and integers
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize:
 *    - `p = 1` → for numbers
 *    - `c = 'A'` → for letters
 * 2️⃣ Outer loop (`j`) → controls rows (4 total)
 * 3️⃣ Inner loop (`i`) → controls columns (4 per row)
 * 4️⃣ Use condition `if (j % 2 == 0)`:
 *    - True → print alphabet (`c`) and increment it
 *    - False → print number (`p`) and increment it
 * 5️⃣ After each row, move to the next line using `System.out.println()`
 *
 * 🖥️ Sample Output:
 * A B C D
 * 1 2 3 4
 * E F G H
 * 5 6 7 8
 */

public class P17 {
	public static void main(String[] args) {
		int p = 1;       // Number sequence for odd rows
		char c = 'A';    // Alphabet sequence for even rows

		// Outer loop → rows
		for (int j = 0; j < 4; j++) {

			// Inner loop → columns
			for (int i = 0; i < 4; i++) {

				if (j % 2 == 0) {
					// Even rows → print letters
					System.out.print(c + " ");
					c++;
				} else {
					// Odd rows → print numbers
					System.out.print(p + " ");
					p++;
				}
			}

			// Move to next line after each row
			System.out.println();
		}
	}
}

/*
📘 OUTPUT:

A B C D
1 2 3 4
E F G H
5 6 7 8
*/
