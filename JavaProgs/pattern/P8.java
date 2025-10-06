package pattern;

/**
 * Program Name: P8
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints all even numbers in a structured grid pattern.
 * It skips odd numbers and prints only even numbers in sequence.
 *
 * 🧩 Concept Used:
 * - Nested for loops (for rows and columns)
 * - Conditional logic (to check even numbers)
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize integer variable `c = 1` (counter starts from 1).
 * 2️⃣ Outer loop (`i = 1; i < 4; i++`) → runs 3 times (for 3 rows).
 * 3️⃣ Inner loop (`j = 1; j < 9; j++`) → iterates through numbers for each row.
 * 4️⃣ Inside the loop:
 *    - If `c` is even (`c % 2 == 0`), print it.
 *    - If `c` < 10, print with extra spacing for alignment.
 *    - Increment `c` after every check to move to the next number.
 * 5️⃣ Print a newline after each row for proper formatting.
 *
 * 💡 Note:
 * The program continuously increments `c` but only displays even values, forming a clean grid of even numbers.
 *
 * 🖥️ Output Example:
 *  2  4  6  8
 * 10 12 14 16
 * 18 20 22 24
 */

public class P8 {
	public static void main(String[] args) {
		int c = 1; // number counter

		// Outer loop → controls number of rows
		for (int i = 1; i < 4; i++) {

			// Inner loop → controls numbers in each row
			for (int j = 1; j < 9; j++) {

				// Print only even numbers
				if (c % 2 == 0) {
					if (c < 10) {
						System.out.print(" " + c + " ");
					} else {
						System.out.print(c + " ");
					}
				}
				c++; // increment counter
			}
			System.out.println(); // move to next line after each row
		}
	}
}

/*
📘 SAMPLE OUTPUT:

 2  4  6  8
10 12 14 16
18 20 22 24
*/
