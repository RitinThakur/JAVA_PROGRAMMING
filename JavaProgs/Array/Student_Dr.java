package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Dr {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept number of students
		System.out.print("Enter number of students: ");
		int num = p.nextInt();

		// Step 2: Create an array of Student_Blueprint objects
		Student_Blueprint[] d = new Student_Blueprint[num];
		System.out.println();

		// Step 3: Accept details of each student
		for (int i = 0; i < d.length; i++) {
			System.out.println("Enter details of " + (i + 1) + " Student");

			System.out.print("Enter Student id: ");
			int id = p.nextInt();

			System.out.print("Enter Student name: ");
			String nm = p.next();

			System.out.print("Enter Student age: ");
			int age = p.nextInt();

			// Create new Student_Blueprint object
			d[i] = new Student_Blueprint(id, nm, age);
			System.out.println();
		}

		// Step 4: Display students before sorting
		System.out.println("Before Sorting:");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		// Step 5: Sort students using Arrays.sort() (sorts by ID because of compareTo)
		Arrays.sort(d);
		System.out.println();

		// Step 6: Display students after sorting
		System.out.println("After Sorting:");
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		// Step 7: Close scanner
		p.close();
	}
}
