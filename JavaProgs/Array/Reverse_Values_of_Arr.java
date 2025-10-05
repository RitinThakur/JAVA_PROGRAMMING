package Array;

import java.util.Scanner;

public class Reverse_Values_of_Arr {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept size of the array
		System.out.print("Enter Size of array: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Array to store elements

		// Step 2: Accept array elements from user
		for (int k = 0; k < a.length; k++) {
			System.out.print("Enter value: ");
			a[k] = p.nextInt();
		}

		System.out.println();

		// Step 3: Reverse array in place using two-pointer technique
		int i = 0, j = a.length - 1; // i → start, j → end
		for (; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		// Step 4: Display reversed array
		System.out.println("Reversed Array as below:");
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

		// Step 5: Close scanner
		p.close();
	}
}
