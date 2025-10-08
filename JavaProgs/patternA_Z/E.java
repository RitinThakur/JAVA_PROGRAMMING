package patternA_Z;

public class E {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop for rows
			for (int j = 0; j < n; j++) { // Inner loop for columns

				// Conditions for printing '*'
				if (
						i == 0               // Top horizontal line
								|| j == 0            // Left vertical line
								|| i == n / 2        // Middle horizontal line
								|| i == n - 1        // Bottom horizontal line
				) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // Print space elsewhere
				}
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
