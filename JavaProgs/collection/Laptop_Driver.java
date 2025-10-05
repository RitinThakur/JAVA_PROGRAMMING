package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Laptop_Driver {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Step 1: Create an ArrayList to store Laptop objects
		ArrayList<Laptop> al = new ArrayList<Laptop>();

		// Step 2: Input number of laptops from the user
		System.out.print("Enter Number of Laptops to be Entered: ");
		int n = p.nextInt();

		// Step 3: Loop to get laptop details and add them to ArrayList
		for(int i = 0; i < n; i++) {
			System.out.println("For " + (i + 1) + " Laptop");

			System.out.print("Enter Laptop id: ");
			int id = p.nextInt();

			System.out.print("Enter Laptop Brand: ");
			String brand = p.next();

			System.out.print("Enter Laptop Price: ");
			double price = p.nextDouble();
			System.out.println();

			// Create Laptop object and add to ArrayList
			al.add(new Laptop(id, brand, price));
		}

		// Step 4: Display laptops before sorting
		System.out.println("Before Sorting: ");
		for(Laptop l : al) {
			System.out.println(l);
		}

		// Step 5: Sort laptops based on compareTo() in Laptop class (by id)
		Collections.sort(al);

		// Step 6: Display laptops after sorting
		System.out.println();
		System.out.println("After Sorting: ");
		for(Laptop l : al) {
			System.out.println(l);
		}
	}
}
