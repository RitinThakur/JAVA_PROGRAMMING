package pattern;

public class P43 {
	public static void main(String[] args) {
		int rows = 5;    // Total number of rows for each letter
		int cols = 20;   // Total number of columns for the grid

		// Loop for each row
		for (int i = 0; i < rows; i++) {
			// Loop for each column in the row
			for (int j = 0; j < cols; j++) {

				/*
				 * Letter "J" pattern logic:
				 * Each row (i) and column (j) combination is checked using conditions.
				 * If the condition is true, print "*", otherwise print a space " ".
				 */

				if ((i == 0 && (j == 0 || j == 1 || j == 2 || j == 3 || j == 4
						|| j == 6 || j == 7 || j == 8 || j == 10
						|| j == 14 || j == 16 || j == 17 || j == 18)) ||
						(i == 1 && (j == 2 || j == 5 || j == 9 || j == 10 || j == 14 || j == 15 || j == 19)) ||
						(i == 2 && (j == 2 || j == 5 || j == 6 || j == 7 || j == 8 || j == 9 || j == 10
								|| j == 14 || j == 15 || j == 16 || j == 17 || j == 18 || j == 19)) ||
						(i == 3 && (j == 2 || j == 5 || j == 9 || j == 11 || j == 13 || j == 15 || j == 19)) ||
						(i == 4 && (j == 0 || j == 1 || j == 2 || j == 5 || j == 9 || j == 12 || j == 15 || j == 19))) {
					System.out.print("*");
				} else {
					System.out.print(" ");  // Space for positions without "*"
				}
			}
			System.out.println(); // Move to next row after finishing current row
		}
	}
}
