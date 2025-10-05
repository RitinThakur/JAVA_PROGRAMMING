package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DriverBook {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		ArrayList <Book> al=new ArrayList<Book>();
		al.add(new Book("Manual",001,1000));
		al.add(new Book("Sql",002,1200));
		al.add(new Book("Java",003,1500));
		al.add(new Book("Api",004,1500));
		al.add(new Book("Selenium",005,1500));

		for(Book b:al)
		{
			System.out.println(b);
		}
		System.out.println();
		System.out.print("Please Enter Name of book to remove: ");
		String bn=p.next();
		System.out.println();
		System.out.println("After Removing Book: ");

		Iterator<Book> i=al.iterator();
		while(i.hasNext())
		{
			Book bname = i.next();
			if(bname.Bookname.equalsIgnoreCase(bn))
			{
				i.remove();
			}
		}

		for(Book b:al)
		{
			System.out.println(b);
		}



	}
}
