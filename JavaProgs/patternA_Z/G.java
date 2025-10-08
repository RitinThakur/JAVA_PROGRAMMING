package patternA_Z;

public class G {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern (height and width)

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						i == 0 && j != 0 && j != n - 1         // Top horizontal line (excluding corners)
								|| j == 0 && i != 0 && i != n - 1      // Left vertical line (excluding corners)
								|| i == n - 1 && j != 0 && j <= n - 1  // Bottom horizontal line
								|| i >= n / 2 && j == n - 1 && i != n - 1 // Right vertical line (bottom half)
								|| i == n / 2 && j >= n / 2             // Middle horizontal line of 'G'
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
