package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

	// Step 1: Create an ArrayList to store Book2 objects
	ArrayList<Book2> al = new ArrayList<Book2>();

	// Step 2: Method to add a book to the library
	public void addBook(Book2 b) {
		al.add(b);
	}

	// Step 3: Method to remove a book by ID
	public void removeBook(int id) {
		for (int i = 0; i < al.size(); i++) {
			Book2 b2 = al.get(i);
			if (b2.id == id) {
				al.remove(b2);
				break; // Stop after removing to avoid ConcurrentModificationException
			}
		}
	}

	// Step 4: Method to remove a book by Price
	public void removeBook(double price) {
		for (int i = 0; i < al.size(); i++) {
			Book2 b2 = al.get(i);
			if (b2.price == price) {
				al.remove(b2);
				break; // Stop after removing
			}
		}
	}

	// Step 5: Method to remove a book by Name
	public void removeBook(String name) {
		for (int i = 0; i < al.size(); i++) {
			Book2 b2 = al.get(i);
			if (b2.name.equals(name)) {
				al.remove(b2);
				break; // Stop after removing
			}
		}
	}

	// Step 6: Sort the books using compareTo() method of Book2 class (by price)
	public void sort() {
		Collections.sort(al);
	}

	// Step 7: Display all books in the library
	public void display() {
		for (Book2 b : al) {
			System.out.println(b);
		}
	}
}
