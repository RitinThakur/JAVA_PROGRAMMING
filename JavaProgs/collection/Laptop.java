package collection;

import java.util.Objects;

public class Laptop implements Comparable {
	int id;
	String brand;
	double price;
	public Laptop(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

	public int compareTo(Object o) {
		Laptop l=(Laptop) o;
		if(this.id>l.id)
			return 1;
		else if(this.id<l.id)
			return -1;
		else
			return 0;
	}

}