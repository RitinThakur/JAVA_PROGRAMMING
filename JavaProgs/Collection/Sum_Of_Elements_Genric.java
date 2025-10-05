package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Elements_Genric {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Step 1: Input the number of elements
		System.out.print("Enter the number of elements: ");
		int n = p.nextInt();

		// Step 2: Create a generic ArrayList to store Integer elements
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Step 3: Read elements from user and add to the ArrayList
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			al.add(p.nextInt());
		}

		// Step 4: Calculate the sum of elements
		int sum = 0;
		for (Integer o : al) {
			sum = sum + o;          // Auto-unboxing Integer to int
			// sum = sum + (Integer)o; // Optional, also works the same
		}

		// Step 5: Display the sum
		System.out.println();
		System.out.println("Sum: " + sum);
	}
}
