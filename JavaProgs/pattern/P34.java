package pattern;

/**
 * Program Name: P34
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **left-aligned triangle pattern** where:
 * - Columns in each row alternate between numbers and characters.
 * - The placement depends on the **column index parity** (even or odd).
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Alternating sequences (numbers & characters)
 * - Character and integer manipulation
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → number of rows
 * 2️⃣ `a` → current number to print
 * 3️⃣ `ch` → current character to print
 * 4️⃣ Outer loop (`i`) → iterates through rows (0 to n-1)
 * 5️⃣ Inner loop (`j`) → iterates through columns (0 to n-1)
 * 6️⃣ `if(i >= j)` → ensures left-aligned triangle structure
 * 7️⃣ Inside triangle:
 *      - `if(j % 2 == 0)` → print a number in even columns
 *      - `else` → print a character in odd columns
 * 8️⃣ Else → print `" "` for proper alignment
 * 9️⃣ Increment `a` or `ch` after printing
 *
 * 🖥️ Sample Output (n = 4):
 *
 * 1
 * 2 A
 * 3 B 4
 * 5 C 6 D
 */
public class P34 {
	public static void main(String[] args) {
		int n = 4;    // Number of rows
		int a = 1;    // Starting number
		char ch = 'A'; // Starting character

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					if (j % 2 == 0) {
						System.out.print(a++ + " ");
					} else {
						System.out.print(ch++ + " ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
