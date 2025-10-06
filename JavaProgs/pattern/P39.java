package pattern;

/**
 * Program Name: P39
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **right-aligned decreasing triangle pattern of numbers**.
 * Each row contains the same number repeated, starting from 1 in the first row,
 * then incrementing by 1 in each subsequent row.
 *
 * 🧩 Concepts Used:
 * - Nested loops for rows (`i`) and columns (`j`)
 * - Conditional statement (`i <= j`) for right alignment
 * - Incrementing numbers per row
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates over rows (0 to n-1)
 * 2️⃣ Inner loop (`j`) → iterates over columns (0 to n-1)
 * 3️⃣ Condition `if(i <= j)`:
 *    - Ensures that numbers are printed in a right-aligned fashion
 *    - Spaces are printed when `i > j`
 * 4️⃣ `a++` after each row → next row prints the next number
 * 5️⃣ `System.out.println()` → moves to the next row
 *
 * 🖥️ Sample Output:
 *
 * 1111
 *  222
 *   33
 *    4
 */
public class P39 {
	public static void main(String[] args) {
		int n = 4;
		int a = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j) {
					System.out.print(a);
				} else {
					System.out.print(" ");
				}
			}
			a++; // Increment the number for next row
			System.out.println(); // Move to next row
		}
	}
}
