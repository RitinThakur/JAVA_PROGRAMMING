package pattern;

public class P44 {
	public static void main(String[] args) {
		int n = 5;  // Size of each letter

		// Loop for each row
		for (int i = 0; i < n; i++) {

			// ==========================
			// Letter J
			// ==========================
			for (int j = 0; j < n; j++) {
				/*
				 * Print '*' for J:
				 * Top horizontal line: i==0
				 * Middle vertical line: j==n/2
				 * Bottom curve: i==n-1 && j<=n/2
				 */
				if (i == 0 || j == n / 2 || (i == n - 1 && j <= n / 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("  "); // Space between letters

			// ==========================
			// Letter A
			// ==========================
			for (int j = 0; j < n; j++) {
				/*
				 * Print '*' for A:
				 * Top horizontal line: i==0
				 * Vertical sides: j==0 or j==n-1
				 * Middle horizontal line: i==n/2
				 */
				if (i == 0 || j == 0 || i == n / 2 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("  "); // Space between letters

			// ==========================
			// Letter V
			// ==========================
			for (int j = 0; j < n; j++) {
				/*
				 * Print '*' for V:
				 * Left diagonal: j==0 && i<=n/2
				 * Right diagonal: j==n-1 && i<=n/2
				 * Bottom tip: i==n-1 && j==n/2 (optional for small n)
				 */
				if ((j == 0 && i <= n / 2) || (j == n - 1 && i <= n / 2) || (i == 3 && j == 1)
						|| (i == 3 && j == 3) || (i == 4 && j == 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("  "); // Space between letters

			// ==========================
			// Letter A (again)
			// ==========================
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n / 2 || j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println(); // Move to next row
		}
	}
}
