package pattern;

/**
 * Program Name: P30
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints numbers in a **left-aligned triangle pattern**.
 * Each row starts with 1 and increases sequentially up to the row number.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Incrementing a counter variable inside the inner loop
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → total number of rows
 * 2️⃣ Outer loop (`i`) → controls the rows (0 to n-1)
 * 3️⃣ Inner loop (`j`) → controls the columns (0 to n-1)
 * 4️⃣ `a` → a local counter variable for each row starting at 1
 * 5️⃣ Condition for printing number:
 *      - `if(i >= j)` → ensures numbers are printed only for the first (i+1) positions in a row
 * 6️⃣ Else → print space `" "` for alignment
 * 7️⃣ After inner loop → move to next row with `System.out.println()`
 *
 * 🖥️ Sample Output (n = 4):
 *
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */
public class P30 {
	public static void main(String[] args) {
		int n = 4; // Number of rows

		for (int i = 0; i < n; i++) {
			int a = 1; // Local counter for each row
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
