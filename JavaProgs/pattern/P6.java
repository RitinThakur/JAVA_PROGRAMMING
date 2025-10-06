package pattern;

/**
 * Program Name: P6
 * Package: pattern
 *
 * Description:
 * This program prints a sequential number grid pattern.
 * Numbers start from 1 and increase row-wise across a fixed number of rows and columns.
 *
 * Concept Used:
 * - Nested for loops (outer loop for rows, inner loop for columns)
 * - Conditional formatting for single-digit numbers to align output
 *
 * Explanation:
 * 1️⃣ Initialize a counter `c = 1` to keep track of the numbers being printed.
 * 2️⃣ Outer loop (`for(int i=1; i<5; i++)`) → controls rows (4 rows in total).
 * 3️⃣ Inner loop (`for(int j=1; j<5; j++)`) → controls columns (4 columns per row).
 * 4️⃣ If the number is less than 10, print an extra space to align single-digit numbers with double-digit numbers.
 * 5️⃣ Increment the counter `c` after printing each number.
 * 6️⃣ After each row, print a newline using `System.out.println()` to move to the next row.
 *
 * Output Example:
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * 13 14 15 16
 */

public class P6 {
	public static void main(String[] args) {
		int c = 1; // counter for numbers

		// Outer loop → number of rows
		for (int i = 1; i < 5; i++) {

			// Inner loop → number of columns
			for (int j = 1; j < 5; j++) {

				// Conditional formatting for single-digit numbers
				if (c < 10) {
					System.out.print(" " + c + " ");
				} else {
					System.out.print(c + " ");
				}

				c++; // increment counter
			}

			System.out.println(); // move to next row
		}
	}
}

/*
📘 SAMPLE OUTPUT:

1  2  3  4
5  6  7  8
9 10 11 12
13 14 15 16
*/
