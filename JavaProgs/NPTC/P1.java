package NPTC;

public class P1 {
	public static void main(String[] args) {
		// Print some empty lines for spacing in console output
		System.out.println("");
		System.out.println("");
		System.out.println("");

		// Create an object of the Emp class and set its salary to 10000.0
		Emp obj = new Emp(10000.0);

		// Use the getter method to retrieve the salary and print it
		System.out.println("Salary is: " + obj.getSal());
	}
}
