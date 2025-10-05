package NPTC;

public class Demo {

	public static void main(String[] args) {
		int a; // Local variable declared but not initialized

		System.out.println("hi");     // Prints "hi" to the console
		System.out.println("ritin");  // Prints "ritin" to the console

		// System.out.println(a);
		// ❌ Uncommenting this line would cause a compile-time error
		// because local variable 'a' is declared but not initialized.

		// thakur();
		// ❌ This line would call the private static method 'thakur'
		// but currently it does nothing (method stub).
	}

	private static void thakur() {
		// This is a private static method stub
		// It can be implemented later with required logic
	}

}
