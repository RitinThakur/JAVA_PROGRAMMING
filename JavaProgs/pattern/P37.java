package pattern;

/**
 * Program Name: P37
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **mixed number and letter right-aligned triangular pattern**.
 * Pattern alternates between numbers and lowercase letters in specific rows:
 *
 * Row 0 → numbers starting from 1
 * Row 1 → letters starting from 'a'
 * Row 2 → numbers continuing from previous numbers
 * Row 3 → letters continuing from previous letters
 *
 * 🧩 Concepts Used:
 * - Nested loops for rows and columns
 * - Conditional statements to decide numbers or letters
 * - Right-alignment using spaces (`" "`)
 *
 * 🧠 Logic Explanation:
 * 1️⃣ Outer loop (`i`) → iterates through rows (0 to 3)
 * 2️⃣ Inner loop (`j`) → iterates through columns (0 to 3)
 * 3️⃣ Row conditions:
 *    - `i == 0 || i == 2` → print numbers starting from 1
 *    - `i == 1 || i == 3` → print letters starting from 'a'
 * 4️⃣ `if(i <= j)` → ensures right-aligned triangle (spaces printed before actual value)
 * 5️⃣ `a++` and `ch++` → increment numbers and letters respectively
 * 6️⃣ `System.out.println()` → moves to the next row
 *
 * 🖥️ Sample Output:
 *
 * 1234
 *  abc
 *   56
 *    d
 */
public class P37 {
	public static void main(String[] args) {
		int n = 4;
		int a = 1;
		char ch = 'a';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == 2) {
					// Rows 0 and 2 → numbers
					if (i <= j) {
						System.out.print(a++);
					} else {
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					// Rows 1 and 3 → letters
					if (i <= j) {
						System.out.print(ch++);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(); // Move to next row
		}
	}
}
