package MultiDimensions;

public class TwoDArrayInfo {
	public static void main(String[] args) {
		// Declaring a 2D array with 4 rows and 3 columns
		int  [][] a = new int[4][3];

		System.out.println(a);
		// Prints the memory address of the 2D array object

		System.out.println(a.length);
		// Prints the number of rows in the array
		// Output: 4

		System.out.println(a[0]);
		// Prints the memory address of the first row (1D array)

		System.out.println(a[1]);
		// Prints the memory address of the second row

		System.out.println(a[2]);
		// Prints the memory address of the third row

		System.out.println(a[0].length);
		// Prints the number of elements in row 0
		// Output: 3

		System.out.println(a[1].length);
		// Prints the number of elements in row 1
		// Output: 3

		System.out.println(a[2].length);
		// Prints the number of elements in row 2
		// Output: 3
	}
}
