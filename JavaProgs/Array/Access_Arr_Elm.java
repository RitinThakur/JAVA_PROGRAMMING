// Package declaration – helps organize related classes into folders
package Array;

// Class declaration – name of the class should start with a capital letter
public class Access_Arr_Elm {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Array Declaration and Initialization
		// Creating an integer array 'a' with 6 elements
		int[] a = {10, 20, 30, 40, 50, 60};

		// Step 2: Accessing Array Elements using For Loop
		// Loop starts from index 0 and runs until the last index (a.length - 1)
		for (int i = 0; i < a.length; i++) {

			// Printing each element of the array one by one
			System.out.println(a[i]);
		}
	}
}
