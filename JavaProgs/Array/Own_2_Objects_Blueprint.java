package Array;

import java.util.Objects;

// Class representing a product with ID and Price
// Implements Comparable interface for sorting by price
public class Own_2_Objects_Blueprint implements Comparable {

	int p_id;       // Product ID
	double p_price; // Product Price

	// Constructor to initialize Product ID and Price
	public Own_2_Objects_Blueprint(int p_id, double p_price) {
		super();
		this.p_id = p_id;
		this.p_price = p_price;
	}

	// Override toString() method to display object details in readable format
	@Override
	public String toString() {
		return "Own_2_Objects_Blueprint [p_id=" + p_id + ", p_price=" + p_price + "]";
	}

	// Override hashCode() method for hashing purposes
	// Ensures objects can be used correctly in hash-based collections (like HashMap, HashSet)
	@Override
	public int hashCode() {
		return Objects.hash(p_id, p_price);
	}

	// Override equals() method to compare two objects based on their p_id and p_price
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // If both references point to the same object
			return true;
		if (obj == null) // If the other object is null
			return false;
		if (getClass() != obj.getClass()) // Check if both objects are of same class
			return false;
		Own_2_Objects_Blueprint other = (Own_2_Objects_Blueprint) obj;
		// Compare product ID and price
		return p_id == other.p_id && Double.doubleToLongBits(p_price) == Double.doubleToLongBits(other.p_price);
	}

	// Implement compareTo() method from Comparable interface
	// Allows objects to be compared and sorted by price
	@Override
	public int compareTo(Object o) {
		Own_2_Objects_Blueprint p = (Own_2_Objects_Blueprint) o;
		if (this.p_price > p.p_price)      // Current object's price is higher
			return 1;
		else if (this.p_price < p.p_price) // Current object's price is lower
			return -1;
		else                               // Prices are equal
			return 0;
	}
}
