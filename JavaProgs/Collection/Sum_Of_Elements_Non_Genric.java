package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sum_Of_Elements_Non_Genric {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Step 1: Input the number of elements
		System.out.print("Enter the number of elements: ");
		int n = p.nextInt();

		// Step 2: Create a non-generic ArrayList (can store any Object)
		ArrayList al = new ArrayList();

		// Step 3: Read elements from user and add to the ArrayList
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			al.add(p.nextInt());  // Stores as Integer objects (auto-boxing)
		}

		// Step 4: Calculate the sum of elements
		int sum = 0;
		Iterator i = al.iterator();   // Using Iterator to traverse the list
		while (i.hasNext()) {
			sum = sum + (Integer) i.next(); // Casting Object to Integer
		}

		// Step 5: Display the sum
		System.out.println();
		System.out.println("Sum: " + sum);
	}
}
