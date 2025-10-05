package NPTC;

public class C extends A implements B {
	public static void main(String[] args) {
		// Accessing static members from superclass and interface
		System.out.println(a + b); // prints 30
	}
}
