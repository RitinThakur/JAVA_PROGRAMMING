package Array;

import java.util.Scanner;

public class Read_Arr_and_disp {

	public static void main(String[] args) {

		Scanner p = new Scanner(System.in);

		// Step 1: Accept number of elements from user
		System.out.print("Enter Number Of values you want to enter: ");
		int n = p.nextInt();

		int[] a = new int[n]; // Array to store integers

		// Step 2: Read array elements from user
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value: ");
			a[i] = p.nextInt();
		}

		System.out.println();

		// Step 3: Display all array elements
		System.out.println("Values Entered are as below:");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		// Step 4: Close scanner
		p.close();
	}
}
