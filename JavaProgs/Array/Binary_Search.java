// To perform binary search, the array must be sorted.
// This program works only when the array is sorted in ascending order.

package Array;

// Importing required classes
import java.util.Arrays;
import java.util.Scanner;

// Class declaration
public class Binary_Search {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Create Scanner object to take user input
		Scanner p = new Scanner(System.in);

		// Step 2: Input size of the array
		System.out.print("Enter Size Of Array: ");
		int n = p.nextInt();

		// Step 3: Declare an integer array of size 'n'
		int[] a = new int[n];

		// Step 4: Accept elements from the user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		// Step 5: Sort the array in ascending order (required for binary search)
		Arrays.sort(a);

		// Step 6: Ask the user for the element to be searched
		System.out.println();
		System.out.print("Enter the element to be found: ");
		int k = p.nextInt();

		// Step 7: Initialize binary search variables
		int l = 0;             // left index
		int h = a.length - 1;  // right index
		int c = 0;             // counter (to check if element is found)

		// Step 8: Perform binary search
		while (l <= h) {

			// Find the middle index
			int mid = (l + h) / 2;

			// Case 1: Element found at middle
			if (k == a[mid]) {
				c++;          // mark as found
				break;        // exit the loop
			}

			// Case 2: Search in right half (if key is greater than middle element)
			else if (k > a[mid]) {
				l = mid + 1;  // move left index to mid + 1
			}

			// Case 3: Search in left half (if key is smaller than middle element)
			else {
				h = mid - 1;  // move right index to mid - 1
			}
		}

		// Step 9: Print search result
		if (c > 0) {
			System.out.println(k + " is found in the array");
		} else {
			System.out.println(k + " is not found in the array");
		}

		// Step 10: Close Scanner to free resources
		p.close();
	}
}
