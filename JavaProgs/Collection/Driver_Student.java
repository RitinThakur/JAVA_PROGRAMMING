package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver_Student {
	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Create an ArrayList to store Student objects
		ArrayList<Student> sa = new ArrayList<Student>();

		// Step 2: Input number of students
		System.out.print("Enter Number of Students: ");
		int n = p.nextInt();

		// Step 3: Input details for each student and add to ArrayList
		for(int i = 0; i < n; i++) {
			System.out.print("Enter Student id: ");
			int id = p.nextInt();

			System.out.print("Enter Name: ");
			String nm = p.next();

			System.out.print("Enter Contact number: ");
			long cno = p.nextLong();

			System.out.println();

			// Add the new Student object to ArrayList
			sa.add(new Student(id, nm, cno));
		}

		// Step 4: Display student data using Iterator
		System.out.println("Student data as follows (using Iterator):");
		Iterator<Student> i = sa.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println();

		// Step 5: Display student data using enhanced for loop (for-each)
		System.out.println("Student data as follows (using for-each loop):");
		for(Student s : sa) {
			System.out.println(s);
		}
	}
}
