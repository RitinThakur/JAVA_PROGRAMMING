package pattern;

/**
 * Program Name: P3
 * Package: pattern
 *
 * Description:
 * This program prints a sequence of numbers (1 to 4)
 * horizontally on the same line, separated by spaces.
 *
 * Concept Used:
 * - Simple for loop iteration
 * - System.out.print() to print values on the same line
 *
 * Explanation:
 * - The loop starts at j = 1 and runs until j = 4.
 * - Each iteration prints the current value of j followed by a space.
 * - Since System.out.print() is used, the output remains on one line.
 *
 * Output:
 * 1 2 3 4
 */

public class P3 {
	public static void main(String[] args) {
		// Loop runs from 1 to 4
		for (int j = 1; j <= 4; j++) {
			// Print current number followed by a space
			System.out.print(j + " ");
		}
	}
}

/*
📘 OUTPUT:
1 2 3 4
*/
