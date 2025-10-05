package collection;

public class Book2 implements Comparable {
	String name;
	int id;
	double price;

	Book2()
	{
	}

	public Book2(int id,String name, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id +", name=" + name +  ", price=" + price;
	}

	public int compareTo(Object o)
	{
		Book2 b=(Book2) o;
		if(this.price>b.price)
			return 1;
		else if(this.price<b.price)
			return -1;
		else
			return 0;
	}
}