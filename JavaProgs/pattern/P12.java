package pattern;

/**
 * Program Name: P12
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a pattern of odd numbers in a tabular form.
 * Each row contains 3 odd numbers, and the sequence continues across rows.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements (if-else)
 * - Odd number generation using modulo operator (%)
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Initialize a counter variable `c` to 1.
 * 2️⃣ The outer loop (`i = 1; i < 4; i++`) controls the number of rows (3 rows total).
 * 3️⃣ The inner loop (`j = 1; j < 7; j++`) iterates through values to print or skip even numbers.
 * 4️⃣ Inside the inner loop:
 *    - If `c` is odd (`c % 2 != 0`), print it.
 *    - If `c` is even, just increment `c` without printing.
 * 5️⃣ Use `System.out.println()` after each row to move to the next line.
 *
 * 💡 Formatting:
 *   - When `c` < 10, add an extra space for alignment.
 *   - Ensures that single-digit numbers align with two-digit numbers properly.
 *
 * 🖥️ Output Example:
 *  1  3  5
 *  7  9 11
 * 13 15 17
 */

public class P12 {
	public static void main(String[] args) {
		int c = 1; // Counter variable starting from 1

		// Outer loop controls number of rows
		for (int i = 1; i < 4; i++) {

			// Inner loop iterates to find and print odd numbers
			for (int j = 1; j < 7; j++) {
				if (c % 2 != 0) { // Check for odd number
					if (c < 10) {
						System.out.print(" " + c + " "); // Align single-digit numbers
						c++;
					} else {
						System.out.print(c + " ");
						c++;
					}
				} else {
					c++; // Skip even numbers
				}
			}
			System.out.println(); // Move to next line after each row
		}
	}
}

/*
📘 SAMPLE OUTPUT:

 1  3  5
 7  9 11
13 15 17
*/
