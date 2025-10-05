package NPTC;

import java.util.Scanner;

public class Freq {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Ask user for the size of the array
		System.out.print("Enter size of array: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Create an integer array of size n

		// Read values from user and store them in the array
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter Value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Ask user for the element whose frequency is to be calculated
		System.out.print("Enter the Element to be Found: ");
		int n2 = p.nextInt();

		int c = 0; // Counter to keep track of occurrences

		// Loop through the array to count the occurrences of n2
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n2) {
				c++; // Increment counter if element matches n2
			}
		}

		// Display the frequency of the element
		System.out.println("Frequency of " + n2 + " is " + c);
	}
}
