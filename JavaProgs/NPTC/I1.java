package NPTC;

public interface I1 {

	// Main method inside an interface (allowed in Java 8 and later)
	public static void main(String[] args) {
		System.out.println("Interface in main method");

		// Calling a static method defined in the interface
		test();
	}

	// Static method in interface (Java 8 onwards allows static methods)
	public static void test() {
		System.out.println("static method in interface");
	}

}
