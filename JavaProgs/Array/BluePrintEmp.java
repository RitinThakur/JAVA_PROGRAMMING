// Package declaration – groups related classes under the 'Array' package
package Array;

// Class declaration – defines a blueprint for Employee objects
public class BluePrintEmp {

	// Instance variables (fields) – represent the properties of an Employee
	int id;        // Employee ID
	String nm;     // Employee name
	double sal;    // Employee salary

	// -------------------------------
	// Default constructor
	// -------------------------------
	// This constructor is invoked when no arguments are passed
	// It initializes the object with default values (0, null, 0.0)
	BluePrintEmp() {
		// Default constructor body can be empty or contain custom defaults
	}

	// -------------------------------
	// Parameterized constructor
	// -------------------------------
	// Used to initialize the object with specific values
	BluePrintEmp(int id, String nm, double sal) {
		// 'this' keyword differentiates instance variables from parameters
		this.id = id;
		this.nm = nm;
		this.sal = sal;
	}

	// -------------------------------
	// Overriding toString() method
	// -------------------------------
	// This method defines how the object will be represented as a String
	// It prints the employee details and returns an empty string
	public String toString() {
		System.out.println("id: " + id);
		System.out.println("name: " + nm);
		System.out.println("salary: " + sal);
		System.out.println(); // adds a blank line for readability
		return "";
	}
}
