package pattern;

import java.util.Scanner;

/**
 * Program Name: P5
 * Package: pattern
 *
 * Description:
 * This program prints a rectangular star pattern based on user input.
 * The number of rows and columns are provided by the user at runtime.
 *
 * Concept Used:
 * - Nested for loops (one for rows, one for columns)
 * - Taking user input using Scanner
 * - Printing patterns using System.out.print() and System.out.println()
 *
 * Explanation:
 * 1️⃣ The program asks the user for:
 *     - Number of rows (r)
 *     - Number of columns (c)
 * 2️⃣ Outer loop (`for(int i=0; i<r; i++)`) controls the number of rows.
 * 3️⃣ Inner loop (`for(int j=0; j<c; j++)`) controls the number of columns.
 * 4️⃣ Inside the inner loop, we print a star (`* `) without moving to a new line.
 * 5️⃣ After completing each row, `System.out.println()` is called to move to the next line.
 *
 * Output Example:
 * If user inputs:
 *      Enter Number of Rows: 5
 *      Enter Number of Columns: 5
 *
 * Then output will be:
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *      * * * * *
 */

public class P5 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Taking user input for rows and columns
		System.out.print("Enter Number of Rows: ");
		int r = p.nextInt();
		System.out.print("Enter Number of Columns: ");
		int c = p.nextInt();

		// Outer loop → controls number of rows
		for (int i = 0; i < r; i++) {

			// Inner loop → controls number of columns
			for (int j = 0; j < c; j++) {
				System.out.print("* "); // print star with space
			}

			System.out.println(); // move to next line after each row
		}
	}
}

/*
📘 SAMPLE OUTPUT:
Enter Number of Rows: 5
Enter Number of Columns: 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/
