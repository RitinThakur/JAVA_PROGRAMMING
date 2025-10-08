package patternA_Z;

public class U {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						j == 0          // Left vertical line
								|| j == n - 1    // Right vertical line
								|| i == n - 1    // Bottom horizontal line
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
