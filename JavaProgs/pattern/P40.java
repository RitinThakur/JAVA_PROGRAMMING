package pattern;

/**
 * Program Name: P40
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **mixed right-aligned pattern of characters and numbers**.
 * The pattern alternates between characters and numbers in successive rows,
 * forming a right-aligned triangle-like structure.
 *
 * 🧩 Concepts Used:
 * - Nested loops for rows (`i`) and columns (`j`)
 * - Conditional statements to differentiate between character and number rows
 * - Character increment (`ch++`) and number usage (`a`)
 * - Right-alignment using spaces when `i > j`
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates over rows (0 to n-1)
 * 2️⃣ Inner loop (`j`) → iterates over columns (0 to n-1)
 * 3️⃣ Conditional row logic:
 *    - If `i==0` or `i==2`, print letters starting from 'a' where `i <= j`
 *    - If `i==1` or `i==3`, print numbers starting from 1 where `i <= j`
 *    - Print space for other positions (`i > j`) to maintain alignment
 * 4️⃣ Reset `ch='a'` for each row that prints characters
 * 5️⃣ `System.out.println()` moves to the next row
 *
 * 🖥️ Sample Output:
 * abcd
 *  111
 *   ab
 *    1
 */
public class P40 {
	public static void main(String[] args) {
		int n = 4;
		int a = 1;

		for (int i = 0; i < n; i++) {
			char ch = 'a'; // Reset character for each row
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == 2) {
					if (i <= j) {
						System.out.print(ch++);
					} else {
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					if (i <= j) {
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
