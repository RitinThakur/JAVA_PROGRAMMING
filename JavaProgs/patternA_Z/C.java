package patternA_Z; // Package to store all alphabet pattern programs

public class C {
	public static void main(String[] args) {
		int n = 5; // Defines the pattern size (5x5 grid)

		// Outer loop → controls the number of rows
		for (int i = 0; i < n; i++)
		{
			// Inner loop → controls the number of columns
			for (int j = 0; j < n; j++)
			{
				/*
				 * Logic to print the letter 'C':
				 *
				 * i == 0          → Top horizontal line
				 * i == n - 1      → Bottom horizontal line
				 * j == 0          → Left vertical line
				 *
				 * These three conditions together form the shape of 'C'.
				 * The right side is open to represent the curve of the letter.
				 */
				if (i == 0 || j == 0 || i == n - 1)
					System.out.print("* "); // Print star if condition is true
				else
					System.out.print("  "); // Print space elsewhere
			}

			// Move to the next line after printing each row
			System.out.println();
		}
	}
}
