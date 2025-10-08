package patternA_Z;

public class F {
	public static void main(String[] args) {
		int n = 5; // Size of the pattern

		for (int i = 0; i < n; i++) { // Outer loop for rows
			for (int j = 0; j < n; j++) { // Inner loop for columns

				// Conditions to print '*'
				if (
						i == 0       // Top horizontal line
								|| j == 0    // Left vertical line
								|| i == n / 2 // Middle horizontal line
				) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // Print spaces elsewhere
				}
			}
			System.out.println(); // Move to next line after each row
		}
	}
}
