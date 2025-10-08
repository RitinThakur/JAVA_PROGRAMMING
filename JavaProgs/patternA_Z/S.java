package patternA_Z;

public class S {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						i == 0                  // Top horizontal line
								|| i == n / 2           // Middle horizontal line
								|| i == n - 1            // Bottom horizontal line
								|| (j == 0 && i <= n / 2) // Left vertical line on top half
								|| (j == n - 1 && i >= n / 2) // Right vertical line on bottom half
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
