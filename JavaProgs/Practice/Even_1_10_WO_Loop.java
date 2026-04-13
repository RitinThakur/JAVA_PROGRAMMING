package Practice;

public class Even_1_10_WO_Loop {
	public static void main(String[] args) {
		// Start recursive function from number 1
		eNum(1);
	}

	// Recursive method to print even numbers from 1 to 10
	public static void eNum(int n) {

		// Base condition: run only while n is <= 10
		if (n <= 10) {

			// Check if the number is even
			if (n % 2 == 0) {
				System.out.println(n);  // Print even number
			}

			// Recursive call to process the next number
			eNum(n + 1);
		}
	}
}
