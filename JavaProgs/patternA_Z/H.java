package patternA_Z;

public class H {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern (height and width)

		for (int i = 0; i < n; i++) { // Outer loop → rows

			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						j == 0        // Left vertical line
								|| j == n - 1 // Right vertical line
								|| i == n / 2 // Middle horizontal line
				) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // Print space elsewhere
				}
			}
			System.out.println(); // Move to next line after each row
		}
	}
}
