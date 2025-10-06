package pattern;

/**
 * Program Name: P42
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **left-aligned decreasing triangular pattern** of numbers and characters.
 * Numbers are printed on even rows (0 and 2) and letters on odd rows (1 and 3).
 * The number of elements in each row decreases from top to bottom.
 *
 * 🧩 Concepts Used:
 * - Nested loops for rows (`i`) and columns (`j`)
 * - Conditional statements to differentiate rows for numbers and letters
 * - Incrementing numbers (`a++`) for numeric rows
 * - Printing a fixed character (`ch`) for letter rows
 * - Right-alignment handled by printing spaces where `i+j > n-1`
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates over rows (0 to n-1)
 * 2️⃣ Inner loop (`j`) → iterates over columns (0 to n-1)
 * 3️⃣ Row-wise logic:
 *    - Even rows (`i == 0` or `i == 2`): print numbers starting from 1, incrementing with each column
 *    - Odd rows (`i == 1` or `i == 3`): print the same character ('a') across the row
 *    - Print spaces when `i+j > n-1` to maintain triangular alignment
 * 4️⃣ Reset number (`a=1`) and character (`ch='a'`) for each row
 * 5️⃣ Move to next line after finishing a row
 *
 * 🖥️ Sample Output:
 * 1234
 * aaa
 * 12
 * a
 */
public class P42 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			char ch = 'a'; // Reset character for each row
			int a = 1;     // Reset number for each row
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == 2) {
					if (i + j <= n - 1) {
						System.out.print(a++);
					} else {
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					if (i + j <= n - 1) {
						System.out.print(ch);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(); // Move to next row
		}
	}
}
