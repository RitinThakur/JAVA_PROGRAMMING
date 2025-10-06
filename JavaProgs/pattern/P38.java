package pattern;

/**
 * Program Name: P38
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **right-aligned triangular pattern** that alternates between
 * letters ('a') and numbers. The pattern depends on the sum of row and column indices.
 *
 * 🧩 Concepts Used:
 * - Nested loops for rows and columns
 * - Conditional statements to determine whether to print a number or a letter
 * - Right alignment using spaces
 * - Incrementing numbers and letters with `a++` and `ch++`
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates through rows (0 to 3)
 * 2️⃣ Inner loop (`j`) → iterates through columns (0 to 3)
 * 3️⃣ Row conditions:
 *    - `i == 0 || i == 2` → print letters ('a') when `i + j >= n-1`
 *    - `i == 1 || i == 3` → print numbers starting from 1 when `i + j >= n-1`
 * 4️⃣ `i + j >= n-1` → ensures right-aligned triangle
 * 5️⃣ `System.out.print(" ")` → print spaces before actual value for alignment
 * 6️⃣ `System.out.println()` → move to the next row
 *
 * 🖥️ Sample Output:
 *
 *    a
 *   12
 *  aaa
 * 3456
 */
public class P38 {
	public static void main(String[] args) {
		int n = 4;
		int a = 1;
		char ch = 'a';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == 2) {
					// Rows 0 and 2 → letters
					if (i + j >= n - 1) {
						System.out.print(ch);
					} else {
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					// Rows 1 and 3 → numbers
					if (i + j >= n - 1) {
						System.out.print(a++);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(); // Move to next row
		}
	}
}
