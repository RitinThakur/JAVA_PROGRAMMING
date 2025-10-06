package pattern;

/**
 * Program Name: P29
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints numbers in a **left-aligned triangle pattern**.
 * Each row starts at the left and increases the number of elements by 1 per row.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Incrementing a counter variable
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → total number of rows
 * 2️⃣ `a` → counter for numbers starting at 1
 * 3️⃣ Outer loop (`i`) → controls rows
 * 4️⃣ Inner loop (`j`) → controls columns
 * 5️⃣ Condition for printing number:
 *      - `if(i >= j)` → ensures numbers are printed only for the first (i+1) positions in a row
 * 6️⃣ Else → print space `" "` for alignment
 * 7️⃣ After inner loop → move to next row with `System.out.println()`
 *
 * 🖥️ Sample Output (n = 4):
 *
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class P29 {
	public static void main(String[] args) {
		int n = 4;  // Number of rows
		int a = 1;  // Counter for numbers

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print(a++ + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
