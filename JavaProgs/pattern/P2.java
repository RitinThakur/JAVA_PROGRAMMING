package pattern;

/**
 * Program Name: P2
 * Package: pattern
 *
 * Description:
 * This Java program prints a horizontal row of asterisks (*)
 * separated by spaces on a single line.
 *
 * Concept Used:
 * - For loop for fixed number of iterations
 * - System.out.print() (without newline)
 *
 * Key Difference from P1:
 * - Uses print() instead of println(), so all stars appear on the same line.
 *
 * Output:
 * * * * * *
 */

public class P2 {
	public static void main(String[] args) {

		// Loop runs 5 times (from 0 to 4)
		for (int j = 0; j <= 4; j++) {
			// Prints "*" and a space on the same line each time
			System.out.print("* ");
		}

	}
}

/*
📘 OUTPUT:
* * * * *
*/
