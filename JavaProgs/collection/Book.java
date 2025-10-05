package collection;

import java.util.Objects;

public class Book {

	// Step 1: Declare properties of the Book
	String Bookname;
	int Bookid;
	double Bookprice;

	// Step 2: Constructor to initialize Book object
	public Book(String bookname, int bookid, double bookprice) {
		super();  // Calls the Object class constructor (optional)
		Bookname = bookname;
		Bookid = bookid;
		Bookprice = bookprice;
	}

	// Step 3: Override toString() method to print Book details
	@Override
	public String toString() {
		return "Book [Bookname=" + Bookname + ", Bookid=" + Bookid + ", Bookprice=" + Bookprice + "]";
	}

	// Step 4: Override hashCode() method
	// This is necessary when using Book objects in Hash-based collections (HashSet, HashMap)
	@Override
	public int hashCode() {
		return Objects.hash(Bookid, Bookname, Bookprice);
	}

	// Step 5: Override equals() method
	// This allows comparison of Book objects based on content, not memory reference
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  // Check if both references are same
			return true;
		if (obj == null)  // Check for null
			return false;
		if (getClass() != obj.getClass())  // Ensure the object is of type Book
			return false;
		Book other = (Book) obj;
		// Compare bookId, bookName, and bookPrice for equality
		return Bookid == other.Bookid && Objects.equals(Bookname, other.Bookname)
				&& Double.doubleToLongBits(Bookprice) == Double.doubleToLongBits(other.Bookprice);
	}
}
