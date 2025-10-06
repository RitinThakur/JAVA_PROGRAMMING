package pattern;

/**
 * Program Name: P41
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **mixed left-aligned decreasing pattern of characters and numbers**.
 * Characters are printed on even-numbered rows (0 and 2), and numbers on odd-numbered rows (1 and 3).
 * Each row has a decreasing number of elements, forming a triangular shape.
 *
 * 🧩 Concepts Used:
 * - Nested loops for rows (`i`) and columns (`j`)
 * - Conditional statements to differentiate character and number rows
 * - Character increment (`ch++`) and number increment (`a++`)
 * - Right-alignment handled by printing spaces when `i+j > n-1`
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates over rows (0 to n-1)
 * 2️⃣ Inner loop (`j`) → iterates over columns (0 to n-1)
 * 3️⃣ Conditional row logic:
 *    - If `i == 0` or `i == 2`, print letters starting from 'a' where `i+j <= n-1`
 *    - If `i == 1` or `i == 3`, print numbers starting from 1 where `i+j <= n-1`
 *    - Print spaces for positions where `i+j > n-1` to maintain alignment
 * 4️⃣ Reset `ch='a'` and `a=1` for each row
 * 5️⃣ `System.out.println()` moves to the next row
 *
 * 🖥️ Sample Output:
 * abcd
 * 123
 * ab
 * 1
 */
public class P41 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			char ch = 'a'; // Reset character for each row
			int a = 1;     // Reset number for each row
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == 2) {
					if (i + j <= n - 1) {
						System.out.print(ch++);
					} else {
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					if (i + j <= n - 1) {
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
