package patternA_Z;

public class V {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						(j == 0 && i <= n / 2)         // Left upper diagonal
								|| (j == n - 1 && i <= n / 2)  // Right upper diagonal
								|| (i == 3 && (j == 1 || j == 3)) // Lower part of 'V' forming angled lines
								|| (i == 4 && j == 2)           // Bottom tip of 'V'
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

