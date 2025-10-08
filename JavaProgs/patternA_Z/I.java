package patternA_Z;

public class I {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern (height and width)

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						i == 0           // Top horizontal line
								|| i == n - 1    // Bottom horizontal line
								|| j == n / 2    // Middle vertical line
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
