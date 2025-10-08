package patternA_Z;

public class Y {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						(i <= n / 2 && i == j)        // Left upper diagonal
								|| (i <= n / 2 && i + j == n - 1) // Right upper diagonal
								|| (j == n / 2 && i >= n - 3) // Middle vertical line (stem) at bottom
				) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // Print space elsewhere
				}
			}
			System.out.println(); // Move to next row
		}
	}
}
