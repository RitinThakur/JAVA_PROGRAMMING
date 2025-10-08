package patternA_Z; // Package to organize all pattern programs (A–Z)

public class B {
	public static void main(String[] args) {
		int n = 5; // Defines the size of the pattern (5x5 grid)

		// Outer loop → controls the number of rows
		for (int i = 0; i < n; i++)
		{
			// Inner loop → controls the number of columns
			for (int j = 0; j < n; j++)
			{
				/*
				 * Logic to print the letter 'B':
				 *
				 * j == 0                          → Left vertical line of 'B'
				 * i == 0 && j <= n-2              → Top horizontal line
				 * i == n-1 && j <= n-2            → Bottom horizontal line
				 * i == n/2 && j <= n-2            → Middle horizontal line
				 * i == n-2 && j == n-1            → Bottom-right curve of 'B'
				 * i == n-4 && j == n-1            → Top-right curve of 'B'
				 *
				 * Together, these conditions form a block-style 'B' shape.
				 */
				if (j == 0 ||
						(i == n - 1 && j <= n - 2) ||
						(i == 0 && j <= n - 2) ||
						(i == n / 2 && j <= n - 2) ||
						(i == n - 2 && j == n - 1) ||
						(i == n - 4 && j == n - 1))
				{
					System.out.print("* "); // Print star where the condition matches
				}
				else
				{
					System.out.print("  "); // Print space elsewhere
				}
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}
