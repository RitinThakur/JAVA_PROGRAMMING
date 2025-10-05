package NPTC;

public class Method_Overloading {
	public static void main(String[] args) {
		// Call the add method with 2 arguments
		System.out.println(add(10, 20)); // Output: 30

		// Call the add method with 3 arguments
		System.out.println(add(10, 20, 30)); // Output: 60
	}

	// Method to add 2 integers
	public static int add(int a, int b) {
		return a + b;
	}

	// Overloaded method to add 3 integers
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}
