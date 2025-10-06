package pattern;

/**
 * Program Name: P33
 * Package: pattern
 *
 * 🎯 Description:
 * This program prints a **left-aligned triangle pattern** where:
 * - Even rows (0,2,...) contain **numbers in sequence**
 * - Odd rows (1,3,...) contain **characters in sequence**
 *
 * 🧩 Concepts Used:
 * - Nested loops
 * - Conditional statements
 * - Alternating sequences (numbers & characters)
 * - Character and integer manipulation
 *
 * 🧠 Logic Explanation:
 * 1️⃣ `n` → number of rows
 * 2️⃣ `a` → current number to print in numeric rows
 * 3️⃣ `ch` → current character to print in character rows
 * 4️⃣ Outer loop (`i`) → controls the rows (0 to n-1)
 * 5️⃣ Inner loop (`j`) → controls columns (0 to n-1)
 * 6️⃣ Condition to print:
 *      - `if(i >= j)` → ensures left-aligned triangle structure
 *      - Inside that:
 *          - `if(i % 2 == 0)` → print numbers for even rows
 *          - `else` → print characters for odd rows
 * 7️⃣ Else → print space `" "` for alignment
 * 8️⃣ Increment `a` or `ch` appropriately after printing
 *
 * 🖥️ Sample Output (n = 4):
 *
 * 1
 * A B
 * 2 3 4
 * C D E F
 */
public class P33 {
	public static void main(String[] args) {
		int n = 4;    // Number of rows
		int a = 1;    // Starting number
		char ch = 'A'; // Starting character

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					if (i % 2 == 0) {
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
