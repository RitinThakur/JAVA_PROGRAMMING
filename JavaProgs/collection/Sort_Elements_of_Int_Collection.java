package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_Elements_of_Int_Collection {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Step 1: Read number of elements from user
		System.out.print("Enter Number of elements to be added: ");
		int n = p.nextInt();

		// Step 2: Create an ArrayList to store Integer values
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Step 3: Read elements from user and add to ArrayList
		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + (i + 1) + " value: ");
			al.add(p.nextInt());
		}

		// Step 4: Display the ArrayList before sorting
		System.out.println();
		System.out.print("Before sorting: ");
		System.out.println(al);

		// Step 5: Sort the ArrayList using Collections.sort()
		Collections.sort(al);

		// Step 6: Display the ArrayList after sorting
		System.out.print("After Sorting:  ");
		System.out.println(al);
	}
}
