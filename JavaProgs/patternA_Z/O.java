package patternA_Z;

public class O {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						(i > 0 && i < n - 1 && j == 0)     // Left vertical line
								|| (i > 0 && i < n - 1 && j == n-1) // Right vertical line
								|| (j > 0 && j < n - 1 && i == 0)  // Top horizontal line
								|| (j > 0 && j < n - 1 && i == n-1) // Bottom horizontal line
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
