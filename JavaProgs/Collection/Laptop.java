package Collection;

public class Laptop implements Comparable {

	// Step 1: Declare instance variables
	int id;          // Laptop ID
	String brand;    // Laptop Brand Name
	double price;    // Laptop Price

	// Step 2: Constructor to initialize Laptop objects
	public Laptop(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	// Step 3: Override toString() method for easy printing
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

	// Step 4: Implement compareTo() method for sorting
	@Override
	public int compareTo(Object o) {
		Laptop l = (Laptop) o;
		if (this.id > l.id)      // If current laptop's id is greater
			return 1;
		else if (this.id < l.id) // If current laptop's id is smaller
			return -1;
		else                     // If IDs are equal
			return 0;
	}

}
