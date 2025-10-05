package Array;

import java.util.Scanner;

public class Print_Odd_Elements {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of the array
		System.out.print("Enter Size of Array: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Array to store integers

		// Step 2: Accept array elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 3: Display all elements entered by user
		System.out.println("Elements Entered are as below:");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		System.out.println();

		// Step 4: Display only odd elements from the array
		System.out.println("Odd Elements in array are as below:");
		for (int k = 0; k < a.length; k++) {
			if (a[k] % 2 != 0) { // Check if number is not divisible by 2 → odd
				System.out.println(a[k]);
			}
		}

		// Step 5: Close scanner
		p.close();
	}
}
