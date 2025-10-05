package MultiDimensions;

public class JaggedArrayInfo {
	public static void main(String[] args) {
		// Declaring and initializing a jagged 2D array
		// Each row can have a different number of columns
		int [][] a = {{1,2,3,4}, {4,5,6}, {7,8,9}};

		System.out.println(a);
		// Prints the memory address of the 2D array object

		System.out.println(a.length);
		// Prints the number of rows in the array
		// Output: 3 (3 rows in total)

		System.out.println(a[0].length);
		// Prints the number of elements in row 0
		// Output: 4

		System.out.println(a[1].length);
		// Prints the number of elements in row 1
		// Output: 3

		System.out.println(a[2].length);
		// Prints the number of elements in row 2
		// Output: 3
	}
}
