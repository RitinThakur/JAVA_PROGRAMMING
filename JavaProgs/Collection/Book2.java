package Collection;

public class Book2 implements Comparable {

	// Step 1: Declare properties of the Book2 class
	String name;   // Name of the book
	int id;        // Unique identifier for the book
	double price;  // Price of the book

	// Step 2: Default constructor
	Book2() {
	}

	// Step 3: Parameterized constructor to initialize Book2 objects
	public Book2(int id, String name, double price) {
		super();  // Calls Object class constructor (optional)
		this.name = name;
		this.id = id;
		this.price = price;
	}

	// Step 4: Override toString() for readable object representation
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price;
	}

	// Step 5: Implement compareTo() method from Comparable interface
	// This allows sorting of Book2 objects based on price
	public int compareTo(Object o) {
		Book2 b = (Book2) o;

		if (this.price > b.price)   // Current object price greater
			return 1;
		else if (this.price < b.price)  // Current object price smaller
			return -1;
		else                        // Prices are equal
			return 0;
	}
}
