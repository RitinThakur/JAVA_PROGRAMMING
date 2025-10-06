package pattern;

/**
 * Program Name: P31
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints numbers in a **left-aligned triangle pattern**.
 * Unlike P30, each row contains the same number repeated equal to the row number.
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Incrementing a counter variable after each row
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → total number of rows
 * 2️⃣ Outer loop (`i`) → controls the rows (0 to n-1)
 * 3️⃣ Inner loop (`j`) → controls the columns (0 to n-1)
 * 4️⃣ `a` → current number to print in the row, incremented after each row
 * 5️⃣ Condition for printing number:
 *      - `if(i >= j)` → ensures numbers are printed only for the first (i+1) positions in a row
 * 6️⃣ Else → print space `" "` for alignment
 * 7️⃣ After inner loop → move to next row with `System.out.println()`
 *
 * 🖥️ Sample Output (n = 4):
 *
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 */
public class P31 {
	public static void main(String[] args) {
		int n = 4; // Number of rows
		int a = 1; // Number to print in the row

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print(a + " ");
				} else {
					System.out.print(" ");
				}
			}
			a++; // Increase number for next row
			System.out.println();
		}
	}
}
