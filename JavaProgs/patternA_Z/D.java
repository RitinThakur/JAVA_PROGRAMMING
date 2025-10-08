package patternA_Z;

public class D {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern (height and width)

		for (int i = 0; i < n; i++) { // Outer loop for rows
			for (int j = 0; j < n; j++) { // Inner loop for columns

				// Conditions to print '*'
				if (
						j == 0                                  // Left vertical line of 'D'
								|| (i == 0 && j <= n - 2)               // Top horizontal line (except the last column)
								|| (i == n - 1 && j <= n - 2)           // Bottom horizontal line (except the last column)
								|| (i <= n - 2 && j == n - 1 && i != 0) // Right vertical line (excluding top row)
				) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // Print spaces elsewhere
				}
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
