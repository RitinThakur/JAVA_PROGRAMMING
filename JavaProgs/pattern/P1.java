package pattern;

/**
 * Program Name: P1
 * Package: pattern
 *
 * Description:
 * This simple Java program prints a vertical line pattern of asterisks (*)
 * using a single for-loop. It demonstrates the basic use of loops
 * for repetitive printing in console output.
 *
 * Concept Used:
 * - For loop iteration
 * - Console output using System.out.println()
 *
 * Output:
 * Each iteration prints one '*' symbol on a new line.
 *
 * Example Output:
 * *
 * *
 * *
 * *
 * *
 */

public class P1 {
	public static void main(String[] args) {

		// Loop runs 5 times (from 0 to 4)
		for (int j = 0; j <= 4; j++) {
			// Prints one '*' followed by a new line each time
			System.out.println("*");
		}

	}
}

/*
 📘 OUTPUT:
    *
    *
    *
    *
    *
 */
