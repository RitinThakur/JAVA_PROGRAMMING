package MultiDimensions;

public class Print2DArrayElements {
	public static void main(String[] args) {
		// Declaring and initializing a 2D jagged array
		// Note: Jagged array means each row can have different number of columns
		int [][] a = {{1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9}};

		// Outer loop traverses the rows of the 2D array
		for(int i = 0; i < a.length; i++) {
			// Inner loop traverses the columns/elements in the current row
			for(int j = 0; j < a[i].length; j++) {
				// Print each element followed by a space
				System.out.print(a[i][j] + " ");
			}
			// Move to next line after printing all elements of a row
			System.out.println();
		}
	}
}

