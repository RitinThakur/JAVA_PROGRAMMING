package collection;

import java.util.Objects;

public class Book {
	String Bookname;
	int Bookid;
	double Bookprice;

	public Book(String bookname, int bookid, double bookprice) {
		super();
		Bookname = bookname;
		Bookid = bookid;
		Bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [Bookname=" + Bookname + ", Bookid=" + Bookid + ", Bookprice=" + Bookprice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Bookid, Bookname, Bookprice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Bookid == other.Bookid && Objects.equals(Bookname, other.Bookname)
				&& Double.doubleToLongBits(Bookprice) == Double.doubleToLongBits(other.Bookprice);
	}

}
