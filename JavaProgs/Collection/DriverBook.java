package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DriverBook {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);

		// Step 1: Create an ArrayList to store Book objects
		ArrayList<Book> al = new ArrayList<Book>();

		// Step 2: Add some pre-defined Book objects to ArrayList
		al.add(new Book("Manual", 001, 1000));
		al.add(new Book("Sql", 002, 1200));
		al.add(new Book("Java", 003, 1500));
		al.add(new Book("Api", 004, 1500));
		al.add(new Book("Selenium", 005, 1500));

		// Step 3: Display all books before removal
		System.out.println("Books in the library:");
		for (Book b : al) {
			System.out.println(b);
		}

		System.out.println();

		// Step 4: Take input from user to remove a book by name
		System.out.print("Please Enter Name of book to remove: ");
		String bn = p.next();
		System.out.println();

		// Step 5: Remove book from ArrayList using Iterator
		System.out.println("After Removing Book: ");
		Iterator<Book> i = al.iterator();
		while (i.hasNext()) {
			Book bname = i.next();
			// Compare book names ignoring case
			if (bname.Bookname.equalsIgnoreCase(bn)) {
				i.remove();  // Safe removal during iteration
			}
		}

		// Step 6: Display all books after removal
		for (Book b : al) {
			System.out.println(b);
		}
	}
}
