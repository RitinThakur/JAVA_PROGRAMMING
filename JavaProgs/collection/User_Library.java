package collection;

public class User_Library {
	public static void main(String[] args) {
		// Step 1: Create a Library object
		Library l = new Library();

		// Step 2: Add books to the library
		l.addBook(new Book2(01, "MANUAL", 30));
		l.addBook(new Book2(02, "JAVA", 40));
		l.addBook(new Book2(03, "SQL", 50));
		l.addBook(new Book2(04, "SELENIUM JAVA", 60));
		l.addBook(new Book2(05, "PROJECT", 70));
		l.addBook(new Book2(06, "PROGRAMMING", 80));
		l.addBook(new Book2(07, "SELENIUM PY", 90));

		// Step 3: Display all books in the library
		l.display();

		// Step 4: Remove specific books using different criteria
		l.removeBook(2);           // Remove book with id = 2
		l.removeBook("PROGRAMMING"); // Remove book with name = "PROGRAMMING"
		l.removeBook(30.0);        // Remove book with price = 30.0

		System.out.println();

		// Step 5: Display updated list of books after removal
		l.display();
	}
}
