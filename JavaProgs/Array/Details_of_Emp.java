// Package declaration – groups related classes under the 'Array' package
package Array;

import java.util.Scanner; // Import Scanner class for user input

// Main class to store and display details of multiple employees
public class Details_of_Emp {

	// Main method – program execution starts here
	public static void main(String[] args) {

		// Step 1: Create a Scanner object to read input from user
		Scanner p = new Scanner(System.in);

		// Step 2: Ask the user for the number of employees
		System.out.print("Enter Number of Employees: ");
		int n = p.nextInt();  // store user input
		System.out.println();

		// Step 3: Create an array of BluePrintEmp objects
		// This will hold 'n' employee details
		BluePrintEmp[] e = new BluePrintEmp[n];

		// Step 4: Input employee details one by one
		for (int i = 0; i < e.length; i++) {

			// Initialize each employee object
			e[i] = new BluePrintEmp();

			System.out.print("Enter Employee ID: ");
			int id = p.nextInt();

			System.out.print("Enter Employee Name: ");
			String nm = p.next();

			System.out.print("Enter Employee Salary: ");
			double sal = p.nextDouble();

			// Assign the values to the object fields
			e[i].id = id;
			e[i].nm = nm;
			e[i].sal = sal;

			System.out.println(); // for spacing between entries
		}

		// Step 5: Display details of all employees
		System.out.println("---------- Employee Details ----------");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]); // automatically calls toString() method from BluePrintEmp
		}
	}
}
