package pattern;

/**
 * Program Name: P32
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **left-aligned triangle pattern of characters**.
 * Each row contains the same character repeated equal to the row number.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Character manipulation
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → total number of rows
 * 2️⃣ `ch` → current character to print in the row
 * 3️⃣ Outer loop (`i`) → controls the rows (0 to n-1)
 * 4️⃣ Inner loop (`j`) → controls the columns (0 to n-1)
 * 5️⃣ Condition for printing character:
 *      - `if(i >= j)` → ensures characters are printed only for the first (i+1) positions in a row
 * 6️⃣ Else → print space `" "` for alignment
 * 7️⃣ After inner loop → move to next row with `System.out.println()`
 * 8️⃣ Increment `ch` after each row to print next character in the sequence
 *
 * 🖥️ Sample Output (n = 4):
 *
 * A
 * B B
 * C C C
 * D D D D
 */
public class P32 {
	public static void main(String[] args) {
		int n = 4;    // Number of rows
		char ch = 'A'; // Starting character

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print(ch + " ");
				} else {
					System.out.print(" ");
				}
			}
			ch++; // Move to next character
			System.out.println();
		}
	}
}
