// Package declaration – used to group related classes together
package Array;

// Importing Scanner class for user input
import java.util.Scanner;

// Class declaration
public class Add_particular_Index {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Create Scanner object to take user input
		Scanner p = new Scanner(System.in);

		// Step 1: Take array size from user
		System.out.println("Enter the size of the array");
		int n = p.nextInt();

		// Step 2: Create an integer array of size 'n'
		int[] a = new int[n];

		// Step 3: Accept 'n' elements from the user
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = p.nextInt();
		}

		// Step 4: Ask user for the index where they want to insert new element
		System.out.println("Enter the index (0 to " + a.length + "):");
		int index = p.nextInt();

		// Step 5: Ask user for the element to insert
		System.out.println("Enter the element:");
		int element = p.nextInt();

		// Step 6: Call 'add()' method to insert element and get new array
		int[] res = add(a, index, element);

		// Step 7: Print the updated array
		System.out.println("Updated array after insertion:");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

		// Close the scanner to avoid memory leaks
		p.close();
	}

	// Method to insert an element at a particular index in the array
	public static int[] add(int[] a, int index, int element) {

		// Step 1: Validate index
		if (index < 0 || index > a.length) {
			System.out.println("Index out of range");
			return a; // Return original array if invalid index
		}

		// Step 2: Create a new array with one extra space
		int[] res = new int[a.length + 1];

		// Step 3: Insert the new element at the given index
		res[index] = element;

		// Step 4: Copy elements from old array to new array
		for (int i = 0; i < a.length; i++) {

			// Case 1: Before insertion index – copy elements as-is
			if (i < index) {
				res[i] = a[i];
			}

			// Case 2: After insertion index – shift elements by one position
			else {
				res[i + 1] = a[i];
			}
		}

		// Step 5: Return the updated array
		return res;
	}
}
