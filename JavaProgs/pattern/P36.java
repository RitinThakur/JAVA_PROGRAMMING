package pattern;

/**
 * Program Name: P36
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **mixed pattern of letters and numbers** in a 4x4 grid:
 * - Row 0 → lowercase letters starting from 'a'
 * - Row 1 → all 1's
 * - Row 2 → consecutive letters starting from 'b'
 * - Row 3 → all 2's
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Character and integer printing
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates through rows (0 to 3)
 * 2️⃣ Inner loop (`j`) → iterates through columns (0 to 3)
 * 3️⃣ Conditions per row:
 *    - `i == 0 || i == 2` → print letters (`ch++`) for first and third rows
 *    - `i == 1` → print number 1 repeatedly
 *    - `i == 3` → print number 2 repeatedly
 * 4️⃣ `if(i >= j)` → ensures left-aligned triangle shape
 * 5️⃣ `System.out.println()` → moves to the next row
 *
 * 🖥️ Sample Output:
 *
 * a
 * 11
 * bcd
 * 2222
 */
public class P36 {
	public static void main(String[] args) {
		char ch = 'a';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 || i == 2) {
					// Rows 0 and 2 → letters
					if (i >= j) {
						System.out.print(ch++);
					} else {
						System.out.print(" ");
					}
				} else if (i == 1) {
					// Row 1 → all 1's
					int a = 1;
					if (i >= j) {
						System.out.print(a);
					} else {
						System.out.print(" ");
					}
				} else if (i == 3) {
					// Row 3 → all 2's
					int a = 2;
					if (i >= j) {
						System.out.print(a);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(); // Move to next row
		}
	}
}
