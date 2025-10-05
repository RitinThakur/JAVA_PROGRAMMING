// WAJP (Write A Java Program) to print the missing elements
// from 1 to 10 in an integer array.

package Array;

public class Missing_Elements {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Declare and initialize the array with some values
		int[] a = {1, 5, 3, 7, 10};

		// Step 2: Loop through numbers 1 to 10 (expected range)
		for (int i = 1; i <= 10; i++) {

			int c = 0; // counter to check if the number exists in the array

			// Step 3: Check if current number 'i' is present in the array
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {  // if the number is found
					c++;          // increment counter
					break;        // no need to check further, break inner loop
				}
			}

			// Step 4: If counter is still 0, the number is missing
			if (c == 0)
				System.out.println(i);
		}
	}
}
