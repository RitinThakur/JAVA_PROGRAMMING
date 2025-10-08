package patternA_Z;

public class P {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop → rows
			for (int j = 0; j < n; j++) { // Inner loop → columns

				// Conditions to print '*'
				if (
						j == 0                      // Left vertical line
								|| (i == 0 && j <= n - 2)   // Top horizontal line
								|| (i == 1 && j == n - 1)   // Top-right corner of the loop
								|| (i == 2 && j <= n - 2)   // Middle horizontal line to complete the loop
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
