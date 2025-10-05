package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Own_Object_Dr {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept number of products from user
		System.out.print("Enter number of products: ");
		int num = p.nextInt();

		// Step 2: Create an array to store Own_2_Objects_Blueprint objects
		Own_2_Objects_Blueprint[] d = new Own_2_Objects_Blueprint[num];
		System.out.println();

		// Step 3: Accept product details (ID and Price) from user
		for (int i = 0; i < d.length; i++) {
			System.out.println("Enter details of " + (i + 1) + " Product");

			System.out.print("Enter Product id: ");
			int id = p.nextInt();

			System.out.print("Enter Product Price: ");
			double price = p.nextDouble();

			// Create a new object and store in array
			d[i] = new Own_2_Objects_Blueprint(id, price);
			System.out.println();
		}

		// Step 4: Display all products before sorting
		System.out.println("Before Sorting: ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		// Step 5: Sort the array based on product price
		Arrays.sort(d); // Uses compareTo() method from Own_2_Objects_Blueprint

		System.out.println("\nAfter Sorting: ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		// Step 6: Close Scanner
		p.close();
	}
}
