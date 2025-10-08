package patternA_Z;

public class K {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						j == 0                     // Left vertical line
								|| (i + j == n - 2 && i <= n / 2) // Upper diagonal of 'K'
								|| (i == j + 1 && i >= n / 2)     // Lower diagonal of 'K'
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
