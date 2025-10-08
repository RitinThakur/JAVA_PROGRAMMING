package patternA_Z; // Package name (you can organize all your pattern programs under this package)

public class A {
	public static void main(String[] args) {
		int n = 5; // Defines the size of the pattern (number of rows and columns)

		// Outer loop -> controls the number of rows
		for (int i = 0; i < n; i++)
		{
			// Inner loop -> controls the number of columns
			for (int j = 0; j < n; j++)
			{
				/*
				 * Logic to print the letter 'A' pattern:
				 *
				 * i == 0      → Top horizontal line of 'A'
				 * j == 0      → Left vertical line of 'A'
				 * j == n - 1  → Right vertical line of 'A'
				 * i == n / 2  → Middle horizontal line of 'A'
				 *
				 * The rest of the positions remain blank (spaces).
				 */
				if (i == 0 || j == 0 || i == n / 2 || j == n - 1)
					System.out.print("* "); // Print star where the condition is true
				else
					System.out.print("  "); // Print space otherwise
			}

			// Move to the next line after each row is printed
			System.out.println();
		}
	}
}
